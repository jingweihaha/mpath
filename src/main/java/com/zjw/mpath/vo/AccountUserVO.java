package com.zjw.mpath.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author jingw
 * @created 11/1/2021 2:23 PM
 * @project mpath
 */
@Getter
@Setter
public class AccountUserVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;
    private String password;

}
