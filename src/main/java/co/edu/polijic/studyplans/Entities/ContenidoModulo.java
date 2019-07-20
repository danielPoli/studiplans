package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "contenido_modulo")
@Entity
public class ContenidoModulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTENIDO_MODULO")
    private Long idContenidoModulo;

    @Column(name = "NUM_UNIDAD")
    private String numUnidad;

    @Column(name = "DESCRIPCION_UNIDAD")
    private String descripcionUnidad;

    @Column(name = "VIGENCIA_CONTENIDO")
    private Date vigenciaContenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODULO", referencedColumnName = "ID_MODULO")
    private Modulo modulo;

    public ContenidoModulo() {
    }

    public ContenidoModulo(String numUnidad, String descripcionUnidad, Date vigenciaContenido, Modulo modulo) {
        this.numUnidad = numUnidad;
        this.descripcionUnidad = descripcionUnidad;
        this.vigenciaContenido = vigenciaContenido;
        this.modulo = modulo;
    }

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

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
