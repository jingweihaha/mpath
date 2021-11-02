package com.zjw.mpath.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

/**
 * @author jingw
 * @created 11/1/2021 2:58 PM
 * @project mpath
 */
@Entity
@Table(name="mpath_appmember")
@Getter
@Setter
public class AppMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private Long id;

    @Column(name = "m_name")
    private String memberName;

    @Column(name = "m_dateofbirth")
    private Date memberDob;

    @OneToMany(mappedBy = "appMember")
    private Set<AppProgram> programSet;

    @ManyToOne
    @JoinColumn(name = "accountuser_id", referencedColumnName = "a_id")
    private AccountUser accountUser;
}
