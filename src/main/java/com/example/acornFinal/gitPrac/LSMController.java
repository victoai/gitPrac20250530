package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LSMController {
    @GetMapping("/lsm")
    @ResponseBody
    public String sumni(){
        return "안녕하세요 저입니다 저 숨니입니다";
    }

}
