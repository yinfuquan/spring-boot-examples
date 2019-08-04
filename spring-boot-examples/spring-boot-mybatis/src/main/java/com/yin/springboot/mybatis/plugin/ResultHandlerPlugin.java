package com.yin.springboot.mybatis.plugin;

import org.apache.ibatis.executor.resultset.DefaultResultSetHandler;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.*;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/15
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */

@Intercepts(@Signature(type = ResultSetHandler.class,method = "handleResultSets",args = {Statement.class}))
public class ResultHandlerPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        DefaultResultSetHandler handler= (DefaultResultSetHandler) invocation.getTarget();
        Object[] args = invocation.getArgs();

        Field resultHandler = getFiledByName(handler, "resultHandler");
        resultHandler.set(handler,new MyResultHandler());
        return handler.handleResultSets((Statement) args[0]);
    }


    private Field getFiledByName(Object object, String name){
        Field field = ReflectionUtils.findField(object.getClass(), name);
        if( null != field){
            ReflectionUtils.makeAccessible(field);
        }
        return  field;
    }
    @Override
    public Object plugin(Object target) {
            return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
