package com.yin.zk;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.CuratorWatcher;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.net.ssl.SSLServerSocket;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZkApplicationTests {


    @Autowired
    CuratorFramework curatorFramework;
    @Test
    public void contextLoads() throws Exception {

        curatorFramework.create().forPath("/m", "ss".getBytes());
        curatorFramework.create().creatingParentsIfNeeded().forPath("/d/d");
        curatorFramework.create().withMode(CreateMode.EPHEMERAL_SEQUENTIAL).forPath("/mm");
        curatorFramework.create().inBackground(new BackgroundCallback() {
            @Override
            public void processResult(CuratorFramework curatorFramework, CuratorEvent curatorEvent) throws Exception {
                System.out.println("我变化啦"+curatorEvent.getData()+curatorEvent.getPath()+curatorEvent.getType());
            }
        }).forPath("/back3","s".getBytes());


        byte[] bytes = curatorFramework.getData().usingWatcher(new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println(watchedEvent.getState() + watchedEvent.getPath());
            }
        }).forPath("/back");
        System.out.println(new String(bytes));
        curatorFramework.getData().usingWatcher(new CuratorWatcher() {
            @Override
            public void process(WatchedEvent watchedEvent) throws Exception {
                System.out.println(watchedEvent.getState() + watchedEvent.getPath());
            }
        }).forPath("/back");

        NodeCache nodeCache=new NodeCache(curatorFramework,"/back",true);
        nodeCache.getListenable().addListener(new NodeCacheListener() {
            @Override
            public void nodeChanged() throws Exception {
                System.out.println("wo ca lei");
            }
        });
        Thread.sleep(60000);
    }

}
