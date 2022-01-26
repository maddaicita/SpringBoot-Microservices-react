package com.mady.microservicecoursemanagement.repository;

import com.mady.microservicecoursemanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
