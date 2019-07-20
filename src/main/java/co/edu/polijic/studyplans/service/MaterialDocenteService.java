package co.edu.polijic.studyplans.service;

import co.edu.polijic.studyplans.Dto.MaterialDocenteDto;
import co.edu.polijic.studyplans.Entities.MaterialDocente;
import co.edu.polijic.studyplans.utilities.Converters;
import co.edu.polijic.studyplans.repository.MaterialDocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MaterialDocenteService")
public class MaterialDocenteService {

    @Autowired
    @Qualifier("MaterialDocenteRepository")
    private MaterialDocenteRepository materialDocenteRepository;

    @Autowired
    @Qualifier("Converters")
    private Converters converters;

    /*public List<MaterialDocenteDto> getMaterialDocenteList(){
        return converters.listMaterialDocentConverter(materialDocenteRepository.findAll());
    }*/

    public void saveOrUpdateMaterialDocente(MaterialDocente materialDocente){
        try {
            materialDocenteRepository.save(materialDocente);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
