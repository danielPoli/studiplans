package co.edu.polijic.studyplans.controller;

import co.edu.polijic.studyplans.Dto.MaterialDocenteDto;
import co.edu.polijic.studyplans.Entities.MaterialDocente;
import co.edu.polijic.studyplans.service.MaterialDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/materialDocentes")
public class MaterialDocenteController {

    @Autowired
    @Qualifier("MaterialDocenteService")
    private MaterialDocenteService materialDocenteService;

    /*@GetMapping("/listMaterial")
    public List<MaterialDocenteDto> materialDocenteDtoList(){
        return materialDocenteService.getMaterialDocenteList();
    }*/

    @PostMapping("/saveMaterial")
    public void saveMaterial(@RequestBody @Valid MaterialDocente materialDocente){
        materialDocenteService.saveOrUpdateMaterialDocente(materialDocente);
    }

    @PutMapping("/updateMaterial")
    public void updateMaterial(@RequestBody @Valid MaterialDocente materialDocente){
        materialDocenteService.saveOrUpdateMaterialDocente(materialDocente);
    }
}
