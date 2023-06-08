package UnsisSmile.odonto.edu.service;

import java.util.ArrayList;
import java.util.List;

import UnsisSmile.odonto.edu.model.ISemestreGrupoImpl;

public class ObtenerGrupoServiceImpl {
	private  ISemestreGrupoImpl  repository;
	public List<String> obtenerRegistros(String semestre) {
        return repository.spFiltarSemGrup(semestre);
    }

    
    public ArrayList<String> obtenerSemGrup(int id) {
        return repository.obtenerSemGrup(id);
    }

    
    public int obtenerIdSG(String semestre, String grupo) {
        return repository.filtrarIdSemestreGrupo(semestre, grupo);
    }
	
}
