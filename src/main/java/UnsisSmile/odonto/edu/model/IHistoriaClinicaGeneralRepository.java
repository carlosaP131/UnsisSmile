package UnsisSmile.odonto.edu.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.entity.HistoriaClinicaGeneral;

@Repository
public interface IHistoriaClinicaGeneralRepository extends JpaRepository<HistoriaClinicaGeneral, Long>{
	
}
