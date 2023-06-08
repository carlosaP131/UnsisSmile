package UnsisSmile.odonto.edu.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import UnsisSmile.odonto.edu.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long>{
	@Procedure(name = "obtenerPacientePorAlumno")
	List<Paciente> obtenerPacientePorAlumno(Long id_alum);

}
