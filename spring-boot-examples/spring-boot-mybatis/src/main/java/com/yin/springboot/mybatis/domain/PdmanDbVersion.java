package com.yin.springboot.mybatis.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class PdmanDbVersion implements Serializable {
    private String dbVersion;

    private String versionDesc;

    private String createdTime;

    private static final long serialVersionUID = 1L;
}