package co.edu.polijic.studyplans.utilities;

import co.edu.polijic.studyplans.Dto.DocenteDto;
import co.edu.polijic.studyplans.Dto.ModuloDto;
import co.edu.polijic.studyplans.Entities.Docente;
import co.edu.polijic.studyplans.Entities.Modulo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



@Component("Converters")
public class Converters {

    @Autowired
    private ModelMapper modelMapper;


    public <T> T convertToDto(T entity, Class<T> dto){
        T returnDto = modelMapper.map(entity, dto);
        return returnDto;
    }

    public Docente convertToEntity(DocenteDto docenteDto) {
        Docente docente = modelMapper.map(docenteDto, Docente.class);
        docente.getMaterialDocenteList().forEach(materialDocente -> materialDocente.setDocente(docente));
        return docente;
    }

}
