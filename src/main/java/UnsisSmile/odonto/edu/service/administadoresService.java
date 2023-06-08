package UnsisSmile.odonto.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import UnsisSmile.odonto.edu.entity.Administradores;
import UnsisSmile.odonto.edu.model.IAdministradoresRepository;
import jakarta.transaction.Transactional;

@Service
public class administadoresService {

	@Autowired
	private IAdministradoresRepository repository;
	
	@Transactional
	public void crearRegistro(Administradores administrador) {
		repository.insertarAdministrador(null, null, null, null, null, null, null, null, null, null);
	}
	
	@Transactional
	public void eliminarRegistro(Integer id_administrador) {
		repository.eliminarAdministrador(id_administrador);
	}
	@Transactional
	public Administradores obtenerRegistroById(int id_admin) {
		return repository.obtenerAdministradores(id_admin);
	}
}
