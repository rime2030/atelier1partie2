package ma.emsi.atelier1partie2.repositories;

import ma.emsi.atelier1partie2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient ,Long> {
    Patient findAllByNom (String nom);
}
