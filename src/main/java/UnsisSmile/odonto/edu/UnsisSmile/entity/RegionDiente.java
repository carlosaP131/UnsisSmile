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
@Table(name = "region_diente")
//@NamedQueries({
//    @NamedQuery(name = "RegionDiente.findAll", query = "SELECT r FROM RegionDiente r")})
public class RegionDiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_region")
    private Integer idRegion;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "regionDiente", fetch = FetchType.LAZY)
    private List<DienteDetalle> dienteDetalleList;

    public RegionDiente() {
    }

    public RegionDiente(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public Integer getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<DienteDetalle> getDienteDetalleList() {
        return dienteDetalleList;
    }

    public void setDienteDetalleList(List<DienteDetalle> dienteDetalleList) {
        this.dienteDetalleList = dienteDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegion != null ? idRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionDiente)) {
            return false;
        }
        RegionDiente other = (RegionDiente) object;
        if ((this.idRegion == null && other.idRegion != null) || (this.idRegion != null && !this.idRegion.equals(other.idRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RegionDiente[ idRegion=" + idRegion + " ]";
    }
    
}
