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
@Table(name = "regiones_medicion_bolsas")
public class RegionesMedicionBolsas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_regiones_medicion_bolsas")
    private Integer idRegionesMedicionBolsas;
    @Column(name = "region")
    private String region;
    @OneToMany(mappedBy = "regionesMedicionBolsas", fetch = FetchType.LAZY)
    private List<MedicionBolsasDetalle> medicionBolsasDetalleList;

    public RegionesMedicionBolsas() {
    }

    public RegionesMedicionBolsas(Integer idRegionesMedicionBolsas) {
        this.idRegionesMedicionBolsas = idRegionesMedicionBolsas;
    }

    public Integer getIdRegionesMedicionBolsas() {
        return idRegionesMedicionBolsas;
    }

    public void setIdRegionesMedicionBolsas(Integer idRegionesMedicionBolsas) {
        this.idRegionesMedicionBolsas = idRegionesMedicionBolsas;
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
        hash += (idRegionesMedicionBolsas != null ? idRegionesMedicionBolsas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegionesMedicionBolsas)) {
            return false;
        }
        RegionesMedicionBolsas other = (RegionesMedicionBolsas) object;
        if ((this.idRegionesMedicionBolsas == null && other.idRegionesMedicionBolsas != null) || (this.idRegionesMedicionBolsas != null && !this.idRegionesMedicionBolsas.equals(other.idRegionesMedicionBolsas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.RegionesMedicionBolsas[ idRegionesMedicionBolsas=" + idRegionesMedicionBolsas + " ]";
    }
    
}
