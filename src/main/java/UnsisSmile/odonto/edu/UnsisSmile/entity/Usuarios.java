/**
 * 
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Usuarios
 */

package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;   
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
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
@Table(name = "usuarios")

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarios", fetch = FetchType.LAZY)
    private List<Alumnos> alumnosList;
    @JoinColumn(name = "f_id_rol", referencedColumnName = "id_rol")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RolesTiposUsuario rolesTiposUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarios", fetch = FetchType.LAZY)
    private List<Consulta> consultaList;
    @OneToMany(mappedBy = "usuarios", fetch = FetchType.LAZY)
    private List<Administradores> administradoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarios", fetch = FetchType.LAZY)
    private List<Catedraticos> catedraticosList;

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

    public List<Alumnos> getAlumnosList() {
        return alumnosList;
    }

    public void setAlumnosList(List<Alumnos> alumnosList) {
        this.alumnosList = alumnosList;
    }

    public RolesTiposUsuario getRolesTiposUsuario() {
        return rolesTiposUsuario;
    }

    public void setRolesTiposUsuario(RolesTiposUsuario rolesTiposUsuario) {
        this.rolesTiposUsuario = rolesTiposUsuario;
    }

    public List<Consulta> getConsultaList() {
        return consultaList;
    }

    public void setConsultaList(List<Consulta> consultaList) {
        this.consultaList = consultaList;
    }

    public List<Administradores> getAdministradoresList() {
        return administradoresList;
    }

    public void setAdministradoresList(List<Administradores> administradoresList) {
        this.administradoresList = administradoresList;
    }

    public List<Catedraticos> getCatedraticosList() {
        return catedraticosList;
    }

    public void setCatedraticosList(List<Catedraticos> catedraticosList) {
        this.catedraticosList = catedraticosList;
    }

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
        return "com.unsis.odonto.edu.entity.base.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
