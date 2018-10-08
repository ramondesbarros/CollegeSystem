package br.com.collegesystem.service;

import java.util.List;
import java.util.Optional;

import br.com.collegesystem.domain.Student;

public interface StudentService {
    
    List<Student> listAllStudent();

    void createStudent(Student student);

    Optional<Student> readStudent(Long id);

    void updateStudent(Student student);

    void deleteStudent(Long id);
}
