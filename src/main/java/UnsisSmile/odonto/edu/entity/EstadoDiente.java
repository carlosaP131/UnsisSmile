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
@Table(name = "estado_diente")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "EstadoDiente.findAll", query = "SELECT e FROM EstadoDiente e"),
//    @NamedQuery(name = "EstadoDiente.findByIdEstadoDiente", query = "SELECT e FROM EstadoDiente e WHERE e.idEstadoDiente = :idEstadoDiente"),
//    @NamedQuery(name = "EstadoDiente.findByDescripcion", query = "SELECT e FROM EstadoDiente e WHERE e.descripcion = :descripcion")})
public class EstadoDiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado_diente")
    private Integer idEstadoDiente;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "fkIdEstadoDiente")
    private Collection<DienteDetalle> dienteDetalleCollection;

    public EstadoDiente() {
    }

    public EstadoDiente(Integer idEstadoDiente) {
        this.idEstadoDiente = idEstadoDiente;
    }

    public Integer getIdEstadoDiente() {
        return idEstadoDiente;
    }

    public void setIdEstadoDiente(Integer idEstadoDiente) {
        this.idEstadoDiente = idEstadoDiente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //@XmlTransient
    public Collection<DienteDetalle> getDienteDetalleCollection() {
        return dienteDetalleCollection;
    }

    public void setDienteDetalleCollection(Collection<DienteDetalle> dienteDetalleCollection) {
        this.dienteDetalleCollection = dienteDetalleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoDiente != null ? idEstadoDiente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoDiente)) {
            return false;
        }
        EstadoDiente other = (EstadoDiente) object;
        if ((this.idEstadoDiente == null && other.idEstadoDiente != null) || (this.idEstadoDiente != null && !this.idEstadoDiente.equals(other.idEstadoDiente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.EstadoDiente[ idEstadoDiente=" + idEstadoDiente + " ]";
    }
    
}
