package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name = "semestre")
@Entity
public class Semestre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SEMESTRE")
    private Long idSemestre;

    @Column(name = "SEMESTRE")
    private String descripcionSemestre;

    @OneToMany(mappedBy = "semestre", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Modulo> moduloList = new ArrayList<>();

    public Semestre() {
    }

    public Semestre(String descripcionSemestre, List<Modulo> moduloList) {
        this.descripcionSemestre = descripcionSemestre;
        this.moduloList = moduloList;
    }

    public Long getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(Long idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getDescripcionSemestre() {
        return descripcionSemestre;
    }

    public void setDescripcionSemestre(String descripcionSemestre) {
        this.descripcionSemestre = descripcionSemestre;
    }

    public List<Modulo> getModuloList() {
        return moduloList;
    }

    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }
}
