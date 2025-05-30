package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PskController {

    @ResponseBody
    @GetMapping("/psk")
    public String siwoo(){
        return "Hi Hi";
    }

}
