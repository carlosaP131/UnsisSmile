/**
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:13-06-2023
 *Descripción: Model del Semestre grupo
 */

package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.SemestreGrupo;





@Repository
public interface ISemestreGrupoImpl extends JpaRepository<SemestreGrupo,Long> {
	
	/**
	 * Procedimiento que Recibe un String de Semestre y regresa una lista de grupos
	 * @param semestreAux
	 * @return
	 */
	@Procedure (name = "filtrarGrupos")
	List<String> filtrarGrupos(String semestreAux);
	/**
	 * 
	 * @param semestreAux
	 * @param grupoAux
	 * @return
	 */
	@Query(value = "select unsis_smile.filtrarIdSemestreGrupo(:semestreAux, :grupoAux);\n", nativeQuery = true)
	int filtrarIdSemestreGrupo(String semestreAux,String grupoAux);
	
	/**
	 *Procedimiento que Recibe un Int de Id y regresa  una lista de grupos
	 * @return
	 */
	@Procedure(name = "spListarSemestreGrupo")
	ArrayList<String> spListarSemestreGrupo();
}
