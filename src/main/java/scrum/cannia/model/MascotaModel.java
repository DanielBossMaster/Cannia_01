package scrum.cannia.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "mascota")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MascotaModel {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name= "id_mascota")
    private int id;

    @Column (length = 45,nullable = false)
    private  String nomMascota;

    @Column(length = 45,nullable = false)
    private String especie;

    @Column(length = 45,nullable = false)
    private String raza;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "fecha_vacunacion")
    private Date fechaVacunacion;

    @Column(length = 45)
    private String medicamento;

    @Column(length = 20)
    private String color;

    @Enumerated(EnumType.STRING)
    @Column(length = 10,nullable = false)
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_propietario",nullable = false)
    private PropietarioModel propietario;


}
