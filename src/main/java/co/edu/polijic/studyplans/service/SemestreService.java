package co.edu.polijic.studyplans.service;

import co.edu.polijic.studyplans.Dto.SemestreDto;
import co.edu.polijic.studyplans.Entities.Semestre;
import co.edu.polijic.studyplans.repository.SemestreRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("SemestreService")
public class SemestreService {

    @Autowired
    @Qualifier("SemestreRepository")
    private SemestreRepository semestreRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void saveSemestre(SemestreDto semestreDto){
        try {
            Semestre semestre = modelMapper.map(semestreDto, Semestre.class);
            semestreRepository.save(semestre);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateSemestre(SemestreDto semestreDto){
        try {
            Semestre semestre = modelMapper.map(semestreDto, Semestre.class);
            semestreRepository.save(semestre);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<SemestreDto> getSemestreList(){
        List<Semestre> semestres = semestreRepository.findAll();
        return semestres.stream().map(semestre -> modelMapper.map(semestre, SemestreDto.class)).collect(Collectors.toList());
    }
}
