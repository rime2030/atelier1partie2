package ma.emsi.atelier1partie2.repositories;

import ma.emsi.atelier1partie2.entities.Consultation;
import ma.emsi.atelier1partie2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
