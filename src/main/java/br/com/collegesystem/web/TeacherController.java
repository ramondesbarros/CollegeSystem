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

import br.com.collegesystem.domain.Teacher;
import br.com.collegesystem.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    
    @Autowired
    private TeacherService teacherService;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Teacher teacher) {
        teacherService.createTeacher(teacher);
    }
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Teacher>> read() {
        return new ResponseEntity<List<Teacher>>(teacherService.listAllTeacher(), HttpStatus.OK);
    }
    
    @RequestMapping("/{id}")
    public Optional<Teacher> findById(@PathVariable Long id) {
        return teacherService.readTeacher(id);
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Teacher teacher) {
        teacherService.updateTeacher(teacher);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
    }
}
