package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UmsGrowthChangeHistory implements Serializable {
    private Long id;

    private Long memberId;

    private Date createTime;

    /**
    * 改变类型：0->增加；1->减少
    */
    private Integer changeType;

    /**
    * 积分改变数量
    */
    private Integer changeCount;

    /**
    * 操作人员
    */
    private String operateMan;

    /**
    * 操作备注
    */
    private String operateNote;

    /**
    * 积分来源：0->购物；1->管理员修改
    */
    private Integer sourceType;

    private static final long serialVersionUID = 1L;
}