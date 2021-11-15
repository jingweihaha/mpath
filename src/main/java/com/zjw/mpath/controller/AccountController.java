package com.zjw.mpath.controller;

import com.zjw.mpath.TokenUtil;
import com.zjw.mpath.domain.AccountUser;
import com.zjw.mpath.service.AccountService;
import com.zjw.mpath.vo.AccountUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author jingw
 * @created 11/1/2021 2:16 PM
 * @project mpath
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AccountService accountService;

    @Autowired
    private TokenUtil tokenUtil;


    @GetMapping("/greetings")
    public String greetings(){
        return "greetings!";
    }

    @PostMapping("/register")
    public String register(@RequestBody @Valid AccountUser accountUser, BindingResult result){
        AccountUser newUser = accountService.registerNewAccountUser(accountUser);
        return newUser.getUsername() + " created successfully";
    }

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody @Valid AccountUserVO accountUserVO, BindingResult result) throws Throwable{
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(accountUserVO.getUsername(), accountUserVO.getPassword());
        Authentication authenticate;
        try {
            authenticate = authenticationManager.authenticate(token);
        }catch (BadCredentialsException exception){
            throw new Exception("Bad Credential", exception);
        }catch (DisabledException exception){
            throw new Exception("Disabled User Account", exception);
        }
        String jwt = tokenUtil.generateJWToken(authenticate);
        return jwt;
    }

}
