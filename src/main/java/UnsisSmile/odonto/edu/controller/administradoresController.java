package UnsisSmile.odonto.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import UnsisSmile.odonto.edu.entity.Administradores;
import UnsisSmile.odonto.edu.service.administadoresService;

@RestController
//@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/api") // http:localhost:8080/api/crear
public class administradoresController {

	@Autowired
	private administadoresService service;

	@PostMapping("/crear")
	public void crearRegistro(@RequestBody Administradores administradores) {
		service.crearRegistro(administradores);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarRegistro(@PathVariable Integer id_administrador) {
		service.eliminarRegistro(id_administrador);
	}
	@GetMapping("/obtenerAdministradorPorId/{id}")
	public Administradores obtenerRegistroById(@PathVariable int id_admi) {
		return service.obtenerRegistroById(id_admi);}
	
}
