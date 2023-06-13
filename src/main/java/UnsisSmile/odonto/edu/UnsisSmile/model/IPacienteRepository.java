/**
 *Autor:Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación:9 de junio 2023
 *Fecha de Modificación: 9 de junio 2023
 *Descripción:clase model para Paciente, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */


package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long>{

    //Procedure para obtener el paciente
	@Procedure(name = "obtenerPacientePorAlumno")
	List<Paciente> obtenerPacientePorAlumno(Long id_alum);

}
