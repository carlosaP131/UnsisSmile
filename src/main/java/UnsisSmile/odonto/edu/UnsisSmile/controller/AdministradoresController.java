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

/**
 * Ruta base para todas las solicitudes en este controlador
 * 
 * @author labingsw03
 *
 */
@RequestMapping("/unsis")
public class AdministradoresController {

	@Autowired
	/**
	 * Inyección de dependencia del servicio AdministradoresService
	 */
	private AdministadoresService service;

	/**
	 * Ruta para crear un nuevo administrador Llama al método del servicio para
	 * crear un nuevo registro de administrador
	 * 
	 * @param administradores
	 */
	@PostMapping("/crearAdministrador")

	public void crearRegistro(@RequestBody Administradores administradores) {
		service.crearRegistro(administradores);
	}

	/**
	 * Ruta para eliminar administrador Llama al método del servicio para eliminar
	 * un registro de administrador
	 * 
	 * @param id_admin
	 */
	@DeleteMapping("/eliminarAdministrador/{id_admin}")
	public void eliminarRegistro(@PathVariable Integer id_admin) {
		service.eliminarRegistro(id_admin);
	}

	/**
	 * Ruta para obtener un administrador por id Llama al método del servicio para
	 * obtener un registro de administrador por id
	 * 
	 * @param idAdministrador
	 * @return
	 */
	@GetMapping("/obtenerAdministradorPorId/{idAdministrador}")
	public Administradores obtenerRegistroById(@PathVariable Integer idAdministrador) {
		return service.obtenerRegistroById(idAdministrador);
	}

	/**
	 * Ruta para listar todos los administradores Llama al método del servicio para
	 * listar todos los administradores
	 * 
	 * @return
	 */
	@GetMapping("/listarTodosAdministradores")
	public List<Administradores> listarTodosRegistros() {
		return service.obtenerTodosRegistro();
	}

	/**
	 * Ruta para actualizar un administrador Actualiza el ID del administrador con
	 * el valor proporcionado Llama al método del servicio para actualizar el
	 * registro de administrador
	 * 
	 * @param administradores
	 * @param id
	 */
	@PutMapping("/actualizarAdministrador/{id}")
	public void actualizarRegistro(@RequestBody Administradores administradores, @PathVariable Integer id) {

		administradores.setIdAdministrador(id);

		service.actualizarRegistro(administradores);
	}

}
