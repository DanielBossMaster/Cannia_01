package scrum.cannia.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mascotas")
public class MascotaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "genero", length = 20)
    private String genero;

    @Column(name = "especie", length = 45, nullable = false)
    private String especie;

    @Column(name = "raza", length = 45)
    private String raza;

    @Column(name = "peso")
    private Double peso;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    // Relación con Propietario (si lo necesitas)
    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private PropietarioModel propietario;

    // Constructores
    public MascotaModel() {
        this.fechaCreacion = LocalDateTime.now();
    }

    public MascotaModel(String nombre, Integer edad, String genero, String especie, String raza, Double peso) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.especie = especie;
        this.raza = raza;
        this.peso = peso;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(LocalDateTime fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public PropietarioModel getPropietario() { return propietario; }
    public void setPropietario(PropietarioModel propietario) { this.propietario = propietario; }
}
