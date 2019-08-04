package com.yin.springboot.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yin.springboot.redis.utils.JedisUtils;
import com.yin.springbootbeetlsql.entity.UserPO;
import com.yin.springbootbeetlsql.repository.UserRepository;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisApplicationTests {



//    @Test
//    public void contextLoads() {
//
//        UserPO po=new UserPO();
//
//        po.setId(999107769460064256L);
//        List<UserPO> template = UserPO.Dao.$.template(po);
//        System.out.println(template.get(0).getName());
//
//    }
//
//    @Test
//    public  void  test1() throws JsonProcessingException {
//        UserPO po=new UserPO();
//
//        po.setId(999107769460064256L);
//        po.setName("yin");
//        Jedis jedis = JedisUtils.getJedis();
//
//        ObjectMapper objectMapper=new ObjectMapper();
//        String s = objectMapper.writeValueAsString(po);
//        System.out.println(s);
//        String set = jedis.set("user:info", s);
//        System.out.println(set);
//
//    }
//    @Test
//    public  void  get() throws IOException {
//
//        String s = JedisUtils.getJedis().get("user:info");
//        System.out.println(s);
//
//        ObjectMapper objectMapper=new ObjectMapper();
//        UserPO po = objectMapper.readValue(s, UserPO.class);
//        System.out.println("");
//    }
//
//    @Test
//    public  void  test2(){
//        String s = JedisUtils.getJedis().get("hahah::999107769460064256");
//        System.out.println(s);
//
//    }

    @Test
    public  void  tttt(){
        JedisUtils.JEDIS.set("ket:12:45:p","4444");
        String ket = JedisUtils.JEDIS.get("ket:12:45:p");
        System.out.println(ket);
    }
}
