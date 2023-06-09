package UnsisSmile.odonto.edu.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Alumnos;
import UnsisSmile.odonto.edu.UnsisSmile.entity.SemestreGrupo;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumnos, Long> {
	@Procedure(name = "InsertarAlumno")
	Alumnos InsertarAlumnos(String nombre, String nombre2, String apellido, String apellido2, Character sexo,
			String curp, SemestreGrupo semestreGrupo, String matricula, String telefono, String mail);

	@Procedure(name = "obtenerAlumnos")
	Alumnos obternerAlumnos(Long id);

	@Procedure(name = "eliminarAlumno")
	Alumnos eliminarAlumno(Long id);

	@Procedure(name = "actualizarAlumno")
	Alumnos actualizarAlumno(Long id);

	@Procedure(name = "obtenerTodosAlumnos")
	Alumnos obtenerTodosAlumnos();

}
