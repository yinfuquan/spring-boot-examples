package com.yin.springboot.mybatis.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yin.springboot.mybatis.plus.domain.Role;
import com.yin.springboot.mybatis.plus.domain.User;
import com.yin.springboot.mybatis.plus.mapper.RoleMapper;
import com.yin.springboot.mybatis.plus.mapper.UserMapper;
import com.yin.springboot.mybatis.plus.server.impl.UserServiceImpl;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisPlusApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    UserMapper userMapper;

    //----- 普通查询 ------
    @Test
    public void select() {

        //---------like------------
        List<User> c = userMapper.selectList(new QueryWrapper<User>().lambda().likeRight(User::getUsername, "c"));
    }

    /**
     * ----- 分页查询 ------
     * xml的sql只用在mapper接口多添加一个page参数，其他不用管
     */

    @Test
    public void page() {

        Page<User> page = new Page<>(1, 3);

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //  wrapper.lambda().eq(TUser::getUserId, 1);
        IPage<User> result = userMapper.selectPage(page, wrapper);
        System.out.println(result.getSize());
    }

    //----- 关联查询 ------
    @Test
    public void relect() {

        List<User> users = userMapper.selectList(new QueryWrapper<User>().lambda().inSql(User::getRoleId, "select id from tb_role r where r.id=38"));


        System.out.println(users.size());
    }

    /**
     * 批量处理,用service
     */
    @Resource
    private UserServiceImpl userService;

    @Test
    public void test11() {
//        userService.batchInsert();
//        userService.updateBatch();

    }

    /**
     * 逻辑删除
     * 加了这个，，其他查询 跟新啥的都会判断是不是逻辑删除了
     */

    @Test
    public void delect() {
        userMapper.delete(new QueryWrapper<User>().lambda().eq(User::getUsername, "cadminl"));
    }

    /**
     * 乐观锁
     * 仅支持 updateById(id) 与 update(entity, wrapper) 方法
     * 在 update(entity, wrapper) 方法下, wrapper 不能复用!!!
     */
    @Test
    public  void  lock(){

         Long id = 39L;
        int version = 1;

        User u = new User();
        u.setId(id);
        u.setVersion(version);
        u.setEmail("qq.com");
        if(userMapper.updateById(u)>0){
            System.out.println("Update successfully");
        }else{
            System.out.println("Update failed due to modified by others");
        }
    }

    @Resource
    private RoleMapper roleMapper;
    @Test
    public void  role(){

        Role role = roleMapper.selectById(39);
    }

    @Test
    public  void  testobject(){
        List<Object> objects = userMapper.selectObjs(null);

        System.out.println(objects.toString());
    }

    @Test
    public void  inserorupdate(){

        Long id = 39L;
        int version = 1;

        User u = new User();
        u.setUsername("cadminl");
        u.setPassword("$10$9ZhDOBp.sRKat4l14ygu/.LscxrMUcDAfeVOEPiYwbcRkoB09gCmi");
        u.setId(id);
        u.setVersion(version);
        u.setEmail("qq.com");
        u.setCreated(new Date());
        u.setUpdated(new Date());
        userMapper.insertOrUpdateSelective(u);

    }

    /**
     * sql拼装setSql
     *  SELECT
     *         id,
     *         username,
     *         password,
     *         phone,
     *         status,
     *         email,
     *         created,
     *         updated,
     *         role_id,
     *         version
     *     FROM
     *         tb_user
     *     WHERE
     *         status=0
     *         AND salt=10
     */
    @Test
    public  void sqlconcat(){
        Long id = 39L;
        int version = 1;

        User u = new User();
        u.setId(id);
        /**
         * 跟新
          */
      //  userMapper.update(u,new UpdateWrapper<User>().setSql("salt=10"));
        List<User> users = userMapper.selectList(new QueryWrapper<User>().apply("salt={0}", "10"));
        System.out.println("");
    }
}
