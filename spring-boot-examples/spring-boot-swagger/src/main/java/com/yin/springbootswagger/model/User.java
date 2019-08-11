package com.yin.springbootswagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/6
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
@Data
@AllArgsConstructor

@ApiModel("用户实体")
public class User {
    @ApiModelProperty(value = "na",example = "yin fu quan")
    String name;
    @ApiModelProperty("ag")
    String age;
}
