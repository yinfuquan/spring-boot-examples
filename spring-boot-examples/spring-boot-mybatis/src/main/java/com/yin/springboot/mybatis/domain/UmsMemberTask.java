package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class UmsMemberTask implements Serializable {
    private Long id;

    private String name;

    /**
    * 赠送成长值
    */
    private Integer growth;

    /**
    * 赠送积分
    */
    private Integer intergration;

    /**
    * 任务类型：0->新手任务；1->日常任务
    */
    private Integer type;

    private static final long serialVersionUID = 1L;
}