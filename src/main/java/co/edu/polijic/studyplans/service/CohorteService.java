package co.edu.polijic.studyplans.service;

import co.edu.polijic.studyplans.Dto.CohorteDto;
import co.edu.polijic.studyplans.Entities.Cohorte;
import co.edu.polijic.studyplans.repository.CohorteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("CohorteService")
public class CohorteService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    @Qualifier("CohorteRepository")
    private CohorteRepository cohorteRepository;

    public List<CohorteDto> getCohorteList(){
        List<Cohorte> cohortes = cohorteRepository.findAll();
        return cohortes.stream().map(cohorte -> modelMapper.map(cohorte, CohorteDto.class)).collect(Collectors.toList());
    }

    public void saveCohorte(CohorteDto cohorteDto){
        try{
            Cohorte cohorte = modelMapper.map(cohorteDto, Cohorte.class);
            cohorteRepository.save(cohorte);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
