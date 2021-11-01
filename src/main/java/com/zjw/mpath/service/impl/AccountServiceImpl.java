package com.zjw.mpath.service.impl;

import com.zjw.mpath.domain.AccountUser;
import com.zjw.mpath.service.AccountService;
import com.zjw.mpath.vo.AccountUserVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author jingw
 * @created 11/1/2021 2:34 PM
 * @project mpath
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public AccountUserVO registerNewAccountUser(AccountUser accountUser) {
        return null;
    }

    @Override
    public AccountUserVO modifyAccountUser(AccountUser accountUser) {
        return null;
    }

    @Override
    public AccountUserVO deleteAccountUser(AccountUserVO accountUserVO) {
        return null;
    }

    @Override
    public Page<AccountUser> searchAccountUser(Pageable pageable) {
        return null;
    }

    @Override
    public AccountUser searchAccountUserById(Long id) {
        return null;
    }


}
