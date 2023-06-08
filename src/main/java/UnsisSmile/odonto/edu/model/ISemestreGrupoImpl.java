package UnsisSmile.odonto.edu.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import UnsisSmile.odonto.edu.entity.SemestreGrupo;




public interface ISemestreGrupoImpl extends JpaRepository<SemestreGrupo,Long> {
	@Procedure (name = "spFiltarSemGrup")
	List<String> spFiltarSemGrup(String semestre);
	
	@Procedure(name = "filtrarIdSemestreGrupo")
	int filtrarIdSemestreGrupo(String semestre ,String grupo);
	
	@Procedure(name = "spFiltarSemGrup")
	ArrayList<String> obtenerSemGrup(int id);
}
