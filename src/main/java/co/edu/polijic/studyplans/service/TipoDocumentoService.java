package co.edu.polijic.studyplans.service;

import co.edu.polijic.studyplans.Dto.TipoDocumentoDto;
import co.edu.polijic.studyplans.Entities.TipoDocumento;
import co.edu.polijic.studyplans.repository.TipoDocumentoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("TipoDocumentoService")
public class TipoDocumentoService {

    @Autowired
    @Qualifier("TipoDocumentoRepository")
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private ModelMapper modelMapper;

    public void saveTipoDocumento(TipoDocumentoDto tipoDocumentoDto){
        try{
            TipoDocumento tipoDocumento = modelMapper.map(tipoDocumentoDto, TipoDocumento.class);
            tipoDocumentoRepository.save(tipoDocumento);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateTipoDocumento(TipoDocumentoDto tipoDocumentoDto){
        try{
            TipoDocumento tipoDocumento = modelMapper.map(tipoDocumentoDto, TipoDocumento.class);
            tipoDocumentoRepository.save(tipoDocumento);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<TipoDocumentoDto> getTipoDocumentoList(){
        List<TipoDocumento> tipoDocumentos = tipoDocumentoRepository.findAll();
        return tipoDocumentos.stream().map(tipoDocumento -> modelMapper.map(tipoDocumento, TipoDocumentoDto.class)).collect(Collectors.toList());
    }
}
