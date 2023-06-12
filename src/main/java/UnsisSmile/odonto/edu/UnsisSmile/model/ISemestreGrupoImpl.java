/** ****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:8-06-2023
 *Descripción: Model del Semestre grupo
 **
 * ****************************************************************************/
package UnsisSmile.odonto.edu.UnsisSmile.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;


import UnsisSmile.odonto.edu.UnsisSmile.entity.SemestreGrupo;




public interface ISemestreGrupoImpl extends JpaRepository<SemestreGrupo,Long> {
	//Procedimiento que Recibe un String de Semestre y regresa una lista de grupos
	@Procedure (name = "filtarGrupos")
	List<String> filtarGrupos(String semestre);
	//Procedimiento que Recibe dos Strings de Semestre y un grupo regresa un id de semestre
	@Procedure(name = "filtrarIdSemestreGrupo")
	int filtrarIdSemestreGrupo(String semestre ,String grupo);
	//Procedimiento que Recibe un Int de Id y regresa  una lista de grupos
	//@Procedure(name = "filtarGrupos")
	//ArrayList<String> obtenerSemGrup(int id);
}
