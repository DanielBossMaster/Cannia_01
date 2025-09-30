package scrum.cannia.repository;

import scrum.cannia.model.MascotaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<MascotaModel, Long> {
    // Métodos personalizados si los necesitas
}