/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnsisSmile.odonto.edu.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "roles_tipos_usuario")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "RolesTiposUsuario.findAll", query = "SELECT r FROM RolesTiposUsuario r"),
//    @NamedQuery(name = "RolesTiposUsuario.findByIdRol", query = "SELECT r FROM RolesTiposUsuario r WHERE r.idRol = :idRol"),
//    @NamedQuery(name = "RolesTiposUsuario.findByNombreRol", query = "SELECT r FROM RolesTiposUsuario r WHERE r.nombreRol = :nombreRol")})
public class RolesTiposUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol")
    private Integer idRol;
    @Basic(optional = false)
    @Column(name = "nombre_rol")
    private String nombreRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fIdRol")
    private Collection<Usuarios> usuariosCollection;

    public RolesTiposUsuario() {
    }

    public RolesTiposUsuario(Integer idRol) {
        this.idRol = idRol;
    }

    public RolesTiposUsuario(Integer idRol, String nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

//    @XmlTransient
//    public Collection<Usuarios> getUsuariosCollection() {
//        return usuariosCollection;
//    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesTiposUsuario)) {
            return false;
        }
        RolesTiposUsuario other = (RolesTiposUsuario) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.RolesTiposUsuario[ idRol=" + idRol + " ]";
    }
    
}
