package com.yin.springbootswagger.ctl;

import com.yin.springbootswagger.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/6
 * Time: 9:43
 * To change this template use File | Settings | File Templates.
 */

@Api(tags = "用户相关请求")
@RestController
public class SwaggerCtl {
@ApiOperation("测试")
@ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "页码", required = true, dataType = "string", paramType = "path",defaultValue = "123456")
})
    @GetMapping("/test/t/{id}")
    public  String test(@PathVariable(value = "id",required = false) String id){
        System.out.println(id);
        return id;

    }

    @GetMapping("/test/model")
    public User test2(){
        System.out.println();
        return new User("name","age");
    }
}
