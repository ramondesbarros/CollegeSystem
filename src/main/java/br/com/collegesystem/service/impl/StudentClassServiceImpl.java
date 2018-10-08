package br.com.collegesystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.collegesystem.domain.StudentClass;
import br.com.collegesystem.integration.StudentClassRepository;
import br.com.collegesystem.service.StudentClassService;

@Service
public class StudentClassServiceImpl implements StudentClassService {
    
    @Autowired
    private StudentClassRepository studentClassRepository;
    
    @Override
    public List<StudentClass> listAllStudentClass() {
        return studentClassRepository.findAll();
    }

    @Override
    public void createStudentClass(StudentClass studentClass) {
        studentClassRepository.save(studentClass);
    }

    @Override
    public Optional<StudentClass> readStudentClass(Long id) {
        return studentClassRepository.findById(id);
    }

    @Override
    public void updateStudentClass(StudentClass studentClass) {
        studentClassRepository.save(studentClass);
        
    }

    @Override
    public void deleteStudentClass(Long id) {
        studentClassRepository.deleteById(id);
        
    }
}
