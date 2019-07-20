package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name = "modulo")
@Entity
public class Modulo implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_MODULO")
    private Long idModulo;

    @Column(name = "NOMBRE_MODULO")
    private String nombreModulo;

    @Column(name = "MODALIAD_MODULO")
    private String modalidadModulo;

    @Column(name = "HORAS_TRABAJO_PRESENCIALES")
    private Integer horasTrabajoPresenciales;

    @Column(name = "HORAS_TRABAJO_ASESORIA")
    private Integer horasTrabajoAsesoria;

    @Column(name = "HORAS_TRABAJO_INDEPENDIENTE")
    private Integer horasTrabajoIndependiente;

    @Column(name = "CREDITOS_MODULO")
    private Integer creditosModulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEMESTRE")
    private Semestre semestre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREREQUISITO_MODULO")
    private Modulo prerequisito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CORREQUISITO_MODULO")
    private Modulo correquisito;

    @Column(name = "ACTO_ADMINISTRATIVO")
    private String actoAdministrativo;

    @Column(name = "VIGENCIA_DESDE")
    private Date vigenciaDesde;

    @Column(name = "VIGENCIA_HASTA")
    private Date VigenciaHasta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MODULO_COHORTE")
    private Cohorte cohorte;


    @OneToMany(mappedBy = "modulo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContenidoModulo> contenido_modulo;

    public Modulo() {
    }

    public Modulo(String nombreModulo, String modalidadModulo, Integer horasTrabajoPresenciales, Integer horasTrabajoAsesoria, Integer horasTrabajoIndependiente, Integer creditosModulo, Semestre semestre, Modulo prerequisito, Modulo correquisito, String actoAdministrativo, Date vigenciaDesde, Date vigenciaHasta, Cohorte cohorte, List<ContenidoModulo> contenido_modulo) {
        this.nombreModulo = nombreModulo;
        this.modalidadModulo = modalidadModulo;
        this.horasTrabajoPresenciales = horasTrabajoPresenciales;
        this.horasTrabajoAsesoria = horasTrabajoAsesoria;
        this.horasTrabajoIndependiente = horasTrabajoIndependiente;
        this.creditosModulo = creditosModulo;
        this.semestre = semestre;
        this.prerequisito = prerequisito;
        this.correquisito = correquisito;
        this.actoAdministrativo = actoAdministrativo;
        this.vigenciaDesde = vigenciaDesde;
        this.VigenciaHasta = vigenciaHasta;
        this.cohorte = cohorte;
        this.contenido_modulo = contenido_modulo;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getModalidadModulo() {
        return modalidadModulo;
    }

    public void setModalidadModulo(String modalidadModulo) {
        this.modalidadModulo = modalidadModulo;
    }

    public Integer getHorasTrabajoPresenciales() {
        return horasTrabajoPresenciales;
    }

    public void setHorasTrabajoPresenciales(Integer horasTrabajoPresenciales) {
        this.horasTrabajoPresenciales = horasTrabajoPresenciales;
    }

    public Integer getHorasTrabajoAsesoria() {
        return horasTrabajoAsesoria;
    }

    public void setHorasTrabajoAsesoria(Integer horasTrabajoAsesoria) {
        this.horasTrabajoAsesoria = horasTrabajoAsesoria;
    }

    public Integer getHorasTrabajoIndependiente() {
        return horasTrabajoIndependiente;
    }

    public void setHorasTrabajoIndependiente(Integer horasTrabajoIndependiente) {
        this.horasTrabajoIndependiente = horasTrabajoIndependiente;
    }

    public Integer getCreditosModulo() {
        return creditosModulo;
    }

    public void setCreditosModulo(Integer creditosModulo) {
        this.creditosModulo = creditosModulo;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Modulo getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(Modulo prerequisito) {
        this.prerequisito = prerequisito;
    }

    public Modulo getCorrequisito() {
        return correquisito;
    }

    public void setCorrequisito(Modulo correquisito) {
        this.correquisito = correquisito;
    }

    public String getActoAdministrativo() {
        return actoAdministrativo;
    }

    public void setActoAdministrativo(String actoAdministrativo) {
        this.actoAdministrativo = actoAdministrativo;
    }

    public Date getVigenciaDesde() {
        return vigenciaDesde;
    }

    public void setVigenciaDesde(Date vigenciaDesde) {
        this.vigenciaDesde = vigenciaDesde;
    }

    public Date getVigenciaHasta() {
        return VigenciaHasta;
    }

    public void setVigenciaHasta(Date vigenciaHasta) {
        VigenciaHasta = vigenciaHasta;
    }

    public Cohorte getCohorte() {
        return cohorte;
    }

    public void setCohorte(Cohorte cohorte) {
        this.cohorte = cohorte;
    }

    public List<ContenidoModulo> getContenido_modulo() {
        return contenido_modulo;
    }

    public void setContenido_modulo(List<ContenidoModulo> contenido_modulo) {
        this.contenido_modulo = contenido_modulo;
    }
}
