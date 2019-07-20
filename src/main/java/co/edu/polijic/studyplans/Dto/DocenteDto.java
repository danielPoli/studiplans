package co.edu.polijic.studyplans.Dto;


import java.util.Date;
import java.util.List;

public class DocenteDto {


    private Long idDocente;
    private TipoDocumentoDto tipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaVinculacion;
    private String correoInstitucional;
    private String correoPersonal;
    private String tituloMasAlto;
    private List<MaterialDocenteDto> materialDocenteList;

    public Long getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Long idDocente) {
        this.idDocente = idDocente;
    }

    public TipoDocumentoDto getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoDto tipoDocumento) {
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

    public List<MaterialDocenteDto> getMaterialDocenteList() {
        return materialDocenteList;
    }

    public void setMaterialDocenteList(List<MaterialDocenteDto> materialDocenteList) {
        this.materialDocenteList = materialDocenteList;
    }
}
