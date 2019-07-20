package co.edu.polijic.studyplans.service;

import co.edu.polijic.studyplans.Dto.FacultadDto;
import co.edu.polijic.studyplans.Entities.Facultad;
import co.edu.polijic.studyplans.Entities.Programa;
import co.edu.polijic.studyplans.repository.FacultadRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("FacultadService")
public class FacultadService {

    @Autowired
    @Qualifier("FacultadRepository")
    private FacultadRepository facultadRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void saveFacultad(FacultadDto facultadDto){
        try {
            Facultad facultad = modelMapper.map(facultadDto, Facultad.class);
            facultad.getProgramaList().forEach(programa -> programa.setFacultad(facultad));
            facultadRepository.save(facultad);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<FacultadDto> getFacultades(){
        List<Facultad> facultades = facultadRepository.findAll();
        return facultades.stream().map(facultad -> modelMapper.map(facultad, FacultadDto.class)).collect(Collectors.toList());
    }
}
