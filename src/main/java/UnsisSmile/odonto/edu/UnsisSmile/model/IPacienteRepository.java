package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long>{
	@Procedure(name = "obtenerPacientePorAlumno")
	List<Paciente> obtenerPacientePorAlumno(Long id_alum);

}
