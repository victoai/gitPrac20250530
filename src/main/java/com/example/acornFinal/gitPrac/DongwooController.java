package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DongwooController {

    @ResponseBody
    @GetMapping("/ldw")
    public String dongwoo(){

        return "dongwoo ^^!!;;;~~";
    }
}
