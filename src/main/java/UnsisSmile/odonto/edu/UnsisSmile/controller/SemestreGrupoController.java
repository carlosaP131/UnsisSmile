/** ****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:8-06-2023
 *Descripción: Controller del Semestre grupo
 **
 * ****************************************************************************/
package UnsisSmile.odonto.edu.UnsisSmile.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import UnsisSmile.odonto.edu.UnsisSmile.service.ObtenerGrupoServiceImpl;



@RequestMapping("/unsis") // http:localhost:8080/api/crear
public class SemestreGrupoController {
	//Estanciado de el service de SemestreGrupo
	@Autowired
	private ObtenerGrupoServiceImpl service;
	//Muestra la lista de grupos
	@GetMapping("/obtenerRegistros/{semestre}")
	public List<String> obtenerRegistros(@PathVariable String semestre) {
        return service.obtenerRegistros(semestre);
    }
	//Muestra un grupo
	@GetMapping("/obtenerSemestreGrupo/{id}")
    public ArrayList<String> obtenerSemGrup(@PathVariable int id) {
        return service.obtenerSemGrup(id);
    }
	//Muestra los grupos por semestre
	@GetMapping("/obtenerIdSemestre/{semestre},{ grupo}")
    public int obtenerIdSG(@PathVariable String semestre,@PathVariable String grupo) {
        return service.obtenerIdSG(semestre, grupo);
    }
}
