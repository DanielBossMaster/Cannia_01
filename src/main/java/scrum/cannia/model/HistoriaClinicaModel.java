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

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;  // ahora con hora incluida

    @Column(name = "tratamiento", length = 500, nullable = false)
    private String tratamiento;

    @Column(name = "diagnostico", length = 500, nullable = false)
    private String diagnostico;

    // Relación con Mascota (muchas historias -> una mascota)
    @ManyToOne
    @JoinColumn(name = "id_mascota", nullable = false)
    private MascotaModel mascota;

}
