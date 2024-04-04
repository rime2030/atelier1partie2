package ma.emsi.atelier1partie2.service;

import jakarta.transaction.Transactional;
import ma.emsi.atelier1partie2.entities.Consultation;
import ma.emsi.atelier1partie2.entities.Medcin;
import ma.emsi.atelier1partie2.entities.Patient;
import ma.emsi.atelier1partie2.entities.Rendezvous;
import ma.emsi.atelier1partie2.repositories.ConsultationRepository;
import ma.emsi.atelier1partie2.repositories.MedcinRepository;
import ma.emsi.atelier1partie2.repositories.PatientRepository;
import ma.emsi.atelier1partie2.repositories.RendezvousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class HospitalImpl implements Hospital {
    private PatientRepository patientRepository;
    private MedcinRepository medcinRepository;
    private ConsultationRepository consultationRepository;
    private RendezvousRepository rendezvousRepository;

    public HospitalImpl(PatientRepository patientRepository, MedcinRepository medcinRepository, ConsultationRepository consultationRepository, RendezvousRepository rendezvousRepository) {
        this.patientRepository = patientRepository;
        this.medcinRepository = medcinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezvousRepository = rendezvousRepository;
    }

    @Override
    public Patient savepatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medcin savemedcin(Medcin medcin) {
        return medcinRepository.save(medcin);
    }

    @Override
    public Rendezvous saverdv(Rendezvous RDV) {
        return rendezvousRepository.save(RDV);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return  consultationRepository.save(consultation);

    }
}
