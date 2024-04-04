package ma.emsi.atelier1partie2.service;

import ma.emsi.atelier1partie2.entities.Consultation;
import ma.emsi.atelier1partie2.entities.Medcin;
import ma.emsi.atelier1partie2.entities.Patient;
import ma.emsi.atelier1partie2.entities.Rendezvous;

public interface Hospital {
    Patient savepatient(Patient patient);
     Medcin savemedcin(Medcin medcin);
     Rendezvous saverdv(Rendezvous RDV);
     Consultation saveConsultation(Consultation consultation);

}
