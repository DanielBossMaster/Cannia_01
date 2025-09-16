package scrum.cannia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scrum.cannia.model.MascotaModel;

public interface MascotaRepository  extends JpaRepository<MascotaModel,Long> {
}
