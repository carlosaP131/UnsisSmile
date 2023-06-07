
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


@Entity
@Table(name = "regiones_diente_periodontograma")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "RegionesDientePeriodontograma.findAll", query = "SELECT r FROM RegionesDientePeriodontograma r"),
//    @NamedQuery(name = "RegionesDientePeriodontograma.findByIdRegionesDientePeriodontograma", query = "SELECT r FROM RegionesDientePeriodontograma r WHERE r.idRegionesDientePeriodontograma = :idRegionesDientePeriodontograma"),
//    @NamedQuery(name = "RegionesDientePeriodontograma.findByRegion", query = "SELECT r FROM RegionesDientePeriodontograma r WHERE r.region = :region")})
public class RegionesDientePeriodontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_regiones_diente_periodontograma")
    private Integer idRegionesDientePeriodontograma;
    @Column(name = "region")
    private String region;
//    @OneToMany(mappedBy = "fkIdRegionesDientePeriodontograma")
//    private Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection;

    public RegionesDientePeriodontograma() {
    }

    public RegionesDientePeriodontograma(Integer idRegionesDientePeriodontograma) {
        this.idRegionesDientePeriodontograma = idRegionesDientePeriodontograma;
    }

    public Integer getIdRegionesDientePeriodontograma() {
        return idRegionesDientePeriodontograma;
    }

    public void setIdRegionesDientePeriodontograma(Integer idRegionesDientePeriodontograma) {
        this.idRegionesDientePeriodontograma = idRegionesDientePeriodontograma;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

//    @XmlTransient
//    public Collection<MedicionBolsasDetalle> getMedicionBolsasDetalleCollection() {
//        return medicionBolsasDetalleCollection;
//    }

//    public void setMedicionBolsasDetalleCollection(Collection<MedicionBolsasDetalle> medicionBolsasDetalleCollection) {
//        this.medicionBolsasDetalleCollection = medicionBolsasDetalleCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegionesDientePeriodontograma != null ? idRegionesDientePeriodontograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionesDientePeriodontograma)) {
            return false;
        }
        RegionesDientePeriodontograma other = (RegionesDientePeriodontograma) object;
        if ((this.idRegionesDientePeriodontograma == null && other.idRegionesDientePeriodontograma != null) || (this.idRegionesDientePeriodontograma != null && !this.idRegionesDientePeriodontograma.equals(other.idRegionesDientePeriodontograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.RegionesDientePeriodontograma[ idRegionesDientePeriodontograma=" + idRegionesDientePeriodontograma + " ]";
    }
    
}
