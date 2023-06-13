/**
 *Autor:Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación:9 de junio 2023
 *Fecha de Modificación: 13 de junio 2023
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
	@Autowired // Spring se encarga de gestionar la creacion de los objetos
	private IPacienteRepository repository;
	
	@Transactional 
	/**
	 * Método de creación de registros pacientes
	 */
	public void crearRegistro(Paciente paciente) {
		repository.save(paciente);
	}

	@Transactional 
	/**
	 * Método de eliminación de registros pacientes
	 */
	public void eliminarRegistros(Paciente paciente) {
		repository.delete(paciente);
	}
	
	@Transactional 
	/**
	 * Método para listar los registros pacientes
	 */
	public List<Paciente> obtenerRegistros(Long idPaciente) {
		return repository.obtenerPacientePorAlumno(idPaciente);
	}
	
	@Transactional 
	/**
	 * Método de actualización de pacientes
	 */
	public void actualizarRegistro(Paciente paciente) {
		repository.save(paciente);
	}
	
	/**
	 * Método de listar de pacientes
	 */
	 public Paciente getPacienteByid_Native(int id) {
		 return repository.getPacienteByid_Native(id);
		
	}
	

}
