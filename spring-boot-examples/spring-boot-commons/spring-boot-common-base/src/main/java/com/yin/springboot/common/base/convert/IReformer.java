package com.yin.springboot.common.base.convert;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/2
 * Time: 9:06
 * To change this template use File | Settings | File Templates.
 */
public interface IReformer< T,V> {

    V convert(T t);
    List<V> convertToList(List<T> t);

}
