package co.edu.polijic.studyplans.Dto;

import java.util.Date;

public class ContenidoModuloDto {

    private Long idContenidoModulo;

    private String numUnidad;

    private String descripcionUnidad;

    private Date vigenciaContenido;

    public Long getIdContenidoModulo() {
        return idContenidoModulo;
    }

    public void setIdContenidoModulo(Long idContenidoModulo) {
        this.idContenidoModulo = idContenidoModulo;
    }

    public String getNumUnidad() {
        return numUnidad;
    }

    public void setNumUnidad(String numUnidad) {
        this.numUnidad = numUnidad;
    }

    public String getDescripcionUnidad() {
        return descripcionUnidad;
    }

    public void setDescripcionUnidad(String descripcionUnidad) {
        this.descripcionUnidad = descripcionUnidad;
    }

    public Date getVigenciaContenido() {
        return vigenciaContenido;
    }

    public void setVigenciaContenido(Date vigenciaContenido) {
        this.vigenciaContenido = vigenciaContenido;
    }
}
