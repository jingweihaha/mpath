package com.zjw.mpath.repo;

import com.zjw.mpath.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author jingw
 * @created 11/1/2021 2:36 PM
 * @project mpath
 */
public interface AccountUserRepository extends JpaRepository<AccountUser, Long>, JpaSpecificationExecutor<AccountUser> {
}
