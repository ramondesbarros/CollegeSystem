package br.com.collegesystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.collegesystem.domain.Teacher;
import br.com.collegesystem.integration.TeacherRepository;
import br.com.collegesystem.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
    
    @Autowired
    private TeacherRepository teacherRepository;
    
    @Override
    public List<Teacher> listAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public void createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public Optional<Teacher> readTeacher(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }

}
