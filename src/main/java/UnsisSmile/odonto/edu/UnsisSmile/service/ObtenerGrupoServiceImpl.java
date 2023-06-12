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
	//Instanciado de la interfaz de SemestreGrupo 
	private  ISemestreGrupoImpl  repository;
	//Obtiene una lista de semestres
	public List<String> obtenerRegistros(String semestre) {
        return repository.filtarGrupos(semestre);
    }

    //Obtiene una lista de grupos
    //public ArrayList<String> obtenerSemGrup(int id) {
      //  return repository.obtenerSemGrup(id);
    //}

    //Obtiene un grupo
    public int obtenerIdSG(String semestre, String grupo) {
        return repository.filtrarIdSemestreGrupo(semestre, grupo);
    }
	
}
