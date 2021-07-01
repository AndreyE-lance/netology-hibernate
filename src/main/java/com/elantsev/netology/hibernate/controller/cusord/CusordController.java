package com.elantsev.netology.hibernate.controller.cusord;

import com.elantsev.netology.hibernate.service.cusord.CusordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CusordController {
    private final CusordService cusordService;

    public CusordController(CusordService cusordService) {
        this.cusordService = cusordService;
    }

    @GetMapping("/products/fetch-product")
    public String getProductsByName(String name){
        return cusordService.getOrdersByName(name);
    }
}
