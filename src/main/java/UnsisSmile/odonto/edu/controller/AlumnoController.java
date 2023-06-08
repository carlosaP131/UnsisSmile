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

import UnsisSmile.odonto.edu.entity.Alumnos;
import UnsisSmile.odonto.edu.service.AlumnoService;


//microservicios
@RestController
@CrossOrigin(origins = "http://localhost:42000")
@RequestMapping("/api") // http://localhost:8080/api/crear
public class AlumnoController {
	// Inyectar el servicio
		@Autowired
		private AlumnoService service;
		
		@GetMapping("/obtenerAlumnos/{id}")
		public Alumnos obtenerRegistroId(@PathVariable Long id) {
			return service.obtenerAlumnos(id);
		}
		
	
				
}
