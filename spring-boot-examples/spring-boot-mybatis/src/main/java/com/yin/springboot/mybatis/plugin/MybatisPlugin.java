package com.yin.springboot.mybatis.plugin;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.util.List;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/14
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
//@Intercepts({@Signature(
//        type = Executor.class,
//        method = "query",
//        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}
//), @Signature(
//        type = Executor.class,
//        method = "query",
//        args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class}
//)})


@Intercepts({@Signature(
        type = StatementHandler.class,
        method = "prepare",
        args = {Connection.class, Integer.class}
)})

public class MybatisPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {


        //方法一

//
//
//        Object[] args = invocation.getArgs();
//        MappedStatement ms = (MappedStatement)args[0];
//        Object parameter = args[1];
//        RowBounds rowBounds = (RowBounds)args[2];
//        ResultHandler resultHandler = (ResultHandler)args[3];
//        Executor executor = (Executor)invocation.getTarget();
//        CacheKey cacheKey;
//        BoundSql boundSql;
//        if (args.length == 4) {
//            boundSql = ms.getBoundSql(parameter);
//            cacheKey = executor.createCacheKey(ms, parameter, rowBounds, boundSql);
//        } else {
//            cacheKey = (CacheKey)args[4];
//            boundSql = (BoundSql)args[5];
//        }
//
//
//
//        String sql = boundSql.getSql();
//
//        System.out.println(sql);
//        setSql(boundSql,sql+"   limit 2 ");
//        System.out.println(boundSql.getSql());
//        return executor.query(ms, parameter, rowBounds, new MyResultHandler(), cacheKey, boundSql);


       //方法二

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();

        BoundSql boundSql = statementHandler.getBoundSql();
        String sql=boundSql.getSql();


        setSql(boundSql,sql+" limit 2");

       return  invocation.proceed();

    }
   private Field getFiledByName(Object object,String name){
       Field field = ReflectionUtils.findField(object.getClass(), name);
       if( null != field){
           ReflectionUtils.makeAccessible(field);
       }
       return  field;
    }

    private void setSql(BoundSql boundSql, String sql) throws IllegalAccessException {

        Field field = ReflectionUtils.findField(boundSql.getClass(), "sql");
        ReflectionUtils.makeAccessible(field);
        field.set(boundSql,sql);

    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
