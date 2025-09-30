package scrum.cannia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import scrum.cannia.model.RegistroModel;

import java.util.List;

public interface RegistroRepository extends JpaRepository<RegistroModel,Long> {

    RegistroModel findByUsuarioAndContrasena(String usuario, String contraseña);
}