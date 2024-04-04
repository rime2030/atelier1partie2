package ma.emsi.atelier1partie2.entities;


import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor


public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private StatusRDV status;
    @ManyToOne
    @JsonProperty(access =JsonProperty.Access.READ_WRITE)
    private Patient Patient;
    @ManyToOne
    @JsonProperty(access =JsonProperty.Access.READ_WRITE)
    private Medcin Medcin;
    @OneToOne(mappedBy = "rendezvous")
    private Consultation consultation;
}

