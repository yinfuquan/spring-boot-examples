package com.yin.springboot.user.center.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "oauth_approvals")
public class OauthApprovals implements Serializable {
    @Column(name = "userId")
    private String userid;

    @Column(name = "clientId")
    private String clientid;

    @Column(name = "`scope`")
    private String scope;

    @Column(name = "`status`")
    private String status;

    @Column(name = "expiresAt")
    private Date expiresat;

    @Column(name = "lastModifiedAt")
    private Date lastmodifiedat;

    private static final long serialVersionUID = 1L;
}