package com.zjw.mpath.service;

import com.zjw.mpath.domain.AppProgram;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author jingw
 * @created 11/1/2021 10:28 PM
 * @project mpath
 */
public interface AppProgramService {

    AppProgram saveAppProgram(AppProgram appProgram);

    AppProgram modifyAppProgram(AppProgram appProgram);

    AppProgram deleteAppProgram(AppProgram appProgram);

    Page<AppProgram> searchAppProgram(Pageable pageable);

    AppProgram searchAppProgramById(Long id);
}
