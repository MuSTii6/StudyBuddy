package studybuddy.studybuddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import studybuddy.studybuddy.model.Student;
import studybuddy.studybuddy.model.StudentCreateDTO;
import studybuddy.studybuddy.repository.StudentRepository;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(
            @RequestBody StudentCreateDTO fDTO) {
        Student fDAO = new Student(fDTO.getEmail(), fDTO.getName());
        Student f = studentRepository.save(fDAO);
        return new ResponseEntity<>(f, HttpStatus.CREATED);
    }
}