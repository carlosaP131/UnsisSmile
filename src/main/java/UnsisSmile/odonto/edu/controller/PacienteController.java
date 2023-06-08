package UnsisSmile.odonto.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import UnsisSmile.odonto.edu.entity.Paciente;


import UnsisSmile.odonto.edu.service.PacienteService;

@RestController
@RequestMapping("/unsis")
public class PacienteController {
	@Autowired
	private PacienteService service;
	
	@DeleteMapping("/eliminar/{id}")
	public void actualizarRegistro(@PathVariable Long idPaciente) {
		Paciente paciente = new Paciente();
		paciente.setIdPaciente(idPaciente);
		service.eliminarRegistros(paciente);
	}
}
