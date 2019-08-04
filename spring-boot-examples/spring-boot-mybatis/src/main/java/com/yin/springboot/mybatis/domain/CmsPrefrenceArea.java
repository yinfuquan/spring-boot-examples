package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class CmsPrefrenceArea implements Serializable {
    private Long id;

    private String name;

    private String subTitle;

    /**
    * 展示图片
    */
    private byte[] pic;

    private Integer sort;

    private Integer showStatus;

    private static final long serialVersionUID = 1L;
}