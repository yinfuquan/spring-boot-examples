package com.yin.web.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * @author MrBird
 */
@Data
public class UserForm  {

    private Long userId;

    @NotEmpty(message = "username必填")
    private String username;

    @NotEmpty(message = "password必填")
    private String password;


}
