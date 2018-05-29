package com.mr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${zw} on 2018/5/25.
 */

@Controller
public class shiroController {

    @RequestMapping("/main")
    public String toMainPage(){

        return "main";
    }

}
