/**
 * 
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Semestre grupo
 */

package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;   
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "semestre_grupo")
public class SemestreGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_semestre_grupo")
    private Integer idSemestreGrupo;
    @OneToMany(mappedBy = "semestreGrupo", fetch = FetchType.LAZY)
    private List<Alumnos> alumnosList;
    @JoinColumn(name = "fk_id_grupo", referencedColumnName = "id_grupos")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grupo grupo;
    @JoinColumn(name = "fk_id_semestre", referencedColumnName = "id_semestre")
    @ManyToOne(fetch = FetchType.LAZY)
    private Semestres semestres;
    @OneToMany(mappedBy = "semestreGrupo", fetch = FetchType.LAZY)
    private List<CatedraticoGrupo> catedraticoGrupoList;

    public SemestreGrupo() {
    }

    public SemestreGrupo(Integer idSemestreGrupo) {
        this.idSemestreGrupo = idSemestreGrupo;
    }

    public Integer getIdSemestreGrupo() {
        return idSemestreGrupo;
    }

    public void setIdSemestreGrupo(Integer idSemestreGrupo) {
        this.idSemestreGrupo = idSemestreGrupo;
    }

    public List<Alumnos> getAlumnosList() {
        return alumnosList;
    }

    public void setAlumnosList(List<Alumnos> alumnosList) {
        this.alumnosList = alumnosList;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Semestres getSemestres() {
        return semestres;
    }

    public void setSemestres(Semestres semestres) {
        this.semestres = semestres;
    }

    public List<CatedraticoGrupo> getCatedraticoGrupoList() {
        return catedraticoGrupoList;
    }

    public void setCatedraticoGrupoList(List<CatedraticoGrupo> catedraticoGrupoList) {
        this.catedraticoGrupoList = catedraticoGrupoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSemestreGrupo != null ? idSemestreGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SemestreGrupo)) {
            return false;
        }
        SemestreGrupo other = (SemestreGrupo) object;
        if ((this.idSemestreGrupo == null && other.idSemestreGrupo != null) || (this.idSemestreGrupo != null && !this.idSemestreGrupo.equals(other.idSemestreGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.SemestreGrupo[ idSemestreGrupo=" + idSemestreGrupo + " ]";
    }
    
}
