package co.edu.polijic.studyplans.service;

import co.edu.polijic.studyplans.Dto.DocenteDto;
import co.edu.polijic.studyplans.Entities.Docente;
import co.edu.polijic.studyplans.utilities.Converters;
import co.edu.polijic.studyplans.repository.DocenteRepository;
import co.edu.polijic.studyplans.repository.MaterialDocenteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("DocenteService")
public class DocenteService {

    @Autowired
    @Qualifier("DocenteRepository")
    private DocenteRepository docenteRepository;


    @Autowired
    @Qualifier("Converters")
    private Converters converters;

    @Autowired
    private ModelMapper modelMapper;

    public void saveDocente(DocenteDto requestDto){
        try{
            Docente docente = converters.convertToEntity(requestDto);
            docenteRepository.save(docente);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateDocente(DocenteDto requestDto){
        try{
            Docente docente = converters.convertToEntity(requestDto);
            docenteRepository.save(docente);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteDocente(Long idDocente ){
        try{
            Docente docente = docenteRepository.findByIdDocente(idDocente);
            docenteRepository.delete(docente);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<DocenteDto> getDocentesList(){
        List<Docente> docentes = docenteRepository.findAll();
        return docentes.stream().map(docente -> modelMapper.map(docente, DocenteDto.class)).collect(Collectors.toList());
    }

    public DocenteDto getDocente(Long idDocente){

        Docente docente = docenteRepository.findByIdDocente(idDocente);
        DocenteDto docenteDto  = modelMapper.map(docente, DocenteDto.class);
        return  docenteDto;
    }


}
