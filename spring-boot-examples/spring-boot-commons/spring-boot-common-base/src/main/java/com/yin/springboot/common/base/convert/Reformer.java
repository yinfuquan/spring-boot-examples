package com.yin.springboot.common.base.convert;

import org.springframework.beans.BeanUtils;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/2
 * Time: 9:08
 * To change this template use File | Settings | File Templates.
 */
public   class Reformer<T, V> extends  ReformerAbstract<T,V>{


    protected Class<V> v;


    public Reformer(Class<V> v) {
        this.v = v;
    }

    @Override
    public V convert(T t) {
        V vo=null;
        try {
           vo= v.getDeclaredConstructor().newInstance();
           BeanUtils.copyProperties(t,vo);
        } catch (Exception e) {
            throw new RuntimeException("对象转化失败");
        }
        return vo;
    }


}
