package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class PmsCommentReplay implements Serializable {
    private Long id;

    private Long commentId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private Date createTime;

    /**
    * 评论人员类型；0->会员；1->管理员
    */
    private Integer type;

    private static final long serialVersionUID = 1L;
}