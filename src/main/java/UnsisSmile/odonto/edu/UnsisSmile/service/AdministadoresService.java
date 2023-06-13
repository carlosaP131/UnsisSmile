/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:09 de junio del 2023
 *Fecha de Modificación: 13 de junio del 2023
 *Descripción: se crea la clase del administradoresSErvice para poder poder implementar nuestros meétodos            
 */

package UnsisSmile.odonto.edu.UnsisSmile.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import UnsisSmile.odonto.edu.UnsisSmile.entity.Administradores;
import UnsisSmile.odonto.edu.UnsisSmile.model.IAdministradoresRepository;

@Service
public class AdministadoresService {
    //Declara una variable "repository" e inyecta una implementación de "IAdministradoresRepository"
	@Autowired
	private IAdministradoresRepository repository;

	@Transactional
	//Crea un nuevo registro de administrador utilizando los datos proporcionados.
	public void crearRegistro(Administradores administradores) {
		repository.insertarAdministrador(administradores.getNombre1(), administradores.getNombre2(),
				administradores.getApellido1(), administradores.getApellido2(), administradores.getCurp(),
				administradores.getTelefono(), administradores.getNumeroTrabajador(),
				administradores.getFechaNacimiento(), administradores.getSexo(), administradores.getEmailAdmin());

	}

	@Transactional
	// Elimina un registro de administrador del repositorio utilizando el ID proporcionado.
	public void eliminarRegistro(Integer id_admin) {
		repository.eliminarAdministrador(id_admin);
	}

	@Transactional
	// Obtiene un registro de administrador del repositorio utilizando el ID proporcionado.
	public Administradores obtenerRegistroById(Integer idAdministrador) {
		return repository.obtenerAdministradores(idAdministrador);
	}

	@Transactional
	// Obtiene todos los registros de administradores del repositorio.
	public List<Administradores> obtenerTodosRegistro() {
		return repository.obtenerTodosAdministradores();
	}

	@Transactional
	// Actualiza un registro de administrador en el repositorio utilizando los datos proporcionados.
	public void actualizarRegistro(Administradores administradores) {
//		 repository.actualizarAdministrador(administradores.getNombre1(),
//		 administradores.getNombre2(), administradores.getApellido1(),
//		 administradores.getApellido2(),
//		 administradores.getCurp(),administradores.getTelefono(),
//		 administradores.getNumeroTrabajador(), administradores.getFechaNacimiento(),
//		 administradores.getSexo(), administradores.getEmailAdmin());

	}
}
