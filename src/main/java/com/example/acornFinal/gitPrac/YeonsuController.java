package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YeonsuController {

    @ResponseBody
    @GetMapping("/ys")
    public String yeonsu(){
        return "yeonsu";
    }
}
