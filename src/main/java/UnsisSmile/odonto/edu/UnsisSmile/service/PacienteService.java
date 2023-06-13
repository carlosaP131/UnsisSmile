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
	@Autowired // Spring se encarga de gestionar la creacion de los objetos
	private IPacienteRepository repository;
	
	@Transactional 
	/**
	 * Método de creación de registros 
	 */
	public void crearRegistro(Paciente paciente) {
		repository.save(paciente);
	}
	
	
	@Transactional 
	/**
	 * Método de eliminación de registros
	 */
	public void eliminarRegistros(Paciente paciente) {
		repository.delete(paciente);
	}
	
	
	@Transactional 
	/**
	 * Método para listar los registros paciente
	 */
	public List<Paciente> obtenerRegistros(Long idPaciente) {
		return repository.obtenerPacientePorAlumno(idPaciente);
	}
	
	@Transactional 
	/**
	 * Método de actualización de registros
	 */
	public void actualizarRegistro(Paciente paciente) {
		repository.save(paciente);
	}
	
//	@Transactional 
//	public void actualizarRegistro(int id,String nombre1, String nombre2) {
//		repository.getActualizarPaciente(id,nombre1,nombre2);
//	}
	
	

}
