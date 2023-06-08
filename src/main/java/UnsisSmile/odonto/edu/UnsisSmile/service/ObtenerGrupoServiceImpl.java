/** ****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:8-06-2023
 *Descripción: Service del Semestre grupo
 **
 * ****************************************************************************/
package UnsisSmile.odonto.edu.UnsisSmile.service;

import java.util.ArrayList;
import java.util.List;

import UnsisSmile.odonto.edu.UnsisSmile.model.ISemestreGrupoImpl;

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
