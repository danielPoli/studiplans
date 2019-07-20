package co.edu.polijic.studyplans.controller;

import co.edu.polijic.studyplans.Dto.TipoDocumentoDto;
import co.edu.polijic.studyplans.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoController {

    @Autowired
    @Qualifier("TipoDocumentoService")
    private TipoDocumentoService tipoDocumentoService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/tipodocumentoList")
    public List<TipoDocumentoDto> getDocenteList(){
        return tipoDocumentoService.getTipoDocumentoList();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/saveTipoDocumento")
    public void saveTipoDocumento(@RequestBody @Valid TipoDocumentoDto tipoDocumentoDto){
        tipoDocumentoService.saveTipoDocumento(tipoDocumentoDto);
    }

    @PutMapping("/updateTipoDocumento")
    public void updateTipoDocumento(@RequestBody @Valid TipoDocumentoDto tipoDocumentoDto){
        tipoDocumentoService.updateTipoDocumento(tipoDocumentoDto);
    }
}
