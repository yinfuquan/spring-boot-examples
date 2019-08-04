package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CmsTopic implements Serializable {
    private Long id;

    private Long categoryId;

    private String name;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    /**
    * 参与人数
    */
    private Integer attendCount;

    /**
    * 关注人数
    */
    private Integer attentionCount;

    private Integer readCount;

    /**
    * 奖品名称
    */
    private String awardName;

    /**
    * 参与方式
    */
    private String attendType;

    /**
    * 话题内容
    */
    private String content;

    private static final long serialVersionUID = 1L;
}