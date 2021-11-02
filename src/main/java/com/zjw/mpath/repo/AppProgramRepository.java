package com.zjw.mpath.repo;

import com.zjw.mpath.domain.AppProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author jingw
 * @created 11/1/2021 9:22 PM
 * @project mpath
 */
public interface AppProgramRepository extends JpaRepository<AppProgram, Long>, JpaSpecificationExecutor<AppProgram> {
}
