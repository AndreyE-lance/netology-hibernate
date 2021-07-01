package com.elantsev.netology.hibernate.service.cusord;

import com.elantsev.netology.hibernate.repository.cusord.CusordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CusordService {
    private final CusordRepository cusordRepository;

    public CusordService(CusordRepository cusordRepository) {
        this.cusordRepository = cusordRepository;
    }

    public String getOrdersByName(String name){
        List<String> list = cusordRepository.getOrdersByName(name);
        StringBuilder result = new StringBuilder();
        for (String s: list) {
            result.append(s)
                    .append(" ");
        }
        return result.toString().trim();
    }
}
