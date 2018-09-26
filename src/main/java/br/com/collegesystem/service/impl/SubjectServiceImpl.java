package br.com.collegesystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.collegesystem.domain.Subject;
import br.com.collegesystem.integration.SubjectRepository;
import br.com.collegesystem.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{
    
    @Autowired
    private SubjectRepository subjectRepository;
    
    @Override
    public List<Subject> listAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public void createSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public Optional<Subject> readSubject(Long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public void updateSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }

}
