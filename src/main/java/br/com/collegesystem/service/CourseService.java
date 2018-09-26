package br.com.collegesystem.service;

import java.util.List;
import java.util.Optional;

import br.com.collegesystem.domain.Course;

public interface CourseService {
    
    List<Course> listAllCourse();

    void createCourse(Course course);

    Optional<Course> readCourse(Long id);

    void updateCourse(Course course);

    void deleteCourse(Long id);
}
