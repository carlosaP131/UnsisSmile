package UnsisSmile.odonto.edu.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import UnsisSmile.odonto.edu.entity.Alumnos;
import UnsisSmile.odonto.edu.model.IAlumnoRepository;
import jakarta.transaction.Transactional;
@Service
public class AlumnoService {
	@Autowired //Sprin se encarga de gestionar la creación de los objetos
	private IAlumnoRepository repository;
	
//	public void crearRegistro(Alumnos alumno) {
//		repository.save(alumno);
//	}
//
//	public List<Alumnos> obtenerAlumnos(Alumnos alumno){
//		return repository.findAll();
//	}
//	
//	public void actualizarRegistro(Alumnos alumno) {
//		repository.save(alumno);
//	}
	
	

	@Transactional
	public Alumnos obtenerAlumnos(Long id) {
		return repository.obternerAlumnos(id);
	}
	@Transactional
	public Alumnos eliminarAlumno(Long id) {
		return repository.eliminarAlumno(id);
	}
	@Transactional
	public Alumnos actualizarAlumno(Long id) {
		return repository.actualizarAlumno(id);
	}
	@Transactional
	public Alumnos crearAlumno(Alumnos alumno) {
		return repository.InsertarAlumnos(alumno);
	}
}
