package com.example.acornFinal.cart.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceTempImp  implements CartService{
    @Override
    public List<String> getCarList() {
        return List.of("양말" ,"가디건" ,"수건", "사과");
    }
}
