/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnsisSmile.odonto.edu.entity;

import java.io.Serializable;


/**
 *
 * @author froste
 */
//@Entity
//@Table(name = "region_diente")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "RegionDiente.findAll", query = "SELECT r FROM RegionDiente r"),
//    @NamedQuery(name = "RegionDiente.findByIdRegion", query = "SELECT r FROM RegionDiente r WHERE r.idRegion = :idRegion"),
//    @NamedQuery(name = "RegionDiente.findByDescripcion", query = "SELECT r FROM RegionDiente r WHERE r.descripcion = :descripcion")})

public class RegionDiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Basic(optional = false)
    @jakarta.persistence.Column(name = "id_region")
    private Integer idRegion;
    @jakarta.persistence.Column(name = "descripcion")
    private String descripcion;
    
  //  @jakarta.persistence.OneToMany(mappedBy = "fkIdRegionDiente")    
   // private Collection<DienteDetalle> dienteDetalleCollection;

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

//    @XmlTransient
//    public Collection<DienteDetalle> getDienteDetalleCollection() {
//        return dienteDetalleCollection;
//    }

//    public void setDienteDetalleCollection(Collection<DienteDetalle> dienteDetalleCollection) {
//        this.dienteDetalleCollection = dienteDetalleCollection;
//    }

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
        return "com.unsis.odonto.edu.entity.RegionDiente[ idRegion=" + idRegion + " ]";
    }
    
}
