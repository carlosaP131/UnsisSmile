/**
 *Autor:Getzemani Alejandro Gonzalez Cruz
 *Fecha de creación:9 de junio 2023
 *Fecha de Modificación: 13 de junio 2023
 *Descripción:clase model para Paciente, modelamos el crud de dicho objeto
 *             implementando la clase interfaz
 */


package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long>{
	/**
	 * Procedure para obtener el paciente
	 */
	@Procedure(name = "obtenerPacientePorAlumno")
	List<Paciente> obtenerPacientePorAlumno(Long id_alum);
	
	/**
	 * Procedure para actualizar el paciente
	 */
    @Query (value="UPDATE paciente SET nombre1 = :nombre1 ,nombre2 = :nombre2  WHERE id_paciente = :id ;",nativeQuery = true)
	void getActualizarPaciente( int id,  String nombre1, String nombre2);
	
    /**
	 * Procedure para listar el paciente
	 */
    @Query (value="Select * from paciente where id_paciente = :_id",nativeQuery = true)
	Paciente getPacienteByid_Native(@Param ("_id")int id);
	

}
