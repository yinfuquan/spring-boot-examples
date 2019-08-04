package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class CmsSubjectProductRelation implements Serializable {
    private Long id;

    private Long subjectId;

    private Long productId;

    private static final long serialVersionUID = 1L;
}