package com.trindadeproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trindadeproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
