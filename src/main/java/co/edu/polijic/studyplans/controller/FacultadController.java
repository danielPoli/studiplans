package co.edu.polijic.studyplans.controller;

import co.edu.polijic.studyplans.Dto.FacultadDto;
import co.edu.polijic.studyplans.service.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/facultades")
public class FacultadController {

    @Autowired
    @Qualifier("FacultadService")
private FacultadService facultadService;

    @GetMapping("/facultadesList")
    public List<FacultadDto> facultadesList(){
        return facultadService.getFacultades();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/saveFacultad")
    public void saveFacultad(@RequestBody @Valid FacultadDto facultadDto){
        facultadService.saveFacultad(facultadDto);
    }

    @PutMapping("/updateFacultad")
    public void updateFacultad(@RequestBody @Valid FacultadDto facultadDto){
        facultadService.saveFacultad(facultadDto);
    }

}
