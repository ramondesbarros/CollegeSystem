package br.com.collegesystem.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.collegesystem.domain.StudentClass;
import br.com.collegesystem.service.StudentClassService;

@RestController
@RequestMapping("/studentClass")
public class StudentClassController {
    
    @Autowired
    private StudentClassService studentClassService;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody StudentClass studentClass) {
        studentClassService.createStudentClass(studentClass);
    }
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentClass>> read() {
        return new ResponseEntity<List<StudentClass>>(studentClassService.listAllStudentClass(), HttpStatus.OK);
    }
    
    @RequestMapping("/{id}")
    public Optional<StudentClass> findById(@PathVariable Long id) {
        return studentClassService.readStudentClass(id);
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody StudentClass studentClass) {
        studentClassService.updateStudentClass(studentClass);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentClassService.deleteStudentClass(id);
    }
}
