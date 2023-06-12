/**
 *Autor:Nancy Obed Martínez Miguel
 *Fecha de creación:09 de junio del 2023
 *Fecha de Modificación:
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
public class administadoresService {

	@Autowired
	private IAdministradoresRepository repository;

	@Transactional
	public void crearRegistro(Administradores administradores) {
		// repository.insertarAdministrador(administradores.getNombre1(),
		// administradores.getNombre2(), administradores.getApellido1(),
		// administradores.getApellido2(),
		// administradores.getCurp(),administradores.getTelefono(),
		// administradores.getNumeroTrabajador(), administradores.getFechaNacimiento(),
		// administradores.getSexo(), administradores.getEmailAdmin());

	}

	@Transactional
	public void eliminarRegistro(Integer id_admin) {
		repository.eliminarAdministrador(id_admin);
	}

	@Transactional
	public Administradores obtenerRegistroById(Integer id_admin) {
		return repository.obtenAdministradores(id_admin);
	}

	@Transactional
	public List<Administradores> obtenerTodosRegistro() {
		return repository.obtenerTodosAdministradores();
	}

	@Transactional
	public void actualizarRegistro(Administradores administradores) {
		// repository.actualizarAdministrador(administradores.getNombre1(),
		// administradores.getNombre2(), administradores.getApellido1(),
		// administradores.getApellido2(),
		// administradores.getCurp(),administradores.getTelefono(),
		// administradores.getNumeroTrabajador(), administradores.getFechaNacimiento(),
		// administradores.getSexo(), administradores.getEmailAdmin());

	}
}
