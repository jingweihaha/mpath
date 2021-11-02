package com.zjw.mpath.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


/**
 * @author jingw
 * @created 11/1/2021 3:03 PM
 * @project mpath
 */
@Entity
@Table(name="mpath_consultants")
@Getter
@Setter
public class Consultant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long id;

    @Column(name="c_name")
    private String consultantName;

    @ManyToMany(mappedBy = "consultantSet")
    private Set<AppProgram> programSet;
}
