package studybuddy.studybuddy.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import studybuddy.studybuddy.model.Modul;


public interface ModulRepository extends MongoRepository<Modul, String> {

}