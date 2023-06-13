use unsis_smile;
  
-- filtrar grupos
DELIMITER $$
drop procedure if exists filtrarGrupos$$
create procedure filtrarGrupos(
semestreAux varchar(10))
begin
	with
	c1 as (select semestre, fk_id_grupo from semestres as s inner join semestre_grupo as sg on s.id_semestre=sg.fk_id_semestre)
    select g.grupo from c1 inner join grupo as g on c1.fk_id_grupo=g.id_grupos where c1.semestre=semestreAux order by c1.semestre asc;
end
$$
DELIMITER ;

-- filtrar grupos
DELIMITER $$
DROP FUNCTION IF EXISTS filtrarIdSemestreGrupo$$
CREATE FUNCTION filtrarIdSemestreGrupo(
  semestreAux VARCHAR(10),
  grupoAux VARCHAR(1)
) 
RETURNS INT
deterministic
BEGIN
DECLARE id_semestreGrupo INT;
	WITH
	c1 AS (SELECT semestre, id_semestre_grupo, fk_id_grupo FROM semestres AS s INNER JOIN semestre_grupo AS sg ON s.id_semestre = sg.fk_id_semestre)
	SELECT c1.id_semestre_grupo INTO id_semestreGrupo FROM c1 INNER JOIN grupo AS g ON c1.fk_id_grupo = g.id_grupos WHERE c1.semestre = semestreAux AND g.grupo = grupoAux
	ORDER BY c1.id_semestre_grupo ASC;
  
RETURN id_semestreGrupo;
END
$$
DELIMITER ;

-- listar semestre y grupo mediante el id_semestre_grupo
DELIMITER $$
drop procedure if exists spFiltrarSemGrup$$
create procedure spFiltrarSemGrup(
idAux varchar(10))
begin
	select semestre, grupo from semestres as s inner join semestre_grupo as s1 on s.id_semestre=s1.fk_id_semestre
		inner join grupo as g where g.id_grupos= s1.fk_id_grupo and s1.id_semestre_grupo=1 order by semestre asc;
end
$$
DELIMITER ;
select * from semestre_grupo;
