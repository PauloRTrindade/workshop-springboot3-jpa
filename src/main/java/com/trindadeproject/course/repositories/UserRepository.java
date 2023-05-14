package com.trindadeproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trindadeproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
