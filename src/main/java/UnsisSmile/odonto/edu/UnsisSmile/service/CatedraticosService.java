/**
 * Autor: Baldomero Sainos Hernández 
 * Autor de modificación: Baldomero Sainos Hernández
 * Fecha creación: 05 de Junio de 2023
 * Fecha modificación: 09 mayo de 2023
 * Descripción: Service para el service para catedraticos, modelamos el crud de dicho objeto
 *              implementando la clase interfaz
 */

package UnsisSmile.odonto.edu.UnsisSmile.service;

//Librerias importadas para el dasarrollo del servicio de catedraticos. 
import java.util.List;
import javax.xml.crypto.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Catedraticos;
import UnsisSmile.odonto.edu.UnsisSmile.model.ICatedraticosRepository;


@Service
public class CatedraticosService{
	
	private static final String String = null;
	
	/*@Autowired es una anotación de Spring Framework que se utiliza para realizar la inyección,
	 * de dependencias automáticamente en las aplicaciones Java.*/
	@Autowired
	private ICatedraticosRepository repository;
	
	/*@Transactional es una anotación de Spring Framework que se utiliza en aplicaciones Java para indicar
	 *  que un método o una clase debe ser gestionada por transacciones.*/
	@Transactional
	public void crearRegistro(Catedraticos catedratico) {	
	//	repository.insertarCatedratico(catedratico.getNombre(),catedratico.getNombre2(),catedratico.getApellido(),
		//		catedratico.getApellido2(),catedratico.getCurp(),catedratico.getTelefono(),catedratico.getSexo(),
			//	catedratico.getFechaNacimiento(),catedratico.getNumeroTrabajador(),catedratico.getEmailCatedratico());
	}
	
	@Transactional
	public Catedraticos getCatedraticosId_SP(Long id) {
		return repository.obtenerCatedratico(id);
	}


	

}