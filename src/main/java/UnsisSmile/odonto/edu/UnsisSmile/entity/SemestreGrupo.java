package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "semestre_grupo")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "SemestreGrupo.findAll", query = "SELECT s FROM SemestreGrupo s"),
//    @NamedQuery(name = "SemestreGrupo.findByIdSemestreGrupo", query = "SELECT s FROM SemestreGrupo s WHERE s.idSemestreGrupo = :idSemestreGrupo")})
public class SemestreGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_semestre_grupo")
    private Integer idSemestreGrupo;
//    @OneToMany(mappedBy = "fkIdSemestreGrupo")
//    private Collection<Alumnos> alumnosCollection;
    @JoinColumn(name = "fk_id_grupo", referencedColumnName = "id_grupos")
    @ManyToOne
    private Grupo fkIdGrupo;
    @JoinColumn(name = "fk_id_semestre", referencedColumnName = "id_semestre")
    @ManyToOne
    private Semestres fkIdSemestre;
//    @OneToMany(mappedBy = "fkIdSemestreGrupo")
//    private Collection<CatedraticoGrupo> catedraticoGrupoCollection;

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

//    @XmlTransient
//    public Collection<Alumnos> getAlumnosCollection() {
//        return alumnosCollection;
//    }
//
//    public void setAlumnosCollection(Collection<Alumnos> alumnosCollection) {
//        this.alumnosCollection = alumnosCollection;
//    }

    public Grupo getFkIdGrupo() {
        return fkIdGrupo;
    }

    public void setFkIdGrupo(Grupo fkIdGrupo) {
        this.fkIdGrupo = fkIdGrupo;
    }

    public Semestres getFkIdSemestre() {
        return fkIdSemestre;
    }

    public void setFkIdSemestre(Semestres fkIdSemestre) {
        this.fkIdSemestre = fkIdSemestre;
    }
//
//    @XmlTransient
//    public Collection<CatedraticoGrupo> getCatedraticoGrupoCollection() {
//        return catedraticoGrupoCollection;
//    }
//
//    public void setCatedraticoGrupoCollection(Collection<CatedraticoGrupo> catedraticoGrupoCollection) {
//        this.catedraticoGrupoCollection = catedraticoGrupoCollection;
//    }

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
        return "com.unsis.odonto.edu.entity.SemestreGrupo[ idSemestreGrupo=" + idSemestreGrupo + " ]";
    }
    
}
