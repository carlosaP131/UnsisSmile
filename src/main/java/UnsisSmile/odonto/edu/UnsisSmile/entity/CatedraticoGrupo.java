/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Catedratico grupo
 */

package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;   
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 *
 * @author labingsw05
 */
@Entity
@Table(name = "catedratico_grupo")
public class CatedraticoGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_catedratico_semestre_grupo")
    private Integer idCatedraticoSemestreGrupo;
    @JoinColumn(name = "fk_id_catedratico", referencedColumnName = "id_catedratico")
    @ManyToOne(fetch = FetchType.LAZY)
    private Catedraticos catedraticos;
    @JoinColumn(name = "fk_id_semestre_grupo", referencedColumnName = "id_semestre_grupo")
    @ManyToOne(fetch = FetchType.LAZY)
    private SemestreGrupo semestreGrupo;

    public CatedraticoGrupo() {
    }

    public CatedraticoGrupo(Integer idCatedraticoSemestreGrupo) {
        this.idCatedraticoSemestreGrupo = idCatedraticoSemestreGrupo;
    }

    public Integer getIdCatedraticoSemestreGrupo() {
        return idCatedraticoSemestreGrupo;
    }

    public void setIdCatedraticoSemestreGrupo(Integer idCatedraticoSemestreGrupo) {
        this.idCatedraticoSemestreGrupo = idCatedraticoSemestreGrupo;
    }

    public Catedraticos getCatedraticos() {
        return catedraticos;
    }

    public void setCatedraticos(Catedraticos catedraticos) {
        this.catedraticos = catedraticos;
    }

    public SemestreGrupo getSemestreGrupo() {
        return semestreGrupo;
    }

    public void setSemestreGrupo(SemestreGrupo semestreGrupo) {
        this.semestreGrupo = semestreGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatedraticoSemestreGrupo != null ? idCatedraticoSemestreGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatedraticoGrupo)) {
            return false;
        }
        CatedraticoGrupo other = (CatedraticoGrupo) object;
        if ((this.idCatedraticoSemestreGrupo == null && other.idCatedraticoSemestreGrupo != null) || (this.idCatedraticoSemestreGrupo != null && !this.idCatedraticoSemestreGrupo.equals(other.idCatedraticoSemestreGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.CatedraticoGrupo[ idCatedraticoSemestreGrupo=" + idCatedraticoSemestreGrupo + " ]";
    }
    
}
