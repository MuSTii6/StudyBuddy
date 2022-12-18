package studybuddy.studybuddy.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import studybuddy.studybuddy.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}