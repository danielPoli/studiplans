package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "MATERIAL_DOCENTE")
@Entity
public class MaterialDocente implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_MATERIAL_DOCENTE")
    private Long idMaterialDocente;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "LINK_MATERIAL_ADICIONAL")
    private String linkMaterialAdicional;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOCENTE", referencedColumnName = "ID_DOCENTE")
    private Docente docente;

    public MaterialDocente() {
    }

    public MaterialDocente(String descripcion, String linkMaterialAdicional, Docente docente) {
        this.descripcion = descripcion;
        this.linkMaterialAdicional = linkMaterialAdicional;
        this.docente = docente;
    }

    public Long getIdMaterialDocente() {
        return idMaterialDocente;
    }

    public void setIdMaterialDocente(Long idMaterialDocente) {
        this.idMaterialDocente = idMaterialDocente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLinkMaterialAdicional() {
        return linkMaterialAdicional;
    }

    public void setLinkMaterialAdicional(String linkMaterialAdicional) {
        this.linkMaterialAdicional = linkMaterialAdicional;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
