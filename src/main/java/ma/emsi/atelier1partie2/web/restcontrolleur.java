package ma.emsi.atelier1partie2.web;

import ma.emsi.atelier1partie2.entities.Patient;
import ma.emsi.atelier1partie2.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class restcontrolleur {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/Patients")
 public List<Patient> patientList(){return patientRepository.findAll();}
}

