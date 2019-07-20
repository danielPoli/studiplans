package co.edu.polijic.studyplans.repository;

import co.edu.polijic.studyplans.Entities.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("TipoDocumentoRepository")
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Serializable> {
}
