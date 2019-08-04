package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class CmsTopicCategory implements Serializable {
    private Long id;

    private String name;

    /**
    * 分类图标
    */
    private String icon;

    /**
    * 专题数量
    */
    private Integer subjectCount;

    private Integer showStatus;

    private Integer sort;

    private static final long serialVersionUID = 1L;
}