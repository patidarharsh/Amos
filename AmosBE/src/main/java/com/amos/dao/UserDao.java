package com.amos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.amos.model.UserAmos;


@Repository
public interface UserDao extends JpaRepository<UserAmos, Integer> {
    UserAmos findByUsername(String username);

    @Query("FROM UserAmos WHERE id = ?1")
    UserAmos findByUserId(long id); 

}

