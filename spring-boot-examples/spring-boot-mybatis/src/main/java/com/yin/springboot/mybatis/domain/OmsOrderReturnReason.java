package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class OmsOrderReturnReason implements Serializable {
    private Long id;

    /**
    * 退货类型
    */
    private String name;

    private Integer sort;

    /**
    * 状态：0->不启用；1->启用
    */
    private Integer status;

    /**
    * 添加时间
    */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}