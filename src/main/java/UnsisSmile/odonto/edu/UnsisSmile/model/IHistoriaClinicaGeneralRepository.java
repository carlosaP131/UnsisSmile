/**
 * Autor     : Jesús Fernando Hernández Vite 
 * Fecha de creación : 07 jun 2023, 16:55
 * Fecha de modificación: 08 jun 2023, 16:58
 * Descripción : InterfaceHistoriaClinicaGeneralModel 
 */
package UnsisSmile.odonto.edu.UnsisSmile.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.HistoriaClinicaGeneral;

@Repository
public interface IHistoriaClinicaGeneralRepository extends JpaRepository<HistoriaClinicaGeneral, Long>{
	
}
