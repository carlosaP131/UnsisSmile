package UnsisSmile.odonto.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import UnsisSmile.odonto.edu.entity.HistoriaClinicaGeneral;
import UnsisSmile.odonto.edu.model.IHistoriaClinicaGeneralRepository;

@Service
public class HistoriaClinicaGeneralService {
	@Autowired // Spring se encarga de gestionar la creacion de los objetos
	private IHistoriaClinicaGeneralRepository repository;

	//HistoriaClinicaGeneral
	public void crearRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral) {
		repository.save(HistoriaClinicaGeneral);
	}

	public List<HistoriaClinicaGeneral> obtenerRegistros() {
		return repository.findAll();
	}

	public void eliminarRegistro(Long id) {
		repository.deleteById(id);
	}

	public void actualizarRegistro(HistoriaClinicaGeneral HistoriaClinicaGeneral) {
		repository.save(HistoriaClinicaGeneral);
	}

	public HistoriaClinicaGeneral obtenerRegistroById(Long id) {
		return repository.findById(id).get();
	}
}
