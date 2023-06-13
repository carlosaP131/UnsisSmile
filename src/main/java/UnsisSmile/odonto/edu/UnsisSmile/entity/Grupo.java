/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Grupo
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupo")

public class Grupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_grupos")
    private Integer idGrupos;
    @Column(name = "grupo")
    private String grupo;
    @OneToMany(mappedBy = "grupo", fetch = FetchType.LAZY)
    private List<SemestreGrupo> semestreGrupoList;

    public Grupo() {
    }

    public Grupo(Integer idGrupos) {
        this.idGrupos = idGrupos;
    }

    public Integer getIdGrupos() {
        return idGrupos;
    }

    public void setIdGrupos(Integer idGrupos) {
        this.idGrupos = idGrupos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List<SemestreGrupo> getSemestreGrupoList() {
        return semestreGrupoList;
    }

    public void setSemestreGrupoList(List<SemestreGrupo> semestreGrupoList) {
        this.semestreGrupoList = semestreGrupoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGrupos != null ? idGrupos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.idGrupos == null && other.idGrupos != null) || (this.idGrupos != null && !this.idGrupos.equals(other.idGrupos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.Grupo[ idGrupos=" + idGrupos + " ]";
    }
    
}
