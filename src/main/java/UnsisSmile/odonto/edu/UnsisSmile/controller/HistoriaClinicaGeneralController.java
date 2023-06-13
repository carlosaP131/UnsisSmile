/**
 *Autor: Jesús Fernando Hernández Vite
 *Fecha de creación : 08 jun 2023, 08:45
 *Fecha de modificación: 08 jun 2023, 16:58
 *Descripcion: Clases para el crud del cuestionario de los datos del paciente, 
 *donde los alumnos rellenaran el cuestionario con los datos recabados.
 */
package UnsisSmile.odonto.edu.UnsisSmile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UnsisSmile.odonto.edu.UnsisSmile.entity.HistoriaClinicaGeneral;
import UnsisSmile.odonto.edu.UnsisSmile.service.HistoriaClinicaGeneralService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/unsis")
public class HistoriaClinicaGeneralController {
	// Spring se encarga de gestionar la creacion de los objetos
	@Autowired 
	private HistoriaClinicaGeneralService service;
	
	//Método POST de invocación de service para creación de registros 
	@PostMapping("/crearHCG")
	public void crearRegistro(@RequestBody HistoriaClinicaGeneral HistoriaClinicaGeneral) {
		service.crearRegistro(HistoriaClinicaGeneral);
	}
	
	//Método GET de invocación de service para listar los registros HCG
	@GetMapping("/listarHCG")
	public List<HistoriaClinicaGeneral> listarRegistros() {
		return service.obtenerRegistros();
	}
	
	//Método DELETE de invocación de service para eliminación de registros
	@DeleteMapping("/eliminarHCG/{id}")
	public void eliminarRegistro(@PathVariable Long id) {
		service.eliminarRegistro(id);
	}
	//Método GET de invocación de service para listar un registro especificado mediante un id
	@GetMapping("/listarHCGById/{id}")
	public HistoriaClinicaGeneral obtenerRegistroById(@PathVariable Long id) {
		return service.obtenerRegistroById(id);
	}
	
	//Método PUT de invocación de service para actualización de registros
	@PutMapping("/actualizarHCG/{id}")
	public void actualizarRegistro(@RequestBody HistoriaClinicaGeneral HistoriaClinicaGeneral, @PathVariable Integer id) {
		HistoriaClinicaGeneral.setIdHistoriaClinicaGeneral(id);
		service.actualizarRegistro(HistoriaClinicaGeneral);
	}
}
