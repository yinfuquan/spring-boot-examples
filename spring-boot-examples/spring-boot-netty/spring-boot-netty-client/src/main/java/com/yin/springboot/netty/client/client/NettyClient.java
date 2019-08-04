package com.yin.springboot.netty.client.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.marshalling.MarshallingDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.ReferenceCountUtil;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/17
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
public class NettyClient {

    public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {

        EventLoopGroup group =new NioEventLoopGroup();
        Bootstrap bootstrap=new Bootstrap();
        bootstrap.group(group)
                .option(ChannelOption.TCP_NODELAY, true)
                .channel(NioSocketChannel.class).handler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel socketChannel) throws Exception {

                socketChannel.pipeline().addLast( new ClientHandler());

            }
        });

        //发起异步连接请求，绑定连接端口和host信息
        final ChannelFuture future = bootstrap.connect("127.0.0.1", 8066).sync();

        future.addListener(new ChannelFutureListener() {

            @Override
            public void operationComplete(ChannelFuture arg0) throws Exception {
                if (future.isSuccess()) {
                    System.out.println("连接服务器成功");
                    future.channel().writeAndFlush(Unpooled.copiedBuffer("holle".getBytes("UTF-8")));
                } else {
                    System.out.println("连接服务器失败");
                    future.cause().printStackTrace();
                    group.shutdownGracefully(); //关闭线程组
                }
            }
        });


        future.channel().writeAndFlush(Unpooled.copiedBuffer("holle".getBytes("UTF-8")));
     //   future.channel();
        Thread.sleep(10000);
      //  group.shutdownGracefully();
        future.channel().closeFuture().sync();


    }

}
