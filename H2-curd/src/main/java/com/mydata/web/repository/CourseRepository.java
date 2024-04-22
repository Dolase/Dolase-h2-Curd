package com.mydata.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.web.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	
}
