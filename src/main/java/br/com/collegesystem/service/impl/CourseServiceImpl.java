package br.com.collegesystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.collegesystem.domain.Course;
import br.com.collegesystem.integration.CourseRepository;
import br.com.collegesystem.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
    
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> listAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public void createCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public Optional<Course> readCourse(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
    
    
}
