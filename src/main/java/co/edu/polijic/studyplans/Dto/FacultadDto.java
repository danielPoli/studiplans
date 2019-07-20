package co.edu.polijic.studyplans.Dto;

import co.edu.polijic.studyplans.Entities.Programa;

import java.util.List;

public class FacultadDto {

    private Long idFacultad;
    private String nombre;
    private List<ProgramaDto> programaList;

    public Long getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Long idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ProgramaDto> getProgramaList() {
        return programaList;
    }

    public void setProgramaList(List<ProgramaDto> programaList) {
        this.programaList = programaList;
    }
}
