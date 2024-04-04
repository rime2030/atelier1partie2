package ma.emsi.atelier1partie2.repositories;

import ma.emsi.atelier1partie2.entities.Medcin;
import ma.emsi.atelier1partie2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medcin,Long> {
  Medcin findAllByNom (String nom);
}
