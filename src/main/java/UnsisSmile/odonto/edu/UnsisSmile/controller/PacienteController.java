/**
 *Autor:Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación:9 de junio 2023
 *Fecha de Modificación: 9 de junio 2023
 *Descripción:clase controller para Paciente
 */

package UnsisSmile.odonto.edu.UnsisSmile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Administradores;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Paciente;
import UnsisSmile.odonto.edu.UnsisSmile.service.PacienteService;



@RestController
//@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/unsis")// http:localhost:8080/api/crear
public class PacienteController {
	@Autowired
	private PacienteService service;
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarRegistro(@PathVariable Long paciente) {
		service.eliminarRegistros(paciente);
		
	}
	
	@DeleteMapping("/crear")
	public void crearRegistro(@RequestBody Paciente paciente) {
		service.crearRegistro(paciente);
		
	}
	
	@GetMapping("/obtenerPacientePorId/{id}")
	public List<Paciente> obtenerRegistro(@PathVariable Long idpaciente){
		return service.obtenerRegistros(idpaciente);
		
	}
	
	@PutMapping("/actualizar/{id}")
	public void actualizarRegistro(Paciente paciente) {
		service.actualizarRegistro(paciente);
		
	}
	
}
