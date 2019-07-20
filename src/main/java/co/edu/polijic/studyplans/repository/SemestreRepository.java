package co.edu.polijic.studyplans.repository;

import co.edu.polijic.studyplans.Entities.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("SemestreRepository")
public interface SemestreRepository extends JpaRepository<Semestre, Serializable> {
}
