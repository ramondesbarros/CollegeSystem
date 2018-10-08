package br.com.collegesystem.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.collegesystem.domain.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
        
}
