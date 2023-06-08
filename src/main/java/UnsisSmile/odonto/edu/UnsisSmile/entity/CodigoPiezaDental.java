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
 * @author froste
 */
@Entity
@Table(name = "codigo_pieza_dental")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "CodigoPiezaDental.findAll", query = "SELECT c FROM CodigoPiezaDental c"),
//    @NamedQuery(name = "CodigoPiezaDental.findByIdCodigoPiezaDental", query = "SELECT c FROM CodigoPiezaDental c WHERE c.idCodigoPiezaDental = :idCodigoPiezaDental"),
//    @NamedQuery(name = "CodigoPiezaDental.findByCodigo", query = "SELECT c FROM CodigoPiezaDental c WHERE c.codigo = :codigo"),
//    @NamedQuery(name = "CodigoPiezaDental.findByAdulto", query = "SELECT c FROM CodigoPiezaDental c WHERE c.adulto = :adulto")})
public class CodigoPiezaDental implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_codigo_pieza_dental")
    private Integer idCodigoPiezaDental;
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "adulto")
    private Boolean adulto;
//    @OneToMany(mappedBy = "fkIdCodigoPiezaDental")
//    private Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection;
//    @OneToMany(mappedBy = "fkIdCodigoPiezaDental")
//    private Collection<DienteDetalle> dienteDetalleCollection;

    public CodigoPiezaDental() {
    }

    public CodigoPiezaDental(Integer idCodigoPiezaDental) {
        this.idCodigoPiezaDental = idCodigoPiezaDental;
    }

    public Integer getIdCodigoPiezaDental() {
        return idCodigoPiezaDental;
    }

    public void setIdCodigoPiezaDental(Integer idCodigoPiezaDental) {
        this.idCodigoPiezaDental = idCodigoPiezaDental;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getAdulto() {
        return adulto;
    }

    public void setAdulto(Boolean adulto) {
        this.adulto = adulto;
    }

//    @XmlTransient
//    public Collection<MedicionBolsasDetalle> getMedicionBolsasDetalleCollection() {
//        return medicionBolsasDetalleCollection;
//    }
//
//    public void setMedicionBolsasDetalleCollection(Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection) {
//        this.medicionBolsasDetalleCollection = medicionBolsasDetalleCollection;
//    }
//
//    @XmlTransient
//    public Collection<DienteDetalle> getDienteDetalleCollection() {
//        return dienteDetalleCollection;
//    }
//
//    public void setDienteDetalleCollection(Collection<DienteDetalle> dienteDetalleCollection) {
//        this.dienteDetalleCollection = dienteDetalleCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCodigoPiezaDental != null ? idCodigoPiezaDental.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CodigoPiezaDental)) {
            return false;
        }
        CodigoPiezaDental other = (CodigoPiezaDental) object;
        if ((this.idCodigoPiezaDental == null && other.idCodigoPiezaDental != null) || (this.idCodigoPiezaDental != null && !this.idCodigoPiezaDental.equals(other.idCodigoPiezaDental))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.CodigoPiezaDental[ idCodigoPiezaDental=" + idCodigoPiezaDental + " ]";
    }
    
}
