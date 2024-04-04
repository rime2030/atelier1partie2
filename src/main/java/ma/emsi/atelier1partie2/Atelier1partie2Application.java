package ma.emsi.atelier1partie2;

import ma.emsi.atelier1partie2.entities.*;
import ma.emsi.atelier1partie2.repositories.ConsultationRepository;
import ma.emsi.atelier1partie2.repositories.MedcinRepository;
import ma.emsi.atelier1partie2.repositories.PatientRepository;
import ma.emsi.atelier1partie2.repositories.RendezvousRepository;
import ma.emsi.atelier1partie2.service.Hospital;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Atelier1partie2Application {

    public static void main(String[] args) {
        SpringApplication.run(Atelier1partie2Application.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository, MedcinRepository medcinRepository, RendezvousRepository rendezvousRepository, ConsultationRepository consultationRepository, Hospital hospital) {
        return args -> {
            Stream.of("rime", "selma", "moughit").forEach(name -> {
                Patient p = new Patient();
                p.setNom(name);
                p.setMalade(false);
                p.setDateNaissance(new Date());
               hospital.savepatient(p);
            });
            Stream.of("sara","ot","saad").forEach(name->{
                Medcin m = new Medcin();
                m.setNom(name);
                m.setSpecialite(Math.random()>0.5?"cardio":"dentiste");
                m.setEmail(name+"@gmail.com");
                hospital.savemedcin(m);
            });
            Patient patient=patientRepository.findAllByNom("rime");
            Medcin medcin=medcinRepository.findAllByNom("sara");
            Rendezvous rendezvous=new Rendezvous();
            rendezvous.setDate(new Date());
            rendezvous.setStatus(StatusRDV.PENDING);
            rendezvous.setMedcin(medcin);
            rendezvous.setPatient(patient);
            rendezvousRepository.save(rendezvous);

            Rendezvous rendezvous1 = rendezvousRepository.findById(1L).orElse(null);
            Consultation consultation=new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezvous(rendezvous1);
            consultation.setRapport("rapport de la consulattion");
            consultationRepository.save(consultation);

        };
    }
}
