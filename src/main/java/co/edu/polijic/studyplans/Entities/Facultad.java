package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "facultad")
@Entity
public class Facultad implements Serializable {

    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_FACULTAD")
    private Long idFacultad;

    @Column(name = "NOMBRE_FACULTAD")
    private String nombre;

    @OneToMany(mappedBy = "facultad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Programa> programaList;


    public Facultad() {
    }

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Long idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Programa> getProgramaList() {
        return programaList;
    }

    public void setProgramaList(List<Programa> programaList) {
        this.programaList = programaList;
    }
}
