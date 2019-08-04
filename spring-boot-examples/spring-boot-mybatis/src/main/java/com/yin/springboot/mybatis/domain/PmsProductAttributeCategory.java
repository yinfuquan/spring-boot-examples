package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class PmsProductAttributeCategory implements Serializable {
    private Long id;

    private String name;

    /**
    * 属性数量
    */
    private Integer attributeCount;

    /**
    * 参数数量
    */
    private Integer paramCount;

    private static final long serialVersionUID = 1L;
}