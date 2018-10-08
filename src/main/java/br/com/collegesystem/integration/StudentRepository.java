package br.com.collegesystem.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.collegesystem.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
