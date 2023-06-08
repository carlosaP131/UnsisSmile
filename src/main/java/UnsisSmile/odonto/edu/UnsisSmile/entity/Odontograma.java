/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnsisSmile.odonto.edu.UnsisSmile.entity;

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
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 *
 * @author froste
 */
@Entity
@Table(name = "odontograma")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Odontograma.findAll", query = "SELECT o FROM Odontograma o"),
//    @NamedQuery(name = "Odontograma.findByIdOdontograma", query = "SELECT o FROM Odontograma o WHERE o.idOdontograma = :idOdontograma"),
//    @NamedQuery(name = "Odontograma.findByFecha", query = "SELECT o FROM Odontograma o WHERE o.fecha = :fecha")})
public class Odontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_odontograma")
    private Integer idOdontograma;
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha")
  //  @Temporal(TemporalType.DATE)
    private Date fecha;
//    @OneToMany(mappedBy = "fkIdOdontogramaInicial")
//    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;
//    @OneToMany(mappedBy = "fkIdOdontogramaFinal")
//    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection1;
//    @OneToMany(mappedBy = "fkIdOdontograma")
//    private Collection<DienteDetalle> dienteDetalleCollection;

    public Odontograma() {
    }

    public Odontograma(Integer idOdontograma) {
        this.idOdontograma = idOdontograma;
    }

    public Integer getIdOdontograma() {
        return idOdontograma;
    }

    public void setIdOdontograma(Integer idOdontograma) {
        this.idOdontograma = idOdontograma;
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
//    public Collection<HistoriaClinicaGeneral> getHistoriaClinicaGeneralCollection() {
//        return historiaClinicaGeneralCollection;
//    }

//    public void setHistoriaClinicaGeneralCollection(Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection) {
//        this.historiaClinicaGeneralCollection = historiaClinicaGeneralCollection;
//    }

//    @XmlTransient
//    public Collection<HistoriaClinicaGeneral> getHistoriaClinicaGeneralCollection1() {
//        return historiaClinicaGeneralCollection1;
//    }

//    public void setHistoriaClinicaGeneralCollection1(Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection1) {
//        this.historiaClinicaGeneralCollection1 = historiaClinicaGeneralCollection1;
//    }

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
        hash += (idOdontograma != null ? idOdontograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Odontograma)) {
            return false;
        }
        Odontograma other = (Odontograma) object;
        if ((this.idOdontograma == null && other.idOdontograma != null) || (this.idOdontograma != null && !this.idOdontograma.equals(other.idOdontograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Odontograma[ idOdontograma=" + idOdontograma + " ]";
    }
    
}
