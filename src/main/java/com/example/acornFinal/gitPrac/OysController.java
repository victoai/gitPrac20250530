package com.example.acornFinal.gitPrac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class YsController {

    @ResponseBody
    @GetMapping("/ys")
    public String teacher() {
        return "project 동작";
    }

}
