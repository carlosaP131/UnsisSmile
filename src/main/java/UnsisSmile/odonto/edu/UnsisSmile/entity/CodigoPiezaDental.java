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
@Table(name = "codigo_pieza_dental")

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
    @OneToMany(mappedBy = "codigoPiezaDental", fetch = FetchType.LAZY)
    private List<MedicionBolsasDetalle> medicionBolsasDetalleList;
    @OneToMany(mappedBy = "codigoPiezaDental", fetch = FetchType.LAZY)
    private List<DienteDetalle> dienteDetalleList;

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

    public List<MedicionBolsasDetalle> getMedicionBolsasDetalleList() {
        return medicionBolsasDetalleList;
    }

    public void setMedicionBolsasDetalleList(List<MedicionBolsasDetalle> medicionBolsasDetalleList) {
        this.medicionBolsasDetalleList = medicionBolsasDetalleList;
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
        return "com.unsis.odonto.edu.entity.base.CodigoPiezaDental[ idCodigoPiezaDental=" + idCodigoPiezaDental + " ]";
    }
    
}
