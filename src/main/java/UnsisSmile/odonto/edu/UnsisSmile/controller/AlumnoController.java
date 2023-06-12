package UnsisSmile.odonto.edu.UnsisSmile.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api") // http://localhost:8080/api/crear
public class AlumnoController {
	// Inyectar el servicio
	@Autowired
	private AlumnoService service;

	@GetMapping("/obtenerAlumnos/{id}")
	/**
	 * Obtiene un objeto Alumnos con el ID especificado.
	 *
	 * @param id El ID del alumno a obtener.
	 * @return El objeto Alumnos correspondiente al ID especificado.
	 */
	public Alumnos obtenerAlumnoId(@PathVariable Integer id) {
		return service.obtenerAlumnos(id);
	}

	@PutMapping("/editarAlumnos/{id}")
	/**
	 * Edita un objeto Alumnos con el ID especificado.
	 *
	 * @param id El ID del alumno a editar.
	 * @return El objeto Alumnos editado correspondiente al ID especificado.
	 */
//	public Alumnos editarAlumnoId(@PathVariable Alumnos alumnos) {
//		return service.actualizarAlumno(alumnos.getIdAlumno(), alumnos.getNombre(), alumnos.getNombre2(), alumnos.getApellido(), alumnos.getApellido2(), alumnos.getSexo(), alumnos.getCurp(), alumnos.getSemestreGrupo().getIdSemestreGrupo(), alumnos.getMatricula(), alumnos.getTelefono(), alumnos.getEmailAlumno());
//	}

	@DeleteMapping("/eliminarAlumnos/{id}")
	/**
	 * Elimina un objeto Alumnos con el ID especificado.
	 *
	 * @param id El ID del alumno a eliminar.
	 * @return El objeto Alumnos eliminado correspondiente al ID especificado.
	 */
	public Alumnos eliminarAlumnoId(@PathVariable Integer id) {
		return service.eliminarAlumno(id);
	}

	@PostMapping("/crearAlumnos/{id}")
	/**
	 * Crea un nuevo objeto Alumnos.
	 *
	 * @param alumno El objeto Alumnos a crear.
	 * @return El objeto Alumnos recién creado.
	 */
	public Alumnos crearAlumno(Alumnos alumno) {
		return service.crearAlumno(alumno);
	}

	/**
	 * Obtiene todos los objetos Alumnos.
	 *
	 * @return Una lista de todos los objetos Alumnos.
	 */
	@GetMapping("/obtenerTodosAlumnos")
	public Alumnos obtenerTodosAlumnos() {
		System.out.println("ingresando....");
		return service.obtenerTodosAlumnos();
	}

}
