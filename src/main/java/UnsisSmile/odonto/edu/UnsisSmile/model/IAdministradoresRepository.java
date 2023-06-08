package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Administradores;

@Repository
public interface IAdministradoresRepository  extends JpaRepository<Administradores, Long >{
	@Procedure(name= "insertarAdministrador")
	Administradores insertarAdministrador(String nombre1,String nombre2,String apellido1,String apellido2,String curp,String telefono,String numero_trabajador,LocalDate fecha_nacimiento,Character sexo, String email_admin );
	
	//procedimiento para eliminar un administrador
	
	@Procedure(name= "eliminarAdministrador")
	Administradores eliminarAdministrador(Long id_administrador);
	
	@Procedure(name= "obtenerAdministradores")
	Administradores obtenAdministradores(int id_admin);
	
	


}
