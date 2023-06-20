/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:09 de junio del 2023
 *Fecha de Modificación: 13 de junio del 2023
 *Descripción: se crea la clase del administradoresService para poder  implementar nuestros métodos            
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
	/**
	 * Declara una variable "repository" e inyecta una implementación de
	 * IAdministradoresRepository
	 */

	@Autowired
	private IAdministradoresRepository repository;

	@Transactional
	/**
	 * Crea un nuevo registro de administrador utilizando los datos proporcionados.
	 * 
	 * @param administradores
	 */
	public void crearRegistro(Administradores administradores) {
		repository.insertarAdministrador(administradores.getNombre1(), administradores.getNombre2(),
				administradores.getApellido1(), administradores.getApellido2(), administradores.getCurp(),
				administradores.getTelefono(), administradores.getNumeroTrabajador(),
				administradores.getFechaNacimiento(), administradores.getSexo(), administradores.getEmailAdmin());

	}

	@Transactional
	/**
	 * Elimina un registro de administrador del repositorio utilizando el ID
	 * proporcionado.
	 * 
	 * @param id_admin
	 */
	public void eliminarRegistro(Integer id_admin) {
		repository.eliminarAdministrador(id_admin);
	}

	@Transactional
	/**
	 * Obtiene un registro de administrador del repositorio utilizando el ID
	 * proporcionado.
	 * 
	 * @param idAdministrador
	 * @return
	 */
	public Administradores obtenerRegistroById(Integer idAdministrador) {
		return repository.obtenerAdministradores(idAdministrador);
	}

	@Transactional
	/**
	 * Obtiene todos los registros de administradores del repositorio.
	 * 
	 * @return
	 */
	public List<Administradores> obtenerTodosRegistro() {
		return repository.obtenerTodosAdministradores();
	}

	@Transactional
	/**
	 * Actualiza un registro de administrador en el repositorio utilizando los datos
	 * proporcionados.
	 * 
	 * @param administradores
	 */
	public void actualizarRegistro(Administradores administradores) {
		repository.actualizarAdministrador(administradores.getIdAdministrador(), administradores.getNombre1(),
				administradores.getNombre2(), administradores.getApellido1(), administradores.getApellido2(),
				administradores.getCurp(), administradores.getTelefono(), administradores.getNumeroTrabajador(),
				administradores.getFechaNacimiento(), administradores.getSexo(), administradores.getEmailAdmin());

	}
}
