/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:09 de junio del 2023
 *Fecha de Modificación:
 *Descripción: se crea la interfaz adiministradoresRepository que contiene los procedimientos que ocupará la clase implemtadora
 *             
 *             
 */
package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.Administradores;

@Repository
public interface IAdministradoresRepository extends JpaRepository<Administradores, Long> {
	// procedimiento para crear un administrador
	@Procedure(name = "insertarAdministrador")
	Administradores insertarAdministrador(String nombre1, String nombre2, String apellido1, String apellido2,
			String curp, String telefono, String numero_trabajador, LocalDate fecha_nacimiento, Character sexo,
			String email_admin);

	// procedimiento para eliminar un administrador

	@Procedure(name = "eliminarAdministrador")
	Administradores eliminarAdministrador(Long id_administrador);

	// procedimiento para obtener un administrador
	@Procedure(name = "obtenerAdministradores")
	Administradores obtenAdministradores(Long id_admin);

	// procedimiento para obtenerTodos los administrador
	@Procedure(name = "obtenerTodosAdministradores")
	Administradores obtenerTodosAdministradores();

	// procedimiento para actualizar un administrador
	@Procedure(name = "actualizarAdministrador")
	Administradores actualizarAdministrador(String nombre1Aux, String nombre2Aux, String apellido1Aux,
			String apellido2Aux, String curpAux, String telefonoAux, String numero_trabajadorAux,
			LocalDate fecha_nacimientoAux, Character sexoAux, String email_adminAux);

}
