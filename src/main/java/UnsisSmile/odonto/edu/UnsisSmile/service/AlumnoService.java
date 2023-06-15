package UnsisSmile.odonto.edu.UnsisSmile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Administradores;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Alumnos;
import UnsisSmile.odonto.edu.UnsisSmile.model.IAlumnoRepository;
import jakarta.transaction.Transactional;

@Service
public class AlumnoService {
	@Autowired // Inyección de dependencia para el repositorio IAlumnoRepository
	private IAlumnoRepository repository;

	/**
	 * Crea un nuevo registro de administrador utilizando los datos proporcionados.
	 * 
	 * @param administradores
	 */
	@Transactional
	public void crearRegistro(Alumnos alumno) {
		repository.insertarAlumno(alumno.getNombre(), alumno.getNombre2(), alumno.getApellido(),
				alumno.getApellido2(), alumno.getSexo(), alumno.getCurp(),
			 1, alumno.getMatricula(), alumno.getTelefono(),
				alumno.getEmailAlumno());

	}

	
	/**
	 * Obtiene un objeto Alumnos por su ID.
	 *
	 * @param id El ID del objeto Alumnos a obtener.
	 * @return El objeto Alumnos correspondiente al ID proporcionado.
	 */
	@Transactional
	public Alumnos obtenerAlumnos(Integer id) {
		return repository.obternerAlumnos(id);
	}

	
	/**
	 * Elimina un objeto Alumnos por su ID.
	 *
	 * @param id El ID del objeto Alumnos a eliminar.
	 * @return El objeto Alumnos que ha sido eliminado.
	 */
	@Transactional
	public void eliminarRegistro(Integer id_alumnoAux) {
		repository.eliminarAlumno(id_alumnoAux);
	}

	
	/**
	 * Actualiza un objeto Alumnos.
	 *
	 * @param alumnos El objeto Alumnos con los datos actualizados.
	 * @return 
	 * @return El objeto Alumnos actualizado.
	 */
	@Transactional
	public void actualizarAlumno(Alumnos alumno) {
		 repository.actualizarAlumno(alumno.getIdAlumno(), alumno.getNombre(), alumno.getNombre2(), alumno.getApellido(),
					alumno.getApellido2(), alumno.getSexo(), alumno.getCurp(),
					 3, alumno.getMatricula(), alumno.getTelefono(),
						alumno.getEmailAlumno());
	}

//	@Transactional
//	/**
//	 * Crea un nuevo objeto Alumnos.
//	 *
//	 * @param alumno El objeto Alumnos a crear.
//	 * @return El objeto Alumnos creado.
//	 */
//	public Alumnos crearAlumno(Alumnos alumno) {
//		return repository.InsertarAlumnos(alumno.getNombre(), alumno.getNombre2(), alumno.getApellido(),
//				alumno.getApellido2(), alumno.getSexo(), alumno.getCurp(),
//				alumno.getSemestreGrupo().getIdSemestreGrupo(), alumno.getMatricula(), alumno.getTelefono(),
//				alumno.getEmailAlumno());
//	}

	
	/**
	 * Obtiene todos los objetos Alumnos.
	 *
	 * @return Una lista de todos los objetos Alumnos.
	 */
	@Transactional
	public List<Alumnos> obtenerTodosAlumnos() {
		return repository.obtenerTodosAlumnos();
	}

}
