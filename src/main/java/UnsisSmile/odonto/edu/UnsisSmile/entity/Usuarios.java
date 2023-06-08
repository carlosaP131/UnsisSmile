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
@Table(name = "usuarios")
//@NamedQueries({
//    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @Column(name = "pass_usuario")
    private String passUsuario;
    @Column(name = "estatus")
    private Boolean estatus;
    @Column(name = "nombreRol")
    private String nombreRol;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarios", fetch = FetchType.LAZY)
//    private List<Alumnos> alumnosList;
//    @JoinColumn(name = "f_id_rol", referencedColumnName = "id_rol")
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private RolesTiposUsuario rolesTiposUsuario;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarios", fetch = FetchType.LAZY)
//    private List<Consulta> consultaList;
//    @OneToMany(mappedBy = "usuarios", fetch = FetchType.LAZY)
//    private List<Administradores> administradoresList;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarios", fetch = FetchType.LAZY)
//    private List<Catedraticos> catedraticosList;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuarios(Integer idUsuario, String nombreUsuario, String passUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = passUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

//    public List<Alumnos> getAlumnosList() {
//        return alumnosList;
//    }
//
//    public void setAlumnosList(List<Alumnos> alumnosList) {
//        this.alumnosList = alumnosList;
//    }
//
//    public RolesTiposUsuario getRolesTiposUsuario() {
//        return rolesTiposUsuario;
//    }
//
//    public void setRolesTiposUsuario(RolesTiposUsuario rolesTiposUsuario) {
//        this.rolesTiposUsuario = rolesTiposUsuario;
//    }
//
//    public List<Consulta> getConsultaList() {
//        return consultaList;
//    }
//
//    public void setConsultaList(List<Consulta> consultaList) {
//        this.consultaList = consultaList;
//    }
//
//    public List<Administradores> getAdministradoresList() {
//        return administradoresList;
//    }
//
//    public void setAdministradoresList(List<Administradores> administradoresList) {
//        this.administradoresList = administradoresList;
//    }
//
//    public List<Catedraticos> getCatedraticosList() {
//        return catedraticosList;
//    }
//
//    public void setCatedraticosList(List<Catedraticos> catedraticosList) {
//        this.catedraticosList = catedraticosList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
