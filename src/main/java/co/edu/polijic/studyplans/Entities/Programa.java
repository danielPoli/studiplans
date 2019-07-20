package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name = "programa")
@Entity
public class Programa implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PROGRAMA")
    private Long idPrograma;

    @Column(name = "NOMBRE_PROGRAMA")
    private String nombrePrograma;

    @Column(name = "CODIGO_PROGRAMA")
    private String codigoPrograma;

    @Column(name = "ACTO_ADMINISTRATIVO")
    private String actoAdministrativo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FACULTAD_PROGRAMA", referencedColumnName = "ID_FACULTAD")
    private Facultad facultad;

    @OneToMany(mappedBy = "cohortePrograma", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cohorte> cohorteList = new ArrayList<>();

    public Programa() {
    }

    public Programa(String nombrePrograma, String codigoPrograma, String actoAdministrativo, Facultad facultad, List<Cohorte> cohorteList) {
        this.nombrePrograma = nombrePrograma;
        this.codigoPrograma = codigoPrograma;
        this.actoAdministrativo = actoAdministrativo;
        this.facultad = facultad;
        this.cohorteList = cohorteList;
    }

    public Long getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Long idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(String codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getActoAdministrativo() {
        return actoAdministrativo;
    }

    public void setActoAdministrativo(String actoAdministrativo) {
        this.actoAdministrativo = actoAdministrativo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Cohorte> getCohorteList() {
        return cohorteList;
    }

    public void setCohorteList(List<Cohorte> cohorteList) {
        this.cohorteList = cohorteList;
    }
}
