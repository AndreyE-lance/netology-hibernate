package com.elantsev.netology.hibernate;

import com.elantsev.netology.hibernate.entity.cusord.Customer;
import com.elantsev.netology.hibernate.entity.cusord.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CommandLineApp implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void run(String... args) throws Exception {
        /*List<Order> orderList = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();
        var random = new Random();
        int i = 0;
        var names = List.of("Alexey","Peter","George","Victoria","Elizabeth");
        while (i < 10) {
            customers.add(Customer.builder()
                    .name(names.get(random.nextInt(names.size())))
                    .surname(new StringBuilder(names.get(random.nextInt(names.size())).toUpperCase()).reverse().toString())
                    .age(18)
                    .phone_number(String.valueOf(random.nextInt(100000000)))
                    .build());
            i++;
        }
        i=0;
        while (i<100){
            orderList.add(Order.builder()
                    .date(LocalDateTime.now())
                    .customer(customers.get(random.nextInt(customers.size())))
                    .productName("Product"+i)
                    .amount(random.nextInt(i+1))
                    .build());
            i++;
        }


        for (Customer entity : customers) {
            entityManager.persist(entity);
        }

        for (Order entity:orderList){
            entityManager.persist(entity);
        }*/
    }
}
