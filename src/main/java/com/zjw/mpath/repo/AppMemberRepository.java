package com.zjw.mpath.repo;

import com.zjw.mpath.domain.AppMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author jingw
 * @created 11/1/2021 9:21 PM
 * @project mpath
 */
public interface AppMemberRepository extends JpaRepository<AppMember, Long>, JpaSpecificationExecutor<AppMember> {
}
