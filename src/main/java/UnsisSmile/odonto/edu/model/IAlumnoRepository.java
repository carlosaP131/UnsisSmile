package UnsisSmile.odonto.edu.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Alumnos;
import UnsisSmile.odonto.edu.UnsisSmile.entity.SemestreGrupo;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumnos, Long> {
	@Procedure(name = "InsertarAlumno")
	/**
	 * Procedimiento almacenado para insertar un nuevo objeto Alumnos.
	 *
	 * @param nombre           El nombre del alumno.
	 * @param nombre2          El segundo nombre del alumno.
	 * @param apellido         El apellido del alumno.
	 * @param apellido2        El segundo apellido del alumno.
	 * @param sexo             El sexo del alumno.
	 * @param curp             El CURP del alumno.
	 * @param idSemestreGrupo  El ID del semestre y grupo del alumno.
	 * @param matricula        La matrícula del alumno.
	 * @param telefono         El teléfono del alumno.
	 * @param mail             El correo electrónico del alumno.
	 * @return El objeto Alumnos creado.
	 */
	Alumnos InsertarAlumnos(String nombre, String nombre2, String apellido, String apellido2, Character sexo,
	        String curp, int idSemestreGrupo, String matricula, String telefono, String mail);

	@Procedure(name = "obtenerAlumnos")
	/**
	 * Procedimiento almacenado para obtener un objeto Alumnos por su ID.
	 *
	 * @param id El ID del objeto Alumnos a obtener.
	 * @return El objeto Alumnos correspondiente al ID proporcionado.
	 */
	Alumnos obternerAlumnos(Long id);

	@Procedure(name = "eliminarAlumno")
	/**
	 * Procedimiento almacenado para eliminar un objeto Alumnos por su ID.
	 *
	 * @param id El ID del objeto Alumnos a eliminar.
	 * @return El objeto Alumnos que ha sido eliminado.
	 */
	Alumnos eliminarAlumno(Long id);

	@Procedure(name = "actualizarAlumno")
	/**
	 * Procedimiento almacenado para actualizar un objeto Alumnos.
	 *
	 * @param idAlumno         El ID del alumno a actualizar.
	 * @param nombre           El nombre actualizado del alumno.
	 * @param nombre2          El segundo nombre actualizado del alumno.
	 * @param apellido         El apellido actualizado del alumno.
	 * @param apellido2        El segundo apellido actualizado del alumno.
	 * @param sexo             El sexo actualizado del alumno.
	 * @param curp             El CURP actualizado del alumno.
	 * @param idSemestreGrupo  El ID del semestre y grupo actualizado del alumno.
	 * @param matricula        La matrícula actualizada del alumno.
	 * @param telefono         El teléfono actualizado del alumno.
	 * @param mail             El correo electrónico actualizado del alumno.
	 * @return El objeto Alumnos actualizado.
	 */
	Alumnos actualizarAlumno(int idAlumno, String nombre, String nombre2, String apellido,
	        String apellido2, Character sexo, String curp, int idSemestreGrupo, String matricula,
	        String telefono, String mail);

	@Procedure(name = "obtenerTodosAlumnos")
	/**
	 * Procedimiento almacenado para obtener todos los objetos Alumnos.
	 *
	 * @return Una lista de todos los objetos Alumnos.
	 */
	Alumnos obtenerTodosAlumnos();

}
