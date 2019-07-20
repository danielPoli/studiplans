package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name = "tipo_documento")
@Entity
public class TipoDocumento implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TIPO_DOCUMENTO")
    private Long idTipoDocumento;

    @Column(name = "NOMBRE_TIPO_DOCUMENTO")
    private String nombreTipoDocumento;

    @OneToMany(mappedBy = "tipoDocumento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Docente> docenteList = new ArrayList<>();

    public TipoDocumento() {
    }

    public TipoDocumento(String nombreTipoDocumento, List<Docente> docenteList) {
        this.nombreTipoDocumento = nombreTipoDocumento;
        this.docenteList = docenteList;
    }

    public Long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNombreTipoDocumento() {
        return nombreTipoDocumento;
    }

    public void setNombreTipoDocumento(String nombreTipoDocumento) {
        this.nombreTipoDocumento = nombreTipoDocumento;
    }

    public List<Docente> getDocenteList() {
        return docenteList;
    }

    public void setDocenteList(List<Docente> docenteList) {
        this.docenteList = docenteList;
    }
}
