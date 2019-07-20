package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "cohorte")
@Entity
public class Cohorte implements Serializable {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_COHORTE")
    private Long idCohorte;

    @Column(name = "FECHA_INICIO_COHORTE")
    private Date fechaInicioCohorte;

    @Column(name = "FECHA_FIN_COHORTE")
    private Date fechaFinCohorte;

    @Column(name = "PUBLICADO")
    private Boolean publicado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COHORTE_PROGRAMA")
    private Programa cohortePrograma;

    @OneToMany(mappedBy = "cohorte", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Modulo> moduloList = new ArrayList<>();

    public Cohorte() {
    }

    public Cohorte(Date fechaInicioCohorte, Date fechaFinCohorte, Boolean publicado, Programa cohortePrograma, List<Modulo> moduloList) {
        this.fechaInicioCohorte = fechaInicioCohorte;
        this.fechaFinCohorte = fechaFinCohorte;
        this.publicado = publicado;
        this.cohortePrograma = cohortePrograma;
        this.moduloList = moduloList;
    }


    public Long getIdCohorte() {
        return idCohorte;
    }

    public void setIdCohorte(Long idCohorte) {
        this.idCohorte = idCohorte;
    }

    public Date getFechaInicioCohorte() {
        return fechaInicioCohorte;
    }

    public void setFechaInicioCohorte(Date fechaInicioCohorte) {
        this.fechaInicioCohorte = fechaInicioCohorte;
    }

    public Date getFechaFinCohorte() {
        return fechaFinCohorte;
    }

    public void setFechaFinCohorte(Date fechaFinCohorte) {
        this.fechaFinCohorte = fechaFinCohorte;
    }

    public Boolean getPublicado() {
        return publicado;
    }

    public void setPublicado(Boolean publicado) {
        this.publicado = publicado;
    }

    public Programa getCohortePrograma() {
        return cohortePrograma;
    }

    public void setCohortePrograma(Programa cohortePrograma) {
        this.cohortePrograma = cohortePrograma;
    }

    public List<Modulo> getModuloList() {
        return moduloList;
    }

    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }
}
