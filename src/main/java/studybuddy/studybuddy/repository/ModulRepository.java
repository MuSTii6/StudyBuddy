package studybuddy.studybuddy.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import studybuddy.studybuddy.model.Modul;


public interface ModulRepository extends MongoRepository<Modul, String> {
@Aggregation("{$group: {'_id': '$modulname','Studenten': {'$push': '$studentId'}}}")
List<ModulStudentAggregationDTO> getModulStudentAggregation();

}