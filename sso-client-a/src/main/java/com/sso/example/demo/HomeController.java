package com.sso.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author ddshuai
 * @date 2021-07-27 13:23
 **/
@RestController
@RequestMapping("home")
public class HomeController {

    @GetMapping("index")
    public String home(){
        return "首页";
    }
}
