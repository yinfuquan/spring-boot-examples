package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsAdmin implements Serializable {
    private Long id;

    private String username;

    private String password;

    /**
    * 头像
    */
    private String icon;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 昵称
    */
    private String nickName;

    /**
    * 备注信息
    */
    private String note;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 最后登录时间
    */
    private Date loginTime;

    /**
    * 帐号启用状态：0->禁用；1->启用
    */
    private Integer status;

    private static final long serialVersionUID = 1L;
}