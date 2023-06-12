/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:09 de junio del 2023
 *Fecha de Modificación:
 *Descripción: se crea la clase del administradoresController para implementar los métodos correspondientes
 *             
 *             
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
import UnsisSmile.odonto.edu.UnsisSmile.entity.Administradores;
import UnsisSmile.odonto.edu.UnsisSmile.service.administadoresService;

@RestController
//@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/unsis") // http:localhost:8080/api/crear
public class administradoresController {

	@Autowired
	private administadoresService service;

	@PostMapping("/crear")
	public void crearRegistro(@RequestBody Administradores administradores) {
		service.crearRegistro(administradores);
	}
	
	@DeleteMapping("/eliminar/{id_admin}")
	public void eliminarRegistro(@PathVariable Integer id_admin) {
		service.eliminarRegistro(id_admin);
	}
	@GetMapping("/obtenerAdministradorPorId/{idAdministrador}")

	public Administradores obtenerRegistroById(@PathVariable Integer idAdministrador) {
		System.out.println("tamaño: ");
		return service.obtenerRegistroById(idAdministrador);}
	
	@GetMapping("/listar")
	public  List<Administradores>listarTodosRegistros() {
		System.out.println("tamaño: " + service.obtenerTodosRegistro());
		return service.obtenerTodosRegistro();
	}
	@PutMapping("/actualizar/{id}")
	public void actualizarRegistro(@RequestBody Administradores administradores, @PathVariable Integer id) {
		administradores.setIdAdministrador(id);
		service.actualizarRegistro(administradores);
		}
	
}
