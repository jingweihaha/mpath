package com.zjw.mpath.controller;

import com.zjw.mpath.service.AccountService;
import com.zjw.mpath.vo.AccountUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author jingw
 * @created 11/1/2021 2:16 PM
 * @project mpath
 */
@RestController
public class AccountController {

//    @Autowired
//    private AccountService accountService;

    @PostMapping("/register")
    public String register(@RequestBody @Valid AccountUserVO accountUserVO, BindingResult result){

        return "";
    }

    @PostMapping("/login")
    public String login(@RequestBody @Valid AccountUserVO accountUserVO, BindingResult result){
        return "";
    }

}
