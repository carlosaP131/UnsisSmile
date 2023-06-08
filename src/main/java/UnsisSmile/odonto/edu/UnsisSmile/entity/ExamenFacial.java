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
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 *
 * @author froste
 */
@Entity
@Table(name = "examen_facial")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ExamenFacial.findAll", query = "SELECT e FROM ExamenFacial e"),
//    @NamedQuery(name = "ExamenFacial.findByIdExamenFacial", query = "SELECT e FROM ExamenFacial e WHERE e.idExamenFacial = :idExamenFacial")})
public class ExamenFacial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_examen_facial")
    private Integer idExamenFacial;
    @Lob
    @Column(name = "perfil")
    private String perfil;
    @Lob
    @Column(name = "frente")
    private String frente;
    @Lob
    @Column(name = "senias_particulares")
    private String seniasParticulares;
//    @OneToMany(mappedBy = "fkIdExamenFacial")
//    private Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection;

    public ExamenFacial() {
    }

    public ExamenFacial(Integer idExamenFacial) {
        this.idExamenFacial = idExamenFacial;
    }

    public Integer getIdExamenFacial() {
        return idExamenFacial;
    }

    public void setIdExamenFacial(Integer idExamenFacial) {
        this.idExamenFacial = idExamenFacial;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getFrente() {
        return frente;
    }

    public void setFrente(String frente) {
        this.frente = frente;
    }

    public String getSeniasParticulares() {
        return seniasParticulares;
    }

    public void setSeniasParticulares(String seniasParticulares) {
        this.seniasParticulares = seniasParticulares;
    }

//    @XmlTransient
//    public Collection<HistoriaClinicaGeneral> getHistoriaClinicaGeneralCollection() {
//        return historiaClinicaGeneralCollection;
//    }
//
//    public void setHistoriaClinicaGeneralCollection(Collection<HistoriaClinicaGeneral> historiaClinicaGeneralCollection) {
//        this.historiaClinicaGeneralCollection = historiaClinicaGeneralCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExamenFacial != null ? idExamenFacial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenFacial)) {
            return false;
        }
        ExamenFacial other = (ExamenFacial) object;
        if ((this.idExamenFacial == null && other.idExamenFacial != null) || (this.idExamenFacial != null && !this.idExamenFacial.equals(other.idExamenFacial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.ExamenFacial[ idExamenFacial=" + idExamenFacial + " ]";
    }
    
}
