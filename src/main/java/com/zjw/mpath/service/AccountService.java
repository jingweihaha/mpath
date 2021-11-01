package com.zjw.mpath.service;

import com.zjw.mpath.domain.AccountUser;
import com.zjw.mpath.repo.AccountRepository;
import com.zjw.mpath.vo.AccountUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.management.loading.PrivateClassLoader;
import java.util.List;

/**
 * @author jingw
 * @created 11/1/2021 2:26 PM
 * @project mpath
 */
public interface AccountService {

    AccountUserVO registerNewAccountUser(AccountUser accountUser);

    AccountUserVO modifyAccountUser(AccountUser accountUser);

    AccountUserVO deleteAccountUser(AccountUserVO accountUserVO);

    Page<AccountUser> searchAccountUser(Pageable pageable);

    AccountUser searchAccountUserById(Long id);

}
