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

import br.com.collegesystem.domain.Student;
import br.com.collegesystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Student student) {
        studentService.createStudent(student);
    }
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> read() {
        return new ResponseEntity<List<Student>>(studentService.listAllStudent(), HttpStatus.OK);
    }
    
    @RequestMapping("/{id}")
    public Optional<Student> findById(@PathVariable Long id) {
        return studentService.readStudent(id);
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
