package com.mady.microservicecoursemanagement.service;

import com.mady.microservicecoursemanagement.model.Course;
import com.mady.microservicecoursemanagement.model.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}
