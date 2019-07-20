package co.edu.polijic.studyplans.repository;

import co.edu.polijic.studyplans.Entities.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("ModuloRepository")
public interface ModuloRepository extends JpaRepository <Modulo, Serializable> {

}
