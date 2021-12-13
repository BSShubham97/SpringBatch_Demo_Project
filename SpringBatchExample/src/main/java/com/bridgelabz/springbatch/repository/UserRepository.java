package com.bridgelabz.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.springbatch.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
