package UnsisSmile.odonto.edu.entity;

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
@Table(name = "rol_alumno")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "RolAlumno.findAll", query = "SELECT r FROM RolAlumno r"),
//    @NamedQuery(name = "RolAlumno.findByIdRolAlumno", query = "SELECT r FROM RolAlumno r WHERE r.idRolAlumno = :idRolAlumno"),
//    @NamedQuery(name = "RolAlumno.findByRolAlumno", query = "SELECT r FROM RolAlumno r WHERE r.rolAlumno = :rolAlumno")})
public class RolAlumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol_alumno")
    private Integer idRolAlumno;
    @Column(name = "rol_alumno")
    private String rolAlumno;
//    @OneToMany(mappedBy = "fkIdRolAlumno")
//    private Collection<PacienteAlumno> pacienteAlumnoCollection;

    public RolAlumno() {
    }

    public RolAlumno(Integer idRolAlumno) {
        this.idRolAlumno = idRolAlumno;
    }

    public Integer getIdRolAlumno() {
        return idRolAlumno;
    }

    public void setIdRolAlumno(Integer idRolAlumno) {
        this.idRolAlumno = idRolAlumno;
    }

    public String getRolAlumno() {
        return rolAlumno;
    }

    public void setRolAlumno(String rolAlumno) {
        this.rolAlumno = rolAlumno;
    }

//    @XmlTransient
//    public Collection<PacienteAlumno> getPacienteAlumnoCollection() {
//        return pacienteAlumnoCollection;
//    }
//
//    public void setPacienteAlumnoCollection(Collection<PacienteAlumno> pacienteAlumnoCollection) {
//        this.pacienteAlumnoCollection = pacienteAlumnoCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolAlumno != null ? idRolAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolAlumno)) {
            return false;
        }
        RolAlumno other = (RolAlumno) object;
        if ((this.idRolAlumno == null && other.idRolAlumno != null) || (this.idRolAlumno != null && !this.idRolAlumno.equals(other.idRolAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.RolAlumno[ idRolAlumno=" + idRolAlumno + " ]";
    }
    
}
