/**
 * Autor: Baldomero Sainos Hernández 
 * Autor de modificación: Baldomero Sainos Hernández
 * Fecha creación: 05 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Service para el service para catedraticos, modelamos el crud de dicho objeto
 *              implementando la clase interfaz
 */

package UnsisSmile.odonto.edu.UnsisSmile.service;

/**
 * Librerias importadas para el dasarrollo del servicio de catedraticos. 
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Catedraticos;
import UnsisSmile.odonto.edu.UnsisSmile.model.ICatedraticosRepository;


@Service
public class CatedraticosService{
	
	/**
	 * @Autowired es una anotación de Spring Framework que se utiliza para realizar la inyección,
	 * de dependencias automáticamente en las aplicaciones Java.
	 */
	@Autowired
	private ICatedraticosRepository repository;
	
	/**
	 * @Transactional es una anotación de Spring Framework que se utiliza en aplicaciones Java para indicar
	 * que un método o una clase debe ser gestionada por transacciones.
	 * Aquí se implemento el método crearRegistro registro de un catedratico.
	 */
	@Transactional
	public void crearRegistro(Catedraticos catedratico) {	
			repository.insertarCatedratico(catedratico.getNombre(),catedratico.getNombre2(),catedratico.getApellido(),
			catedratico.getApellido2(),catedratico.getCurp(),catedratico.getTelefono(),catedratico.getSexo(),
			catedratico.getFechaNacimiento(),catedratico.getNumeroTrabajador(),catedratico.getEmailCatedratico());
	}
	
	/**
	 * @return Aquí se implemento el método eliminarRegistro para un catedratico.
	 */
	@Transactional
	public void eliminarRegistro(Integer id_catedratico) {
	   repository.eliminarCatedratico(id_catedratico);
	}
	
	/**
	 * @return Aquí se implemento el método crear un registro de un catedratico.
	 */
	@Transactional
	public Catedraticos obtenerCatedratico(Integer id_cat) {
		return repository.obtenerCatedratico(id_cat);
	}
	
	/**
	 * 
	 * @return Aquí se implemento el método List para listar todos los catedraticos.
	 */
	@Transactional
	public List<Catedraticos> obtenerTodosCatedraticos() {
		return repository.obtenerTodosCatedraticos();
	}
	
	/**
	 * 
	 * @return Aquí se implemento el método actualizarRegistro para actualizar los catedraticos.
	 */
	@Transactional
	public void actualizarRegistro(Catedraticos catedraticos) {
		repository.actualizarCatedraticos(catedraticos.getIdCatedratico(), catedraticos.getNombre(),catedraticos.getNombre2(), catedraticos.getApellido(),catedraticos.getApellido2(),
				catedraticos.getCurp(),catedraticos.getTelefono(),catedraticos.getSexo(),catedraticos.getFechaNacimiento(),catedraticos.getNumeroTrabajador(),
				catedraticos.getEmailCatedratico());
		}	
}



