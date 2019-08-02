package co.edu.polijic.studyplans.repository;

import co.edu.polijic.studyplans.Entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("DocenteRepository")
public interface DocenteRepository extends JpaRepository<Docente, Serializable> {


    public abstract Docente findByIdDocente(Long idDocente);

}
