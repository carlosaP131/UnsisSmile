package UnsisSmile.odonto.edu.UnsisSmile.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.HistoriaClinicaGeneral;

@Repository
public interface IHistoriaClinicaGeneralRepository extends JpaRepository<HistoriaClinicaGeneral, Long>{
	
}
