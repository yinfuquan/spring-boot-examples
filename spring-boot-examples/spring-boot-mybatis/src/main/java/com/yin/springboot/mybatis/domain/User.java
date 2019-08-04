package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
    /**
    * id主键
    */
    private Integer id;

    /**
    * 用户id
    */
    private Integer userId;

    /**
    * 用户组id
    */
    private Integer groupId;

    /**
    * 用户名称
    */
    private String name;

    /**
    * 用户手机号
    */
    private Integer mobile;

    /**
    * 地址
    */
    private String address;

    /**
    * 性别 1男，2女
    */
    private Integer sex;

    /**
    * 逻辑删除状态 1正常，2删除
    */
    private Integer status;

    /**
    * 创建时间
    */
    private Date createdTime;

    /**
    * 更新时间
    */
    private Date updatedTime;

    /**
    * 乐观锁
    */
    private Integer revision;

    private static final long serialVersionUID = 1L;
}