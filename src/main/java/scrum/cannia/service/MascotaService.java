package scrum.cannia.service;

import scrum.cannia.model.MascotaModel;
import scrum.cannia.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    // GUARDAR MASCOTA
    public MascotaModel guardarMascota(MascotaModel mascota) {
        return mascotaRepository.save(mascota);
    }

    // OBTENER MASCOTA POR ID
    public Optional<MascotaModel> obtenerMascotaPorId(Long id) {
        return mascotaRepository.findById(id);
    }

    // ELIMINAR MASCOTA
    public void eliminarMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    // ACTUALIZAR MASCOTA
    public MascotaModel actualizarMascota(Long id, MascotaModel mascotaActualizada) {
        Optional<MascotaModel> mascotaExistente = mascotaRepository.findById(id);

        if (mascotaExistente.isPresent()) {
            MascotaModel mascota = mascotaExistente.get();
            mascota.setNombre(mascotaActualizada.getNombre());
            mascota.setEdad(mascotaActualizada.getEdad());
            mascota.setGenero(mascotaActualizada.getGenero());
            mascota.setEspecie(mascotaActualizada.getEspecie());
            mascota.setRaza(mascotaActualizada.getRaza());
            mascota.setPeso(mascotaActualizada.getPeso());

            return mascotaRepository.save(mascota);
        }
        return null;
    }
}
