package UnsisSmile.odonto.edu.UnsisSmile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Alumnos;
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
	//public Alumnos editarAlumnoId(@PathVariable Alumnos alumnos) {
		//return service.actualizarAlumno(alumnos.getIdAlumno(), alumnos.getNombre(), alumnos.getNombre2(), alumnos.getApellido(), alumnos.getApellido2(), alumnos.getSexo(), alumnos.getCurp(), alumnos.getSemestreGrupo().getIdSemestreGrupo(), alumnos.getMatricula(), alumnos.getTelefono(), alumnos.getEmailAlumno());
//	}

	
	/**
	 * Elimina un objeto Alumnos con el ID especificado.
	 *
	 * @param id El ID del alumno a eliminar.
	 * @return El objeto Alumnos eliminado correspondiente al ID especificado.
	 * 
	 */
	@DeleteMapping("/eliminarAlumno/{id}")
	public void eliminarAlumno(@PathVariable Integer id) {
		service.eliminarAlumno(id);
	}

	/**
	 * Crea un nuevo objeto Alumnos.
	 *
	 * @param alumno El objeto Alumnos a crear.
	 * @return El objeto Alumnos recién creado.
	 */
	@PostMapping("/crearAlumnos/{id}")
	public Alumnos crearAlumno(Alumnos alumno) {
		return service.crearAlumno(alumno);
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
