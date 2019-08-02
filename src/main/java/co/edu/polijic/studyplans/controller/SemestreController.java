package co.edu.polijic.studyplans.controller;

import co.edu.polijic.studyplans.Dto.SemestreDto;
import co.edu.polijic.studyplans.repository.SemestreRepository;
import co.edu.polijic.studyplans.service.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/semestre")
public class SemestreController {

    @Autowired
    @Qualifier("SemestreService")
    private SemestreService semestreService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/semestrelist")
    public List<SemestreDto> semestres(){
        return semestreService.getSemestreList();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/saveSemestre")
    public void saveSemestre(@RequestBody @Valid SemestreDto semestreDto){
        semestreService.saveSemestre(semestreDto);
    }

    @PutMapping("/updateSemestre")
    public void updateSemestre(@RequestBody @Valid SemestreDto semestreDto){
        semestreService.saveSemestre(semestreDto);
    }


}
