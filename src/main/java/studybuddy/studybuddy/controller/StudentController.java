package studybuddy.studybuddy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PostMapping("/api/student")
    public ResponseEntity<Student> createStudent(
            @RequestBody StudentCreateDTO fDTO) {
        Student fDAO = new Student(fDTO.getEmail(), fDTO.getName());
        Student f = studentRepository.save(fDAO);
        return new ResponseEntity<>(f, HttpStatus.CREATED);
    }

    @GetMapping("/api/student")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> allFree = studentRepository.findAll();
        return new ResponseEntity<>(allFree, HttpStatus.OK);
    }

    @GetMapping("/api/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
        Optional<Student> optStudent = studentRepository.findById(id);
        if (optStudent.isPresent()) {
            return new ResponseEntity<>(optStudent.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}