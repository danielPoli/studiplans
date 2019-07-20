package co.edu.polijic.studyplans.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Table(name="docente")
@Entity
public class Docente implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_DOCENTE")
    private Long idDocente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_DOCUMENTO")
    private TipoDocumento tipoDocumento;

    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    @Column(name = "FECHA_VINCULACION")
    private Date fechaVinculacion;

    @Column(name = "CORREO_INSTITUCIONAL")
    private String correoInstitucional;

    @Column(name = "CORREO_PERSONAL")
    private String correoPersonal;

    @Column(name = "TITULO_MAS_ALTO")
    private String tituloMasAlto;

    @OneToMany(mappedBy = "docente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MaterialDocente> materialDocenteList;

    public Docente() {
    }

    public Docente(TipoDocumento tipoDocumento, String numeroDocumento, String nombre, String primerApellido, String segundoApellido, Date fechaVinculacion, String correoInstitucional, String correoPersonal, String tituloMasAlto, List<MaterialDocente> materialDocenteList) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaVinculacion = fechaVinculacion;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.tituloMasAlto = tituloMasAlto;
        this.materialDocenteList = materialDocenteList;
    }

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getTituloMasAlto() {
        return tituloMasAlto;
    }

    public void setTituloMasAlto(String tituloMasAlto) {
        this.tituloMasAlto = tituloMasAlto;
    }

    public List<MaterialDocente> getMaterialDocenteList() {
        return materialDocenteList;
    }

    public void setMaterialDocenteList(List<MaterialDocente> materialDocenteList) {
        this.materialDocenteList = materialDocenteList;
    }
}
