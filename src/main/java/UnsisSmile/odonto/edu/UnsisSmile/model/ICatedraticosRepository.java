/**
 * Autor: Baldomero Sainos Hernández 
 * Autor de modificación: Baldomero Sainos Hernández
 * Fecha creación: 05 de Junio de 2023
 * Fecha modificación: 09 mayo de 2023
 * Descripción: Interface para el modell para catedraticos, modelamos el crud de dicho objeto
 *              implementando la clase interfaz
 */

package UnsisSmile.odonto.edu.UnsisSmile.model;


//Librerias importadas para el dasarrollo de la interfaz. 
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Catedraticos;

public interface ICatedraticosRepository extends JpaRepository<Catedraticos, Long>{
	//Procedimiento almacenado para insertar una lista de todos los catedraticos.
	@Procedure(name = "insertarCatedratico")	
	public void insertarCatedratico(String nombre, String nombre2, String apellido, String aplellido2, String curp, String telefono, 
			 						  Character sexo, LocalDate fecha_nacimiento, String numero_trabajador, String mail);
	
	//Procedimiento almacenado para obtener una lista de todos los catedraticos.
	@Procedure(name = "obtenerTodosCatedraticos")	
	Catedraticos obtenerTodosCatedraticos ();
	
	//Procedimiento almacenado para eliminar un catedraticos.
	@Procedure(name = "eliminarCatedratico")	
	Catedraticos eliminarCatedratico (int idCatedraticos);
	
	//Procedimiento almacenado para obtener un catedraticos en especifico, con su Id.
	@Procedure(name = "obtenerCatedratico")	
	Catedraticos obtenerCatedratico (Long id);
	
	//Procedimiento almacenado para actualizar un catedraticos.
	@Procedure(name = "actualizarCatedraticos")	
	Catedraticos actualizarCatedraticos (String id_catedraticoAux, String nombreAux, String nombre2Aux, String apellidoAux, String apellido2Aux,
			String curpAux, String telefonoAux, Character sexoAux, LocalDate fecha_nacimientoAux,String numero_trabajadorAux, String mailAux);

}



