package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class UmsMemberMemberTagRelation implements Serializable {
    private Long id;

    private Long memberId;

    private Long tagId;

    private static final long serialVersionUID = 1L;
}