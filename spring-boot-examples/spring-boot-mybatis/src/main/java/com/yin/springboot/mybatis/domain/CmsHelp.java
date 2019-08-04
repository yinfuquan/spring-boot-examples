package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CmsHelp implements Serializable {
    private Long id;

    private Long categoryId;

    private String icon;

    private String title;

    private Integer showStatus;

    private Date createTime;

    private Integer readCount;

    private String content;

    private static final long serialVersionUID = 1L;
}