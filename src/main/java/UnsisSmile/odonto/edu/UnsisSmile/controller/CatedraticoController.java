/**
 * Autor: Baldomero Sainos Hernández 
 * Autor de modificación: Baldomero Sainos Hernández
 * Fecha creación: 05 de Junio de 2023
 * Fecha modificación: 09 mayo de 2023
 * Descripción: Clase CAtedraticoController, se modelo el crud de dicho objeto
 *              implementando la clase interfaz
 */
package UnsisSmile.odonto.edu.UnsisSmile.controller;

import java.util.List;

//Librerias importadas para el dasarrollo del controller. 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Catedraticos;
import UnsisSmile.odonto.edu.UnsisSmile.service.CatedraticosService;


@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/unsis")
public class CatedraticoController {
	
	@Autowired
	private CatedraticosService service;


	@PostMapping("/crearCatedra")
	public void crearRegistro(@RequestBody Catedraticos catedraticos) {
		service.crearRegistro(catedraticos);
	}
	
	@DeleteMapping("/eliminarCatedra/{id_catedratico}")
	public void eliminarRegistro(@PathVariable Integer id_catedratico) {
		service.eliminarRegistro(id_catedratico);
	}
	
	@GetMapping("/obtenerCatedratico/{id_catedratico}")
	public Catedraticos obteneCatedratico(@PathVariable Integer id_catedratico) {
		return service.obtenerCatedratico(id_catedratico);
		}
	
	@GetMapping("/listarTodosCatedraticos")
	public  List<Catedraticos>listarTodosCatedraticos() {
		return service.obtenerTodosCatedraticos();
	}
//	
//	@PutMapping("/actualizarCatedra/{id}")
//	public void actualizarRegistro(@RequestBody Catedraticos catedraticos, @PathVariable int id) {
//		catedraticos.setIdCatedratico(id);
//		service.actualizarRegistro(catedraticos);}
	
	
	
}

