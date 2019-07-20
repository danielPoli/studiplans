package co.edu.polijic.studyplans.Dto;

import co.edu.polijic.studyplans.Entities.Cohorte;
import co.edu.polijic.studyplans.Entities.ContenidoModulo;
import co.edu.polijic.studyplans.Entities.Modulo;
import co.edu.polijic.studyplans.Entities.Semestre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModuloDto {

    private Long idModulo;

    private String nombreModulo;

    private String modalidadModulo;

    private Integer horasTrabajoPresenciales;

    private Integer horasTrabajoAsesoria;

    private Integer horasTrabajoIndependiente;

    private Integer creditosModulo;

    private SemestreDto semestre;

    private ModuloDto prerequisito;

    private ModuloDto correquisito;

    private String actoAdministrativo;

    private Date vigenciaDesde;

    private Date VigenciaHasta;

    private CohorteDto cohorte;

    private List<ContenidoModuloDto> contenido_modulo;

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

    public SemestreDto getSemestre() {
        return semestre;
    }

    public void setSemestre(SemestreDto semestre) {
        this.semestre = semestre;
    }

    public ModuloDto getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(ModuloDto prerequisito) {
        this.prerequisito = prerequisito;
    }

    public ModuloDto getCorrequisito() {
        return correquisito;
    }

    public void setCorrequisito(ModuloDto correquisito) {
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

    public CohorteDto getCohorte() {
        return cohorte;
    }

    public void setCohorte(CohorteDto cohorte) {
        this.cohorte = cohorte;
    }

    public List<ContenidoModuloDto> getContenido_modulo() {
        return contenido_modulo;
    }

    public void setContenido_modulo(List<ContenidoModuloDto> contenido_modulo) {
        this.contenido_modulo = contenido_modulo;
    }
}
