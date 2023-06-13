/**
 *Autor:Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación:9 de junio 2023
 *Fecha de Modificación: 13 de junio 2023
 *Descripción:clase controller para Paciente
 */

package UnsisSmile.odonto.edu.UnsisSmile.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Paciente;
import UnsisSmile.odonto.edu.UnsisSmile.service.PacienteService;

@RestController
//@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/unsis")// http:localhost:8080/api/crear
public class PacienteController {
	@Autowired
	private PacienteService service;
	
	@DeleteMapping("/eliminarPaciente/{id}")
	/**
	 * Método DELETE de invocación de service para eliminación de registros
	 */
	public void eliminarRegistro(Paciente paciente,@PathVariable Integer id )  {
		paciente.setIdPaciente(id);
		service.eliminarRegistros(paciente);
	}
	
	@PostMapping("/crearPaciente")
	/**
	 * Método POST de invocación de service para creación de registros 
	 */
	public void crearRegistro(@RequestBody Paciente paciente) {
		service.crearRegistro(paciente);
	}
	
	@GetMapping("/obtenerPacientePorId/{id}")
	/**
	 * Método GET de invocación de service para listar un registro especificado mediante un id
	 */
	public List<Paciente> obtenerRegistro(@PathVariable Long idpaciente){
		return service.obtenerRegistros(idpaciente);
	}
	
	@PutMapping("/actualizarPaciente/{id}")
	/**
	 * Método PUT de invocación de service para actualización de registros
	 */
	public void actualizarRegistro(@RequestBody Paciente paciente) {
		service.actualizarRegistro(paciente);
	}
	
	/**
	 * Método GET de invocación de service para actualización de registros
	 */
	@GetMapping("/obtenerPaciente/{id}")
	 public Paciente getPacienteByid_Native(@PathVariable int id) {
		 return service.getPacienteByid_Native(id);
	}
	 
	
}
