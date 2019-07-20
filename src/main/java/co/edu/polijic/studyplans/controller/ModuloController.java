package co.edu.polijic.studyplans.controller;

import co.edu.polijic.studyplans.Dto.ModuloDto;
import co.edu.polijic.studyplans.Entities.Modulo;
import co.edu.polijic.studyplans.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/modulo")
public class ModuloController {

    @Autowired
    @Qualifier("ModuloService")
    private ModuloService moduloService;

    @GetMapping("/listModulo")
    public List<ModuloDto> modulosList(){
        return moduloService.getModuloDtoList();
    }

    @PostMapping("/saveModulo")
    public void saveModulo(@RequestBody @Valid ModuloDto moduloDto){
        moduloService.saveModulo(moduloDto);
    }
}
