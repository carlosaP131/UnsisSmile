/**
 *Autor:Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación:9 de junio 2023
 *Fecha de Modificación: 9 de junio 2023
 *Descripción:clase service para Paciente
 */

package UnsisSmile.odonto.edu.UnsisSmile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Paciente;
import UnsisSmile.odonto.edu.UnsisSmile.model.IPacienteRepository;

@Service
public class PacienteService {
	@Autowired 
	private IPacienteRepository repository;
	
	
	@Transactional 
	public void crearRegistro(Paciente paciente) {
		repository.save(paciente);
	}
	
	@Transactional 
	public void eliminarRegistros(Long idPaciente) {
		repository.deleteById(idPaciente);
	}
	
	@Transactional 
	public List<Paciente> obtenerRegistros(Long idPaciente) {
		return repository.obtenerPacientePorAlumno(idPaciente);
	}
	
//	public void actualizarRegistro(Paciente paciente) {
//		repository.save(paciente);
//	}
	@Transactional 
	public void actualizarRegistro(int id,String nombre1, String nombre2) {
		repository.getActualizarPaciente(id,nombre1,nombre2);
	}
	
	

}
