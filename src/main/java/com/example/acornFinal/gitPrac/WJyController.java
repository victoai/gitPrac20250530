package com.example.acornFinal.gitPrac;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WJyController {

    @ResponseBody
    @GetMapping("/wjy2")
    public  String teacher(){
        return  "project 가즈아 ~~~~~";
    }
}
