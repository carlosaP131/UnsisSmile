/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:09 de junio del 2023
 *Fecha de Modificación:13 de junio 2023
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
import UnsisSmile.odonto.edu.UnsisSmile.service.AdministadoresService;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
//Ruta base para todas las solicitudes en este controlador
@RequestMapping("/unsis")
public class AdministradoresController {

	@Autowired // Inyección de dependencia del servicio AdministradoresService
	private AdministadoresService service;

	// Ruta para crear un nuevo administrador
	@PostMapping("/crearAdministrador")
	public void crearRegistro(@RequestBody Administradores administradores) {
		// Llama al método del servicio para crear un nuevo registro de administrador
		service.crearRegistro(administradores);
	}

	// Ruta para eliminar administrador
	@DeleteMapping("/eliminarAdministrador/{id_admin}")
	public void eliminarRegistro(@PathVariable Integer id_admin) {
		// Llama al método del servicio para eliminar un registro de administrador
		service.eliminarRegistro(id_admin);
	}

	// Ruta para obtener un administrador por id
	@GetMapping("/obtenerAdministradorPorId/{idAdministrador}")
	public Administradores obtenerRegistroById(@PathVariable Integer idAdministrador) {
		// Llama al método del servicio para obtener un registro de administrador por id
		return service.obtenerRegistroById(idAdministrador);
	}

	// Ruta para listar todos los administradores
	@GetMapping("/listarTodosAdministradores")
	public List<Administradores> listarTodosRegistros() {
		// Llama al método del servicio para listar todos los administradores
		return service.obtenerTodosRegistro();
	}

	// Ruta para actualizar un administrador
	@PutMapping("/actualizarAdministrador/{id}")
	public void actualizarRegistro(@RequestBody Administradores administradores, @PathVariable Integer id) {
		// Actualiza el ID del administrador con el valor proporcionado
		administradores.setIdAdministrador(id);
		/// Llama al método del servicio para actualizar el registro de administrador
		service.actualizarRegistro(administradores);
	}

}
