package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KBSController {

    @ResponseBody
    @GetMapping("/kbs")
    public  String teacher(){
        return  "project start ^___^     Git 배우기 ~~";
    }

}
