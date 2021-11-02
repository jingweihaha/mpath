package com.zjw.mpath.service.impl;

import com.zjw.mpath.domain.AppProgram;
import com.zjw.mpath.service.AppProgramService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author jingw
 * @created 11/1/2021 10:29 PM
 * @project mpath
 */
@Service
public class AppProgramServiceImpl implements AppProgramService {
    @Override
    public AppProgram saveAppProgram(AppProgram appProgram) {
        return null;
    }

    @Override
    public AppProgram modifyAppProgram(AppProgram appProgram) {
        return null;
    }

    @Override
    public AppProgram deleteAppProgram(AppProgram appProgram) {
        return null;
    }

    @Override
    public Page<AppProgram> searchAppProgram(Pageable pageable) {
        return null;
    }

    @Override
    public AppProgram searchAppProgramById(Long id) {
        return null;
    }
}
