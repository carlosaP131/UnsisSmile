/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:09 de junio del 2023
 *Fecha de Modificación:13 de junio del 2023
 *Descripción: se crea la interfaz adiministradoresRepository que contiene los procedimientos que ocupará la clase implemtadora           
 */
package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Administradores;

@Repository
public interface IAdministradoresRepository extends JpaRepository<Administradores, Integer> {
	/**
	 * procedimiento para crear un administrador
	 * 
	 * @param nombre1
	 * @param nombre2
	 * @param apellido1
	 * @param apellido2
	 * @param curp
	 * @param telefono
	 * @param numeroTrabajador
	 * @param fechaNacimiento
	 * @param sexo
	 * @param emailAdmin
	 */
	@Procedure(name = "insertarAdministrador")
	void insertarAdministrador(String nombre1, String nombre2, String apellido1, String apellido2, String curp,
			String telefono, String numeroTrabajador, LocalDate fechaNacimiento, Character sexo, String emailAdmin);

	/**
	 * procedimiento para eliminar un administrador
	 * 
	 * @param id_admin
	 */
	@Procedure(name = "eliminarAdministrador")
	void eliminarAdministrador(Integer id_admin);

	/**
	 * procedimiento para obtener un administrador
	 * 
	 * @param id_admin
	 * @return
	 */
	@Procedure(name = "obtenerAdministradores")
	Administradores obtenerAdministradores(Integer id_admin);

	/**
	 * procedimiento para obtenerTodos los administrador
	 * 
	 * @return
	 */
	@Procedure(name = "obtenerTodosAdministradores")
	List<Administradores> obtenerTodosAdministradores();

	/**
	 * procedimiento para actualizar un administrador
	 * 
	 * @param id_adminAux
	 * @param nombre1Aux
	 * @param nombre2Aux
	 * @param apellido1Aux
	 * @param apellido2Aux
	 * @param curpAux
	 * @param telefonoAux
	 * @param numero_trabajadorAux
	 * @param fecha_nacimientoAux
	 * @param sexoAux
	 * @param email_adminAux
	 */
	@Procedure(name = "actualizarAdministrador")
	void actualizarAdministrador(Integer id_adminAux, String nombre1Aux, String nombre2Aux, String apellido1Aux,
			String apellido2Aux, String curpAux, String telefonoAux, String numero_trabajadorAux,
			LocalDate fecha_nacimientoAux, Character sexoAux, String email_adminAux);

}
