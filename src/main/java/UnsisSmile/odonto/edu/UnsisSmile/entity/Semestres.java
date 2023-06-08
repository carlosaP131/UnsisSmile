package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable; 
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author labingsw05
 */
@Entity
@Table(name = "semestres")
//@NamedQueries({
//    @NamedQuery(name = "Semestres.findAll", query = "SELECT s FROM Semestres s")})
public class Semestres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_semestre")
    private Integer idSemestre;
    @Column(name = "semestre")
    private String semestre;
    @OneToMany(mappedBy = "semestres", fetch = FetchType.LAZY)
    private List<SemestreGrupo> semestreGrupoList;

    public Semestres() {
    }

    public Semestres(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }

    public Integer getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
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
        hash += (idSemestre != null ? idSemestre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semestres)) {
            return false;
        }
        Semestres other = (Semestres) object;
        if ((this.idSemestre == null && other.idSemestre != null) || (this.idSemestre != null && !this.idSemestre.equals(other.idSemestre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Semestres[ idSemestre=" + idSemestre + " ]";
    }
    
}
