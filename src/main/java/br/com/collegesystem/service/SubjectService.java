package br.com.collegesystem.service;

import java.util.List;
import java.util.Optional;

import br.com.collegesystem.domain.Subject;

public interface SubjectService {

    List<Subject> listAllSubject();

    void createSubject(Subject subject);

    Optional<Subject> readSubject(Long id);

    void updateSubject(Subject subject);

    void deleteSubject(Long id);
}
