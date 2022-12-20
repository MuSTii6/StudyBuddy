package studybuddy.studybuddy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studybuddy.studybuddy.model.Modul;
import studybuddy.studybuddy.repository.ModulRepository;
import studybuddy.studybuddy.repository.StudentRepository;

@Service
public class ModulService {

    @Autowired
    ModulRepository modulRepository;

    @Autowired
    StudentRepository studentRepository;

    public Optional<Modul> assignModul(String modulId, String studentId) {
        if (studentRepository.findById(studentId).isPresent()) {
            Optional<Modul> modulToAssign = modulRepository.findById(modulId);
            if (modulToAssign.isPresent()) {
                Modul modul = modulToAssign.get();
                modul.setStudentId(studentId);
                modulRepository.save(modul);
                return Optional.of(modul);
            }

        }

        return Optional.empty();

    }

}
