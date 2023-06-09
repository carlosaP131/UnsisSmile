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
@Table(name = "paciente_alumno")

public class PacienteAlumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paciente_alumno")
    private Integer idPacienteAlumno;
    @JoinColumn(name = "fk_id_alumno", referencedColumnName = "id_alumno")
    @ManyToOne(fetch = FetchType.LAZY)
    private Alumnos alumnos;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;
    @JoinColumn(name = "fk_id_rol_alumno", referencedColumnName = "id_rol_alumno")
    @ManyToOne(fetch = FetchType.LAZY)
    private RolAlumno rolAlumno;

    public PacienteAlumno() {
    }

    public PacienteAlumno(Integer idPacienteAlumno) {
        this.idPacienteAlumno = idPacienteAlumno;
    }

    public Integer getIdPacienteAlumno() {
        return idPacienteAlumno;
    }

    public void setIdPacienteAlumno(Integer idPacienteAlumno) {
        this.idPacienteAlumno = idPacienteAlumno;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public RolAlumno getRolAlumno() {
        return rolAlumno;
    }

    public void setRolAlumno(RolAlumno rolAlumno) {
        this.rolAlumno = rolAlumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPacienteAlumno != null ? idPacienteAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteAlumno)) {
            return false;
        }
        PacienteAlumno other = (PacienteAlumno) object;
        if ((this.idPacienteAlumno == null && other.idPacienteAlumno != null) || (this.idPacienteAlumno != null && !this.idPacienteAlumno.equals(other.idPacienteAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.PacienteAlumno[ idPacienteAlumno=" + idPacienteAlumno + " ]";
    }
    
}
