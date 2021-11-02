package com.zjw.mpath.service;

import com.zjw.mpath.domain.AccountUser;
import com.zjw.mpath.domain.AppMember;
import com.zjw.mpath.vo.AccountUserVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author jingw
 * @created 11/1/2021 10:27 PM
 * @project mpath
 */
public interface AppMemberService {

    AppMember saveAppMember(AppMember appMember);

    AppMember modifyAccountUser(AppMember appMember);

    AppMember deleteAppMember(AppMember appMember);

    Page<AppMember> searchAppMember(Pageable pageable);

    AppMember searchAppMemberById(Long id);

}
