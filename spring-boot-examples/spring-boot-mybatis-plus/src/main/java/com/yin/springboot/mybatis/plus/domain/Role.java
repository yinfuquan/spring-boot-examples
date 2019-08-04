package com.yin.springboot.mybatis.plus.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "tb_role")
public class Role implements Serializable {
     @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父角色
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 角色名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 角色英文名称
     */
    @TableField(value = "enname")
    private String enname;

    /**
     * 备注
     */
    @TableField(value = "description")
    private String description;

    @TableField(value = "created")
    private Date created;

    @TableField(value = "updated")
    private Date updated;

    private static final long serialVersionUID = 1L;

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_NAME = "name";

    public static final String COL_ENNAME = "enname";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}