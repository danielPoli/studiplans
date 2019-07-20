package co.edu.polijic.studyplans.repository;

import co.edu.polijic.studyplans.Entities.MaterialDocente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("MaterialDocenteRepository")
public interface MaterialDocenteRepository extends JpaRepository<MaterialDocente, Serializable> {


}
