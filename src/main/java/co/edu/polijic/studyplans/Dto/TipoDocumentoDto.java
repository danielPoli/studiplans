package co.edu.polijic.studyplans.Dto;

public class TipoDocumentoDto {

    private Long idTipoDocumento;

    private String nombreTipoDocumento;

    public TipoDocumentoDto() {
    }

    public TipoDocumentoDto(Long idTipoDocumento, String nombreTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
        this.nombreTipoDocumento = nombreTipoDocumento;
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
}
