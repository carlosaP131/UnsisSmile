/** ****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:8-06-2023
 *Descripción: Service del Semestre grupo
 **
 * ****************************************************************************/
package UnsisSmile.odonto.edu.UnsisSmile.service;


//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import UnsisSmile.odonto.edu.UnsisSmile.model.ISemestreGrupoImpl;
@Service
public class ObtenerGrupoServiceImpl {
	//Instanciado de la interfaz de SemestreGrupo
	@Autowired
	private  ISemestreGrupoImpl  repository;
	//Obtiene una lista de semestres
	@Transactional
	public List<String> filtrarGrupos(String semestreAux) {
        return repository.filtrarGrupos(semestreAux);
    }

    //Obtiene una lista de grupos
    //public ArrayList<String> obtenerSemGrup(int id) {
      //  return repository.obtenerSemGrup(id);
    //}

    //Obtiene un grupo
	@Transactional
    public int obtenerIdSG(String semestre, String grupo) {
        return repository.filtrarIdSemestreGrupo(semestre, grupo);
    }
	
}
