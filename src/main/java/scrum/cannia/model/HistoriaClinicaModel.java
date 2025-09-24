package scrum.cannia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "historia_clinica")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoriaClinicaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historia_clinica")
    private Long idHistoriaClinica;

    /**
     Relación con la mascota.
     Esto te permite acceder a TODOS los campos de Mascota esde la historia clínica, es decir historia.getMascota().getNomMascota(), etc.
     */
    @ManyToOne(fetch = FetchType.EAGER) // EAGER para traer la mascota automáticamente
    @JoinColumn(name = "id_mascota", nullable = false)
    private MascotaModel mascota;

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    @Column(name = "peso", nullable = false)
    private Float peso;

    @Column(name = "anamnesis", length = 500, nullable = false)
    private String anamnesis;

    @Column(name = "diagnostico", length = 500, nullable = false)
    private String diagnostico;

    @Column(name = "tratamiento", length = 500, nullable = false)
    private String tratamiento;
}

