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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author labingsw05
 */
@Entity
@Table(name = "odontograma")

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
    @Column(name = "fecha", columnDefinition = "DATE")
    private LocalDate fecha;
    @OneToMany(mappedBy = "odontograma", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;
    @OneToMany(mappedBy = "odontograma1", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList1;
    @OneToMany(mappedBy = "odontograma", fetch = FetchType.LAZY)
    private List<DienteDetalle> dienteDetalleList;

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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<HistoriaClinicaGeneral> getHistoriaClinicaGeneralList() {
        return historiaClinicaGeneralList;
    }

    public void setHistoriaClinicaGeneralList(List<HistoriaClinicaGeneral> historiaClinicaGeneralList) {
        this.historiaClinicaGeneralList = historiaClinicaGeneralList;
    }

    public List<HistoriaClinicaGeneral> getHistoriaClinicaGeneralList1() {
        return historiaClinicaGeneralList1;
    }

    public void setHistoriaClinicaGeneralList1(List<HistoriaClinicaGeneral> historiaClinicaGeneralList1) {
        this.historiaClinicaGeneralList1 = historiaClinicaGeneralList1;
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
        return "com.unsis.odonto.edu.entity.base.Odontograma[ idOdontograma=" + idOdontograma + " ]";
    }
    
}
