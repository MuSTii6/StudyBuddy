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

import studybuddy.studybuddy.model.ModulCreateDTO;
import studybuddy.studybuddy.model.Modul;
import studybuddy.studybuddy.repository.ModulRepository;

@RestController
public class ModulController {
    @Autowired
    ModulRepository modulRepository;

    @PostMapping("/modul")
    public ResponseEntity<Modul> createModul(
            @RequestBody ModulCreateDTO fDTO) {
        Modul fDAO = new Modul(fDTO.getModulname());
        Modul f = modulRepository.save(fDAO);
        return new ResponseEntity<>(f, HttpStatus.CREATED);
    }

    @GetMapping("/modul")
    public ResponseEntity<List<Modul>> getAllModul() {
        List<Modul> allFree = modulRepository.findAll();
        return new ResponseEntity<>(allFree, HttpStatus.OK);
    }

    @GetMapping("/modul/{id}")
    public ResponseEntity<Modul> getModulById(@PathVariable String id) {
        Optional<Modul> optModul = modulRepository.findById(id);
        if (optModul.isPresent()) {
            return new ResponseEntity<>(optModul.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}