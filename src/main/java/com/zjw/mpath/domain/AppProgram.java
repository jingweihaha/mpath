package com.zjw.mpath.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;
import java.util.Set;

/**
 * @author jingw
 * @created 11/1/2021 3:00 PM
 * @project mpath
 */
@Entity
@Table(name = "mpath_appprogram")
@Setter
@Getter
public class AppProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long id;

    @Column(name="p_name")
    private String programName;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "program_consultant_jointable", joinColumns = {@JoinColumn(name = "program_id", referencedColumnName = "p_id")},
    inverseJoinColumns = {@JoinColumn(name = "consultant_id", referencedColumnName = "c_id")})
    private Set<Consultant> consultantSet;

    @ManyToOne
    @JoinColumn(name = "appMember_id", referencedColumnName = "m_id")
    private AppMember appMember;

    @ManyToOne
    @JoinColumn(name = "accountUser_id", referencedColumnName = "a_id")
    private AccountUser accountUser;
}
