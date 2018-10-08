package br.com.collegesystem.service;

import java.util.List;
import java.util.Optional;

import br.com.collegesystem.domain.Teacher;

public interface TeacherService {
    
    List<Teacher> listAllTeacher();

    void createTeacher(Teacher teacher);

    Optional<Teacher> readTeacher(Long id);

    void updateTeacher(Teacher teacher);

    void deleteTeacher(Long id);

}
