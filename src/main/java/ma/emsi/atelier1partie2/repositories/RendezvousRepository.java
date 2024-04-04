package ma.emsi.atelier1partie2.repositories;


import ma.emsi.atelier1partie2.entities.Patient;
import ma.emsi.atelier1partie2.entities.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezvousRepository extends JpaRepository<Rendezvous,Long> {

}
