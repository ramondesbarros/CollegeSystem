package br.com.collegesystem.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.collegesystem.domain.StudentClass;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClass, Long> {

}
