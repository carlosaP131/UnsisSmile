package UnsisSmile.odonto.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UnsisSmile.odonto.edu.entity.HistoriaClinicaGeneral;
import UnsisSmile.odonto.edu.service.HistoriaClinicaGeneralService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class HistoriaClinicaGeneralController {
	@Autowired // Spring se encarga de gestionar la creacion de los objetos
	private HistoriaClinicaGeneralService service;
	
	@PostMapping("/crearHCG")
	public void crearRegistro(@RequestBody HistoriaClinicaGeneral HistoriaClinicaGeneral) {
		service.crearRegistro(HistoriaClinicaGeneral);
	}
	
	@GetMapping("/listarHCG")
	public List<HistoriaClinicaGeneral> listarRegistros() {
		return service.obtenerRegistros();
	}
	
	@DeleteMapping("/eliminarHCG/{id}")
	public void eliminarRegistro(@PathVariable Long id) {
		service.eliminarRegistro(id);
	}
	
	@GetMapping("/listarHCGById/{id}")
	public HistoriaClinicaGeneral obtenerRegistroById(@PathVariable Long id) {
		return service.obtenerRegistroById(id);
	}
	
	@PutMapping("/actualizarHCG/{id}")
	public void actualizarRegistro(@RequestBody HistoriaClinicaGeneral HistoriaClinicaGeneral, @PathVariable Integer id) {
		HistoriaClinicaGeneral.setIdHistoriaClinicaGeneral(id);
		service.actualizarRegistro(HistoriaClinicaGeneral);
	}
}
