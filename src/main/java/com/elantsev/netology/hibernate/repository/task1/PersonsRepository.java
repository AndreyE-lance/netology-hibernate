package com.elantsev.netology.hibernate.repository.task1;

import com.elantsev.netology.hibernate.entity.task1.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getPersonsByCity(String city){
        Query query = entityManager.createQuery("select p from persons p where p.city_of_living= :city", User.class);
        query.setParameter("city",city);
        var resultList = query.getResultList();
        return resultList;
    }
}
