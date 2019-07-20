package co.edu.polijic.studyplans.Dto;


public class MaterialDocenteDto {

    private Long idMaterialDocente;
    private String descripcion;
    private String linkMaterialAdicional;


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

}
