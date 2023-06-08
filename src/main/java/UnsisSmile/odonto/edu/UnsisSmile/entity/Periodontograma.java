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
@Table(name = "periodontograma")
//@NamedQueries({
//    @NamedQuery(name = "Periodontograma.findAll", query = "SELECT p FROM Periodontograma p")})
public class Periodontograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_periodontograma")
    private Integer idPeriodontograma;
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
//    @Column(name = "fecha")
//    @Temporal(TemporalType.DATE)
//    private Date fecha;
//    @OneToMany(mappedBy = "periodontograma", fetch = FetchType.LAZY)
//    private List<MedicionBolsasDetalle> medicionBolsasDetalleList;

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
//
//    public Date getFecha() {
//        return fecha;
//    }
//
//    public void setFecha(Date fecha) {
//        this.fecha = fecha;
//    }
//
//    public List<MedicionBolsasDetalle> getMedicionBolsasDetalleList() {
//        return medicionBolsasDetalleList;
//    }
//
//    public void setMedicionBolsasDetalleList(List<MedicionBolsasDetalle> medicionBolsasDetalleList) {
//        this.medicionBolsasDetalleList = medicionBolsasDetalleList;
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
        return "entity.Periodontograma[ idPeriodontograma=" + idPeriodontograma + " ]";
    }
    
}
