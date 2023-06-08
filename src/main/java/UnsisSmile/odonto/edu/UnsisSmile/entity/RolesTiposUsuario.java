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
@Table(name = "roles_tipos_usuario")
//@NamedQueries({
//    @NamedQuery(name = "RolesTiposUsuario.findAll", query = "SELECT r FROM RolesTiposUsuario r")})
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
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolesTiposUsuario", fetch = FetchType.LAZY)
//    private List<Usuarios> usuariosList;

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

//    public List<Usuarios> getUsuariosList() {
//        return usuariosList;
//    }
//
//    public void setUsuariosList(List<Usuarios> usuariosList) {
//        this.usuariosList = usuariosList;
//    }

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
        return "entity.RolesTiposUsuario[ idRol=" + idRol + " ]";
    }
    
}
