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
@RequestMapping("/unsis")
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
	
}
