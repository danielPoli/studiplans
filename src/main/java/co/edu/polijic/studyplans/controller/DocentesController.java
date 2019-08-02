package co.edu.polijic.studyplans.controller;

import co.edu.polijic.studyplans.Dto.DocenteDto;
import co.edu.polijic.studyplans.Entities.Docente;
import co.edu.polijic.studyplans.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/docentes")
public class DocentesController {

    @Autowired
    @Qualifier("DocenteService")
    private DocenteService docenteService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/teachersList")
    public List<DocenteDto> docentesList(){
        return docenteService.getDocentesList();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/saveTeachers")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void saveDocente(@RequestBody @Valid DocenteDto requestDto){
        docenteService.saveDocente(requestDto);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getTeacher/{id}")
    public DocenteDto getDocente(@PathVariable Long id){
        return docenteService.getDocente(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/delteTeacher/{id}")
    public void deleteDocente(@PathVariable Long id){
        docenteService.deleteDocente(id);
    }

    @PutMapping("/updateTeachers")
    public void updateDocente(@RequestBody @Valid DocenteDto requestDto){
        docenteService.updateDocente(requestDto);
    }
}
