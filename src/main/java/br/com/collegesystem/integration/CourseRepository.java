package br.com.collegesystem.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.collegesystem.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
