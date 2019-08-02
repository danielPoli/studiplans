package co.edu.polijic.studyplans.service;

import co.edu.polijic.studyplans.Dto.ModuloDto;
import co.edu.polijic.studyplans.Entities.Modulo;
import co.edu.polijic.studyplans.utilities.Converters;
import co.edu.polijic.studyplans.repository.ModuloRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("ModuloService")
public class ModuloService {

    @Autowired
    @Qualifier("ModuloRepository")
    private ModuloRepository moduloRepository;

    @Autowired
    @Qualifier("Converters")
    private Converters converters;

    @Autowired
    private ModelMapper modelMapper;

    public List<ModuloDto> getModuloDtoList(){
        List<Modulo> modulos = moduloRepository.findAll();
        return modulos.stream().map(modulo -> modelMapper.map(modulo, ModuloDto.class)).collect(Collectors.toList());
    }

    public void saveModulo(ModuloDto moduloDto){
        try {
            Modulo modulo = modelMapper.map(moduloDto, Modulo.class);
            modulo.getContenido_modulo().forEach(contenidoModulo -> contenidoModulo.setModulo(modulo));
            moduloRepository.save(modulo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateModulo(Modulo modulo){
        try {
            moduloRepository.save(modulo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ModuloDto getModulo(Long idModulo){
        Modulo modulo = moduloRepository.findByIdModulo(idModulo);
        ModuloDto moduloDto = modelMapper.map(modulo, ModuloDto.class);
        return moduloDto;
    }
}
