/** ****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:8-06-2023
 *Descripción: Entity Alumnos
 **
 * ****************************************************************************/
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author labingsw05
 */
@Entity
@Table(name = "alumnos")
//@NamedQueries({
//    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a")})
public class Alumnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_alumno")
    private Integer idAlumno;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "apellido2")
    private String apellido2;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "curp")
    private String curp;
    @Column(name = "matricula")
    private String matricula;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "email_alumno")
    private String emailAlumno;
    @Column(name = "estatus")
    private Boolean estatus;
//    @OneToMany(mappedBy = "alumnos", fetch = FetchType.LAZY)
//    private List<PacienteAlumno> pacienteAlumnoList;
//    @JoinColumn(name = "fk_id_semestre_grupo", referencedColumnName = "id_semestre_grupo")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private SemestreGrupo semestreGrupo;
//    @JoinColumn(name = "f_id_usuario", referencedColumnName = "id_usuario")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Usuarios usuarios;

    public Alumnos() {
    }

    public Alumnos(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Alumnos(Integer idAlumno, String emailAlumno) {
        this.idAlumno = idAlumno;
        this.emailAlumno = emailAlumno;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

//    public List<PacienteAlumno> getPacienteAlumnoList() {
//        return pacienteAlumnoList;
//    }
//
//    public void setPacienteAlumnoList(List<PacienteAlumno> pacienteAlumnoList) {
//        this.pacienteAlumnoList = pacienteAlumnoList;
//    }
//
//    public SemestreGrupo getSemestreGrupo() {
//        return semestreGrupo;
//    }
//
//    public void setSemestreGrupo(SemestreGrupo semestreGrupo) {
//        this.semestreGrupo = semestreGrupo;
//    }
//
//    public Usuarios getUsuarios() {
//        return usuarios;
//    }
//
//    public void setUsuarios(Usuarios usuarios) {
//        this.usuarios = usuarios;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlumno != null ? idAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.idAlumno == null && other.idAlumno != null) || (this.idAlumno != null && !this.idAlumno.equals(other.idAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Alumnos[ idAlumno=" + idAlumno + " ]";
    }
    
}
