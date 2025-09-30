package scrum.cannia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="registro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuario;
    private String contrasena;
    private String rol;

    // Campos propietario
    private String numDoc;
    private String nombre;
    private String apellido;
    private String correo;

    // Campos veterinario
    private String numlicencia;
    private String nombreVete;
    private String apellidoVete;
    private String correoVete;

}