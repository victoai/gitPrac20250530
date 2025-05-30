package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class kymController {

    @ResponseBody
    @GetMapping("/kym")
    public  String teacher(){
        return  "project 피곤해 ㅠ";
    }
}
