/**
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:8-06-2023
 *Descripción: Model del Semestre grupo
 */

package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import UnsisSmile.odonto.edu.UnsisSmile.entity.SemestreGrupo;





@Repository
public interface ISemestreGrupoImpl extends JpaRepository<SemestreGrupo,Long> {
	//Procedimiento que Recibe un String de Semestre y regresa una lista de grupos
	@Procedure (name = "filtrarGrupos")
	List<String> filtrarGrupos(String semestreAux);
	
	//Procedimiento que Recibe dos Strings de Semestre y un grupo regresa un id de semestre
	@Procedure (name = "filtrarIdSemestreGrupo")
	int filtrarIdSemestreGrupo(String semestreAux,String grupoAux);
	
	//Procedimiento que Recibe un Int de Id y regresa  una lista de grupos
	@Procedure(name = "spListarSemestreGrupo")
	ArrayList<String> spListarSemestreGrupo();
}
