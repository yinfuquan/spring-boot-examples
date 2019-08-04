package com.yin.springboot.shiro.md5;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/30
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class SecretUtils {

    public  static  String encoding(String password,String salt){

        String md5Code = Md5Utils.getMd5Code(password + salt);

        return md5Code;

    }


}
