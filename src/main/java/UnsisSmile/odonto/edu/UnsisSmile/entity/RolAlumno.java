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
@Table(name = "rol_alumno")
//@NamedQueries({
//    @NamedQuery(name = "RolAlumno.findAll", query = "SELECT r FROM RolAlumno r")})
public class RolAlumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol_alumno")
    private Integer idRolAlumno;
    @Column(name = "rol_alumno")
    private String rolAlumno;
    @OneToMany(mappedBy = "rolAlumno", fetch = FetchType.LAZY)
    private List<PacienteAlumno> pacienteAlumnoList;

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

    public List<PacienteAlumno> getPacienteAlumnoList() {
        return pacienteAlumnoList;
    }

    public void setPacienteAlumnoList(List<PacienteAlumno> pacienteAlumnoList) {
        this.pacienteAlumnoList = pacienteAlumnoList;
    }

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
        return "entity.RolAlumno[ idRolAlumno=" + idRolAlumno + " ]";
    }
    
}
