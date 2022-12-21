package studybuddy.studybuddy.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import studybuddy.studybuddy.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByEmail(String email);
}