package UnsisSmile.odonto.edu.UnsisSmile.controller;

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

import UnsisSmile.odonto.edu.UnsisSmile.entity.Alumnos;
import UnsisSmile.odonto.edu.UnsisSmile.entity.SemestreGrupo;
import UnsisSmile.odonto.edu.UnsisSmile.service.AlumnoService;

//microservicios
@RestController
//@CrossOrigin(origins = "http://localhost:42000")
@RequestMapping("/unsis") // http://localhost:8080/api/crear
public class AlumnoController {
	// Inyectar el servicio
	@Autowired
	private AlumnoService service;

	/**
	 * Crea un nuevo objeto Alumnos.
	 *
	 * @param alumno El objeto Alumnos a crear.
	 * @return El objeto Alumnos recién creado.
	 */
	@PostMapping("/crearAlumno")
	public void crearAlumno(@RequestBody Alumnos alumno) {
		service.crearRegistro(alumno);
	}

	/**
	 * Obtiene un objeto Alumnos con el ID especificado.
	 *
	 * @param id El ID del alumno a obtener.
	 * @return El objeto Alumnos correspondiente al ID especificado.
	 */
	@GetMapping("/obtenerAlumnos/{id}")
	public Alumnos obtenerAlumnoId(@PathVariable Integer id) {
		return service.obtenerAlumnos(id);
	}

	/**
	 * Edita un objeto Alumnos con el ID especificado.
	 *
	 * @param id El ID del alumno a editar.
	 * @return El objeto Alumnos editado correspondiente al ID especificado.
	 */
	@PutMapping("/editarAlumnos/{id}")
	public void editarAlumnoId(@RequestBody Alumnos alumno, @PathVariable Integer id) {
		alumno.setIdAlumno(id);
		service.actualizarAlumno(alumno);
	}

	/**
	 * Elimina un objeto Alumnos con el ID especificado.
	 *
	 * @param id El ID del alumno a eliminar.
	 * @return El objeto Alumnos eliminado correspondiente al ID especificado.
	 * 
	 */
	@DeleteMapping("/eliminarAlumno/{id_alumnoAux}")
	public void eliminarRegistro(@PathVariable Integer id_alumnoAux) {
		service.eliminarRegistro(id_alumnoAux);
	}

	/**
	 * Obtiene todos los objetos Alumnos.
	 *
	 * @return Una lista de todos los objetos Alumnos.
	 */
	@GetMapping("/obtenerTodosAlumnos")
	public List<Alumnos> obtenerTodosAlumnos() {
		System.out.println("ingresando....");
		return service.obtenerTodosAlumnos();
	}

}
