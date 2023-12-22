package com.example.postMappingToDatabase.dao;

import com.example.postMappingToDatabase.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseJpaRepository extends JpaRepository<Courses,Integer> {
}
