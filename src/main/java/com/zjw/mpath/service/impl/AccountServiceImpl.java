package com.zjw.mpath.service.impl;

import com.zjw.mpath.domain.AccountUser;
import com.zjw.mpath.repo.AccountUserRepository;
import com.zjw.mpath.service.AccountService;
import com.zjw.mpath.vo.AccountUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingw
 * @created 11/1/2021 2:34 PM
 * @project mpath
 */
@Service
public class AccountServiceImpl implements AccountService, UserDetailsService {

    @Autowired
    private AccountUserRepository accountUserRepository;

    @Override
    public AccountUser registerNewAccountUser(AccountUser accountUser) {
        AccountUser user = accountUserRepository.save(accountUser);
        return user;
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

    @Override
    public AccountUser findUserByUsername(String username) {
        AccountUser accountUser = accountUserRepository.findAccountUserByUsername(username);
        return accountUser;
    }


    /**
     * Locates the user based on the username. In the actual implementation, the search
     * may possibly be case sensitive, or case insensitive depending on how the
     * implementation instance is configured. In this case, the <code>UserDetails</code>
     * object that comes back may have a username that is of a different case than what
     * was actually requested..
     *
     * @param username the username identifying the user whose data is required.
     * @return a fully populated user record (never <code>null</code>)
     * @throws UsernameNotFoundException if the user could not be found or the user has no
     *                                   GrantedAuthority
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountUser accountUser = findUserByUsername(username);
        List<GrantedAuthority> authority = new ArrayList<>();
        authority.add(new SimpleGrantedAuthority("Admin"));
        UserDetails userDetails = new User(accountUser.getUsername(), accountUser.getPassword(), authority);
        return userDetails;
    }
}
