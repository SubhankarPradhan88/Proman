package com.upgrad.proman.service.dao;
import com.upgrad.proman.service.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager; // Provided by JPA
    public UserEntity createUser(UserEntity userEntity) {
        entityManager.persist(userEntity); // Persistance takes place here
        return userEntity; // Now set with an valid ID by hybernate framework
    }
}

