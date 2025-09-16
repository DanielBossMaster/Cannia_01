package scrum.cannia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scrum.cannia.model.VeterinarioModel;

public interface VeterinarioRepository extends JpaRepository<VeterinarioModel,Long> {
}
