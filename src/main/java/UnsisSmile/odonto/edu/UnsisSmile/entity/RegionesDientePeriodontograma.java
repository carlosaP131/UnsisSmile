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
@Table(name = "regiones_diente_periodontograma")
//@NamedQueries({
//    @NamedQuery(name = "RegionesDientePeriodontograma.findAll", query = "SELECT r FROM RegionesDientePeriodontograma r")})
public class RegionesDientePeriodontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_regiones_diente_periodontograma")
    private Integer idRegionesDientePeriodontograma;
    @Column(name = "region")
    private String region;
    @OneToMany(mappedBy = "regionesDientePeriodontograma", fetch = FetchType.LAZY)
    private List<MedicionBolsasDetalle> medicionBolsasDetalleList;

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

    public List<MedicionBolsasDetalle> getMedicionBolsasDetalleList() {
        return medicionBolsasDetalleList;
    }

    public void setMedicionBolsasDetalleList(List<MedicionBolsasDetalle> medicionBolsasDetalleList) {
        this.medicionBolsasDetalleList = medicionBolsasDetalleList;
    }

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
        return "entity.RegionesDientePeriodontograma[ idRegionesDientePeriodontograma=" + idRegionesDientePeriodontograma + " ]";
    }
    
}
