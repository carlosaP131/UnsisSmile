/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnsisSmile.odonto.edu.entity;

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
 * @author froste
 */
//@Entity
//@Table(name = "periodontograma")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Periodontograma.findAll", query = "SELECT p FROM Periodontograma p"),
//    @NamedQuery(name = "Periodontograma.findByIdPeriodontograma", query = "SELECT p FROM Periodontograma p WHERE p.idPeriodontograma = :idPeriodontograma"),
//    @NamedQuery(name = "Periodontograma.findByFecha", query = "SELECT p FROM Periodontograma p WHERE p.fecha = :fecha")})
public class Periodontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Basic(optional = false)
    @jakarta.persistence.Column(name = "id_periodontograma")
    private Integer idPeriodontograma;
    @jakarta.persistence.Lob
    @jakarta.persistence.Column(name = "descripcion")
    private String descripcion;
    @jakarta.persistence.Column(name = "fecha")
  //  @Temporal(TemporalType.DATE)
    private Date fecha;
   // @jakarta.persistence.OneToMany(mappedBy = "fkIdPeriodontograma")
    //private Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection;

    public Periodontograma() {
    }

    public Periodontograma(Integer idPeriodontograma) {
        this.idPeriodontograma = idPeriodontograma;
    }

    public Integer getIdPeriodontograma() {
        return idPeriodontograma;
    }

    public void setIdPeriodontograma(Integer idPeriodontograma) {
        this.idPeriodontograma = idPeriodontograma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

//    @XmlTransient
//    public Collection<MedicionBolsasDetalle> getMedicionBolsasDetalleCollection() {
//        return medicionBolsasDetalleCollection;
//    }
//
//    public void setMedicionBolsasDetalleCollection(Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection) {
//        this.medicionBolsasDetalleCollection = medicionBolsasDetalleCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodontograma != null ? idPeriodontograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Periodontograma)) {
            return false;
        }
        Periodontograma other = (Periodontograma) object;
        if ((this.idPeriodontograma == null && other.idPeriodontograma != null) || (this.idPeriodontograma != null && !this.idPeriodontograma.equals(other.idPeriodontograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Periodontograma[ idPeriodontograma=" + idPeriodontograma + " ]";
    }
    
}
