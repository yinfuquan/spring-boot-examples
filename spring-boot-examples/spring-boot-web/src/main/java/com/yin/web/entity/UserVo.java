package com.yin.web.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yin.web.jsonserilazation.DateSerilazation;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * @author MrBird
 */
@Data
public class UserVo implements Serializable {

    private static final long serialVersionUID = -4352868070794165001L;

    /*返回给前端的为  id*/
    @JsonProperty("id")
    private Long userId;

    @JsonProperty("name")
    private String username;

    @JsonProperty("password")
    private String UserPassword;


    /*返回给前端的日期为 除以1000的值 */
    @JsonSerialize(using = DateSerilazation.class)
    private Date loginTime;
}
