package com.zjw.mpath.service.impl;

import com.zjw.mpath.domain.AppMember;
import com.zjw.mpath.service.AppMemberService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author jingw
 * @created 11/1/2021 10:28 PM
 * @project mpath
 */
@Service
public class AppMemberServiceImpl implements AppMemberService {
    @Override
    public AppMember saveAppMember(AppMember appMember) {
        return null;
    }

    @Override
    public AppMember modifyAccountUser(AppMember appMember) {
        return null;
    }

    @Override
    public AppMember deleteAppMember(AppMember appMember) {
        return null;
    }

    @Override
    public Page<AppMember> searchAppMember(Pageable pageable) {
        return null;
    }

    @Override
    public AppMember searchAppMemberById(Long id) {
        return null;
    }
}
