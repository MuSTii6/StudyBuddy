package studybuddy.studybuddy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studybuddy.studybuddy.model.Modul;
import studybuddy.studybuddy.model.ModulAssignDTO;
import studybuddy.studybuddy.service.ModulService;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
    
    @Autowired
    ModulService modulService;

    @PostMapping("/modulassignment")
    public ResponseEntity<Modul> assignModul(@RequestBody ModulAssignDTO assignDTO) {
        Optional<Modul> modul = modulService.assignModul(assignDTO.getModulId(), assignDTO.getStudentId());
        if (modul.isPresent()) {
            return new ResponseEntity<>(modul.get(), HttpStatus.OK); 
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }





}
