package com.example.acornFinal.cart.controller;


import com.example.acornFinal.cart.service.CartService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CartController {


    private final  CartService  service;

    @Autowired
    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/cart")
    public  String cartList(Model model){
        List<String> list= service.getCarList();
        model.addAttribute("list",list);
        return  "cart/cartList";
    }

}
