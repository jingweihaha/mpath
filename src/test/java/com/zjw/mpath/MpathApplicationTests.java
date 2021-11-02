package com.zjw.mpath;

import com.zjw.mpath.domain.AccountUser;
import com.zjw.mpath.domain.AppMember;
import com.zjw.mpath.domain.AppProgram;
import com.zjw.mpath.domain.Consultant;
import com.zjw.mpath.repo.AccountUserRepository;
import com.zjw.mpath.repo.AppMemberRepository;
import com.zjw.mpath.repo.AppProgramRepository;
import com.zjw.mpath.repo.ConsultantRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Member;

@SpringBootTest
class MpathApplicationTests {

    @Autowired
    private AccountUserRepository accountUserRepository;

    @Autowired
    private AppMemberRepository appMemberRepository;

    @Autowired
    private AppProgramRepository appProgramRepository;

    @Autowired
    private ConsultantRepository consultantRepository;

    @Test
    void contextLoads() {
        saveUserTest();
        saveMemberTest();
        saveProgramTest();
        saveConsultantTest();
    }

    @Test
    void saveUserTest(){
        AccountUser accountUser = new AccountUser();
        accountUser.setUsername("test_accountUser1");
        accountUser.setPassword("test_password1");
        Assertions.assertNotNull(accountUserRepository.save(accountUser));
    }
    @Test
    void saveMemberTest(){
        AppMember appMember = new AppMember();
        appMember.setMemberName("test_member1");
        Assertions.assertNotNull(appMemberRepository.save(appMember));
    }

    @Test
    void saveProgramTest(){
        AppProgram appProgram = new AppProgram();
        appProgram.setProgramName("test_program1");
        Assertions.assertNotNull(appProgramRepository.save(appProgram));
    }

    @Test
    void saveConsultantTest(){
        Consultant consultant = new Consultant();
        consultant.setConsultantName("Nutrition");
        Assertions.assertNotNull(consultantRepository.save(consultant));
    }


}
