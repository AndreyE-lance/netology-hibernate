package com.elantsev.netology.hibernate.repository.cusord;

import com.elantsev.netology.hibernate.entity.cusord.Order;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CusordRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getOrdersByName(String name){
        Query query = entityManager.createQuery("select o.productName " +
                "from orders o join customers c on o.customer=c " +
                "where lower(c.name)=:n");
        query.setParameter("n", name);
        return query.getResultList();
    }
}
