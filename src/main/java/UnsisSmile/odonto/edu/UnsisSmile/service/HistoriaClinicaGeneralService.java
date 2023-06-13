/**
 * Autor     : Jesús Fernando Hernández Vite 
 * Fecha de creación : 07 jun 2023, 16:55
 * Fecha de modificación: 08 jun 2023, 16:58
 * Descripción : HistoriaClinicaGeneralService clase de servicios
 */
package UnsisSmile.odonto.edu.UnsisSmile.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import UnsisSmile.odonto.edu.UnsisSmile.entity.HistoriaClinicaGeneral;
import UnsisSmile.odonto.edu.UnsisSmile.model.IHistoriaClinicaGeneralRepository;

@Service
public class HistoriaClinicaGeneralService {
	/**
	 *  Spring se encarga de gestionar la creacion de los objetos
	 */
	@Autowired 
	private IHistoriaClinicaGeneralRepository repository;

	/**
	 * Método de creación de registros 
	 * @param HistoriaClinicaGeneral
	 */
	public void crearRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral) {
		repository.save(HistoriaClinicaGeneral);
	}
	
	/**
	 * Método para listar los registros HCG
	 * @return
	 */
	public List<HistoriaClinicaGeneral> obtenerRegistros() {
		return repository.findAll();
	}

	/**
	 * Método de eliminación de registros
	 * @param id
	 */
	public void eliminarRegistro(Long id) {
		repository.deleteById(id);
	}

	/**
	 * Método de actualización de registros
	 * @param HistoriaClinicaGeneral
	 */
	public void actualizarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral) {
		repository.save(HistoriaClinicaGeneral);
	}
	
	/**
	 * Método de muestra de un registro especificado mediante un id
	 * @param id
	 * @return
	 */
	public HistoriaClinicaGeneral obtenerRegistroById(Long id) {
		return repository.findById(id).get();
	}
}
