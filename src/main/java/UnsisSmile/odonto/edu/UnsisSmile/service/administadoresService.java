package UnsisSmile.odonto.edu.UnsisSmile.service;

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
	public void crearRegistro(Administradores administrador) {
		repository.insertarAdministrador(null, null, null, null, null, null, null, null, null, null);
	}
	
	@Transactional
	public void eliminarRegistro(Long id_administrador) {
		repository.eliminarAdministrador(id_administrador);
	}
	@Transactional
	public Administradores obtenerRegistroById(int id_admin) {
		return repository.obtenAdministradores(id_admin);
	}
}
