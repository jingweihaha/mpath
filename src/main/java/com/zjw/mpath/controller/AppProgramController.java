package com.zjw.mpath.controller;

import com.zjw.mpath.domain.AppProgram;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author jingw
 * @created 11/3/2021 10:31 PM
 * @project mpath
 */
@RestController
@RequestMapping("/program")
public class AppProgramController {

    @PostMapping("/save")
    public String saveOneProgram(@RequestBody @Valid AppProgram appProgram, BindingResult result){

        return "saveOneProgram";
    }

    @GetMapping("/view/{id}")
    public String viewOneProgramById(@PathVariable Long id){
        return "viewOneProgramById";
    }

}
