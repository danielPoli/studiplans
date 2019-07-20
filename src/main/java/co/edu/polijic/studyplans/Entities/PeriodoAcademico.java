package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "docente_periodo_academico")
@Entity
public class PeriodoAcademico implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_DOCENTE_PERIODO_ACADEMICO")
    private Long idPeriodoAcademico;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOCENTE")
    private Docente docente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODULO")
    private Modulo modulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EVALUACION_DOCENTE")
    private EvaluacionDocente evaluacionDocente;

    @Column(name = "AÑO")
    private Long ano;

    @Column(name = "PERIODO")
    private Long periodo;


    public PeriodoAcademico() {
    }

    public PeriodoAcademico(Docente docente, Modulo modulo, EvaluacionDocente evaluacionDocente, Long ano, Long periodo) {
        this.docente = docente;
        this.modulo = modulo;
        this.evaluacionDocente = evaluacionDocente;
        this.ano = ano;
        this.periodo = periodo;
    }

    public Long getIdPeriodoAcademico() {
        return idPeriodoAcademico;
    }

    public void setIdPeriodoAcademico(Long idPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public EvaluacionDocente getEvaluacionDocente() {
        return evaluacionDocente;
    }

    public void setEvaluacionDocente(EvaluacionDocente evaluacionDocente) {
        this.evaluacionDocente = evaluacionDocente;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public Long getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }
}
