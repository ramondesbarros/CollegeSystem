package br.com.collegesystem.service;

import java.util.List;
import java.util.Optional;

import br.com.collegesystem.domain.StudentClass;

public interface StudentClassService {
    
    List<StudentClass> listAllStudentClass();

    void createStudentClass(StudentClass studentClass);

    Optional<StudentClass> readStudentClass(Long id);

    void updateStudentClass(StudentClass studentClass);

    void deleteStudentClass(Long id);

}
