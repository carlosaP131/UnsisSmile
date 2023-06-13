/** ****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:13-06-2023
 *Descripción: Service del Semestre grupo
 **
 * ****************************************************************************/
package UnsisSmile.odonto.edu.UnsisSmile.service;


import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import UnsisSmile.odonto.edu.UnsisSmile.model.ISemestreGrupoImpl;
@Service
public class SemestreGrupoServiceImpl {
	/**
	 *Instanciado de la interfaz de SemestreGrupo
	 */
	@Autowired
	private  ISemestreGrupoImpl  repository;
	/**
	 *Obtiene una lista de semestres
	 * @param semestreAux
	 * @return
	 */
	@Transactional
	public List<String> filtrarGrupos(String semestreAux) {
        return repository.filtrarGrupos(semestreAux);
    }

    /**
     * Obtiene una lista de grupos
     * @return
     */
	@Transactional
    public ArrayList<String> spListarSemestreGrupo() {
        return repository.spListarSemestreGrupo();
    }

	/**
	 * Obtiene un grupo
	 * @param semestreAux
	 * @param grupoAux
	 * @return
	 */
	@Transactional
    public int filtrarIdSemestreGrupo(String semestreAux,String grupoAux) {
		
        return repository.filtrarIdSemestreGrupo(semestreAux, grupoAux);
    }
	
}
