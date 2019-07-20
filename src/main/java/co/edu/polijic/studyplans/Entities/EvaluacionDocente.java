package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "evaluacion_Docente")
@Entity
public class EvaluacionDocente implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_EVALUACION_DOCENTE")
    private Long idEvaluacionDocente;

    @Column(name = "OBSERVACIONES")
    private String observaciones;

    @Column(name = "PUNTAJE")
    private Double puntaje;

    public EvaluacionDocente() {
    }

    public EvaluacionDocente(String observaciones, Double puntaje) {
        this.observaciones = observaciones;
        this.puntaje = puntaje;
    }

    public Long getIdEvaluacionDocente() {
        return idEvaluacionDocente;
    }

    public void setIdEvaluacionDocente(Long idEvaluacionDocente) {
        this.idEvaluacionDocente = idEvaluacionDocente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }
}
