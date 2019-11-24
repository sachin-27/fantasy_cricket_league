package com.example.demo.Repositories;

import com.example.demo.Beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findAll();

    public List<User> findAllByUserIdNotNullOrderByUserPointsDesc();

    public User findByUserName(String userName);

    public User findByUserId(Long userId);

}
