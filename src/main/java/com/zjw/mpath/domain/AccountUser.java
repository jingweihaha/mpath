package com.zjw.mpath.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * @author jingw
 * @created 11/1/2021 2:32 PM
 * @project mpath
 */
@Entity
@Table(name = "mpath_accountuser")
@Getter
@Setter
public class AccountUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long id;

    @Column(name = "a_username")
    private String username;

    @Column(name = "a_password")
    private String password;

    @Column(name = "a_email")
    private String email;

    @OneToMany
    private Set<AppMember> appMemberSet;

    @OneToMany
    private Set<AppProgram> appProgramSet;

}
