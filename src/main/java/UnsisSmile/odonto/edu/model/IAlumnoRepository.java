package UnsisSmile.odonto.edu.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.entity.Alumnos;
@Repository
public interface IAlumnoRepository extends JpaRepository<Alumnos, Long>{
	@Procedure(name = "InsertarAlumno")
	Alumnos InsertarAlumnos(Alumnos alumno);
	
	@Procedure(name = "obtenerAlumnos")
	Alumnos obternerAlumnos(Long id);
	
	@Procedure(name = "eliminarAlumno")
	Alumnos eliminarAlumno(Long id);
	 
	@Procedure(name = "actualizarAlumno")
	Alumnos actualizarAlumno(Long id);
	

}
