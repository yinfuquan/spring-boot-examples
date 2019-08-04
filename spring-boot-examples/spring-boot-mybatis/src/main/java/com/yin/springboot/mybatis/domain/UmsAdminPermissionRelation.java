package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class UmsAdminPermissionRelation implements Serializable {
    private Long id;

    private Long adminId;

    private Long permissionId;

    private Integer type;

    private static final long serialVersionUID = 1L;
}