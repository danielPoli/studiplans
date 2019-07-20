package co.edu.polijic.studyplans.repository;

import co.edu.polijic.studyplans.Entities.Cohorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("CohorteRepository")
public interface CohorteRepository extends JpaRepository<Cohorte, Serializable> {
}
