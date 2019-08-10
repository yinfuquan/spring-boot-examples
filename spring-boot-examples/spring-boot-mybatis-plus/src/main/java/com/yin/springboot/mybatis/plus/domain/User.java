package com.yin.springboot.mybatis.plus.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "tb_user")
public class User implements Serializable {
     @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码，加密存储
     */
    @TableField(value = "password")
    private String password;

    /**
     * 注册手机号
     */
    @TableField(value = "phone")
    private String phone;

    @TableLogic
    private  byte status;
    /**
     * 注册邮箱
     */
    @TableField(value = "email")
    private String email;

    @TableField(value = "created")
    private Date created;

    @TableField(value = "updated")
    private Date updated;

    private  String salt;

    @TableField(value = "role_id")
    private Long roleId;

    @Version
    private Integer version;

    private static final long serialVersionUID = 1L;

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_PHONE = "phone";

    public static final String COL_EMAIL = "email";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}
