package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SiwooController {

    @ResponseBody
    @GetMapping("/psw")
    public String siwoo(){
        return "Hola, mi nombre es Park Si-woo.";
    }
}
