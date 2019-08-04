package com.yin.springboot.common.utils.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClaims;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/23
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class JwtUtil {

//    private static String SECRET="secret";// 秘钥
//
//    private static long EXPIRATION_TIME=10000; //
//
//    public static String generateToken(String username) {
//        HashMap<String, Object> map = new HashMap<>();
//        // you can put any data in the map
//        map.put("username", username);
//        String jwt = Jwts.builder().setClaims(map).setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
//                .signWith(SignatureAlgorithm.HS256, SECRET).compact();
//        return jwt;
//    }
public static final String SUBJECT = "xdclass";

    public static final long EXPIRE = 1000*60*60*24*7;  //过期时间，毫秒，一周

    //秘钥
    public static final  String APPSECRET = "xd666";

    /**
     * 生成jwt
     * @param claims
     * @return
     */
        public static String geneJsonWebToken(DefaultClaims claims){
        if(claims == null ){
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT)
                .addClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();

        return token;
    }


    /**
     * 校验token
     * @param token
     * @return
     */
    public static Claims checkJWT(String token ){

        try{
            final Claims claims =  Jwts.parser().setSigningKey(APPSECRET).
                    parseClaimsJws(token).getBody();
            return  claims;

        }catch (Exception e){ }
        return null;

    }

//    public  static  boolean isSignatureValid(){
//
//
//    }
}
