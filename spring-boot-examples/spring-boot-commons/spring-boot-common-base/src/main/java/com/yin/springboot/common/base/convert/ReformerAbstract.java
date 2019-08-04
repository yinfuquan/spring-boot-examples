package com.yin.springboot.common.base.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/2
 * Time: 10:52
 * To change this template use File | Settings | File Templates.
 */
public abstract class ReformerAbstract<T,V> implements IReformer<T,V> {

    @Override
    public List<V> convertToList(List<T> ts){
        List<V> vs=new ArrayList<>();
        for (T t : ts) {
            vs.add(convert(t));
        }
        return  vs;
    };

}
