package co.edu.polijic.studyplans.controller;

import co.edu.polijic.studyplans.Dto.CohorteDto;
import co.edu.polijic.studyplans.service.CohorteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cohorte")
public class CohorteController {

    @Autowired
    @Qualifier("CohorteService")
    private CohorteService cohorteService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cohorteList")
    public List<CohorteDto> cohorteList(){
        return cohorteService.getCohorteList();
    }

    @PostMapping("/saveCohorte")
    public void saveCohorte(@RequestBody @Valid CohorteDto cohorteDto){
        cohorteService.saveCohorte(cohorteDto);
    }
}
