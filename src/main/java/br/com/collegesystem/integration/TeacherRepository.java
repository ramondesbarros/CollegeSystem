package br.com.collegesystem.integration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.collegesystem.domain.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
