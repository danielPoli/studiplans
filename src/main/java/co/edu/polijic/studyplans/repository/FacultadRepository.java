package co.edu.polijic.studyplans.repository;

import co.edu.polijic.studyplans.Entities.Facultad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("FacultadRepository")
public interface FacultadRepository extends JpaRepository<Facultad, Serializable> {
}
