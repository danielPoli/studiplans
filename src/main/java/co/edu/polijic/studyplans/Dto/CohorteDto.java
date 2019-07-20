package co.edu.polijic.studyplans.Dto;

import java.util.Date;

public class CohorteDto {

    private Long idCohorte;

    private Date fechaInicioCohorte;

    private Date fechaFinCohorte;

    private boolean publicado;

    private ProgramaDto cohortePrograma;

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

    public boolean isPublicado() {
        return publicado;
    }

    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }

    public ProgramaDto getCohortePrograma() {
        return cohortePrograma;
    }

    public void setCohortePrograma(ProgramaDto cohortePrograma) {
        this.cohortePrograma = cohortePrograma;
    }
}
