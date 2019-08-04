package com.yin.springbootbeetlsql;

import com.yin.springbootbeetlsql.entity.UserPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBeetlsqlApplicationTests {

    @Test
    public void contextLoads() {
        UserPO po=new UserPO();

        po.setId(999107769460064256L);
        List<UserPO> template = UserPO.Dao.$.template(po);
        System.out.println(template.get(0).getName());
    }


    @Test
    public  void uuid(){


        System.out.println(UUID.randomUUID().toString().substring(0,32).length());

    }

}
