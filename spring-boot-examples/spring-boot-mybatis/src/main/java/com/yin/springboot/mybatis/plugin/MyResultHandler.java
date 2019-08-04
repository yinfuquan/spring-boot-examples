package com.yin.springboot.mybatis.plugin;

import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class MyResultHandler implements ResultHandler<Object> {

  private final List<Object> list;

  public MyResultHandler() {
    list = new ArrayList<Object>();
  }

  @SuppressWarnings("unchecked")
  public MyResultHandler(ObjectFactory objectFactory) {
    list = objectFactory.create(List.class);
  }

  @Override
  public void handleResult(ResultContext<? extends Object> context) {

    //  Field  createTime = context.getResultObject().getClass().getField("createTime");
      Field createTime = ReflectionUtils.findField(context.getResultObject().getClass(), "createTime");
      if(null != createTime){
        createTime.setAccessible(true);
        ReflectionUtils.setField(createTime,context.getResultObject(),new Date());
      }




    list.add(context.getResultObject());
  }

  public List<Object> getResultList() {
    return list;
  }

}
