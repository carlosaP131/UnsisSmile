package UnsisSmile.odonto.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import UnsisSmile.odonto.edu.entity.Paciente;
import UnsisSmile.odonto.edu.model.IPacienteRepository;

@Service
public class PacienteService {
	@Autowired 
	private IPacienteRepository repository;
	@Transactional 
	public void crearRegistro(Paciente paciente) {
		repository.save(paciente);
	}
	
	@Transactional 
	public void eliminarRegistros(Paciente paciente) {
		repository.delete(paciente);
	}
	
	@Transactional 
	public void obtenerRegistros(Long idPaciente) {
		repository.findById(idPaciente);
	}
	
	public void actualizarRegistro(Paciente paciente) {
		repository.save(paciente);
	}
	
	
	

}
