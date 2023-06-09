package UnsisSmile.odonto.edu.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Alumnos;
import UnsisSmile.odonto.edu.model.IAlumnoRepository;
import jakarta.transaction.Transactional;

@Service
public class AlumnoService {
	@Autowired // Inyección de dependencia para el repositorio IAlumnoRepository
	private IAlumnoRepository repository;

	@Transactional
	/**
	 * Obtiene un objeto Alumnos por su ID.
	 *
	 * @param id El ID del objeto Alumnos a obtener.
	 * @return El objeto Alumnos correspondiente al ID proporcionado.
	 */
	public Alumnos obtenerAlumnos(Long id) {
	    return repository.obternerAlumnos(id);
	}

	@Transactional
	/**
	 * Elimina un objeto Alumnos por su ID.
	 *
	 * @param id El ID del objeto Alumnos a eliminar.
	 * @return El objeto Alumnos que ha sido eliminado.
	 */
	public Alumnos eliminarAlumno(Long id) {
	    return repository.eliminarAlumno(id);
	}

	@Transactional
	/**
	 * Actualiza un objeto Alumnos.
	 *
	 * @param alumnos El objeto Alumnos con los datos actualizados.
	 * @return El objeto Alumnos actualizado.
	 */
	public Alumnos actualizarAlumno(Alumnos alumnos) {
	    return repository.actualizarAlumno(alumnos.getIdAlumno(), alumnos.getNombre(), alumnos.getNombre2(),
	            alumnos.getApellido(), alumnos.getApellido2(), alumnos.getSexo(), alumnos.getCurp(),
	            alumnos.getSemestreGrupo().getIdSemestreGrupo(), alumnos.getMatricula(), alumnos.getTelefono(), alumnos.getEmailAlumno());
	}

	@Transactional
	/**
	 * Crea un nuevo objeto Alumnos.
	 *
	 * @param alumno El objeto Alumnos a crear.
	 * @return El objeto Alumnos creado.
	 */
	public Alumnos crearAlumno(Alumnos alumno) {
	    return repository.InsertarAlumnos(alumno.getNombre(), alumno.getNombre2(), alumno.getApellido(),
	            alumno.getApellido2(), alumno.getSexo(), alumno.getCurp(),
	            alumno.getSemestreGrupo().getIdSemestreGrupo(), alumno.getMatricula(), alumno.getTelefono(),
	            alumno.getEmailAlumno());
	}

	@Transactional
	/**
	 * Obtiene todos los objetos Alumnos.
	 *
	 * @return Una lista de todos los objetos Alumnos.
	 */
	public Alumnos obtenerTodosAlumnos() {
	    return repository.obtenerTodosAlumnos();
	}

}
