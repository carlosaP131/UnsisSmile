/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Medición bolsas detalle
 */
package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;  
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicion_bolsas_detalle")

public class MedicionBolsasDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medicion_bolsas_detalle")
    private Integer idMedicionBolsasDetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "medicion")
    private Float medicion;
    @JoinColumn(name = "fk_id_codigo_pieza_dental", referencedColumnName = "id_codigo_pieza_dental")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodigoPiezaDental codigoPiezaDental;
    @JoinColumn(name = "fk_id_periodontograma", referencedColumnName = "id_periodontograma")
    @ManyToOne(fetch = FetchType.LAZY)
    private Periodontograma periodontograma;
    @JoinColumn(name = "fk_id_regiones_diente_periodontograma", referencedColumnName = "id_regiones_diente_periodontograma")
    @ManyToOne(fetch = FetchType.LAZY)
    private RegionesDientePeriodontograma regionesDientePeriodontograma;
    @JoinColumn(name = "fk_id_regiones_medicion_bolsas", referencedColumnName = "id_regiones_medicion_bolsas")
    @ManyToOne(fetch = FetchType.LAZY)
    private RegionesMedicionBolsas regionesMedicionBolsas;

    public MedicionBolsasDetalle() {
    }

    public MedicionBolsasDetalle(Integer idMedicionBolsasDetalle) {
        this.idMedicionBolsasDetalle = idMedicionBolsasDetalle;
    }

    public Integer getIdMedicionBolsasDetalle() {
        return idMedicionBolsasDetalle;
    }

    public void setIdMedicionBolsasDetalle(Integer idMedicionBolsasDetalle) {
        this.idMedicionBolsasDetalle = idMedicionBolsasDetalle;
    }

    public Float getMedicion() {
        return medicion;
    }

    public void setMedicion(Float medicion) {
        this.medicion = medicion;
    }

    public CodigoPiezaDental getCodigoPiezaDental() {
        return codigoPiezaDental;
    }

    public void setCodigoPiezaDental(CodigoPiezaDental codigoPiezaDental) {
        this.codigoPiezaDental = codigoPiezaDental;
    }

    public Periodontograma getPeriodontograma() {
        return periodontograma;
    }

    public void setPeriodontograma(Periodontograma periodontograma) {
        this.periodontograma = periodontograma;
    }

    public RegionesDientePeriodontograma getRegionesDientePeriodontograma() {
        return regionesDientePeriodontograma;
    }

    public void setRegionesDientePeriodontograma(RegionesDientePeriodontograma regionesDientePeriodontograma) {
        this.regionesDientePeriodontograma = regionesDientePeriodontograma;
    }

    public RegionesMedicionBolsas getRegionesMedicionBolsas() {
        return regionesMedicionBolsas;
    }

    public void setRegionesMedicionBolsas(RegionesMedicionBolsas regionesMedicionBolsas) {
        this.regionesMedicionBolsas = regionesMedicionBolsas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicionBolsasDetalle != null ? idMedicionBolsasDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedicionBolsasDetalle)) {
            return false;
        }
        MedicionBolsasDetalle other = (MedicionBolsasDetalle) object;
        if ((this.idMedicionBolsasDetalle == null && other.idMedicionBolsasDetalle != null) || (this.idMedicionBolsasDetalle != null && !this.idMedicionBolsasDetalle.equals(other.idMedicionBolsasDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.MedicionBolsasDetalle[ idMedicionBolsasDetalle=" + idMedicionBolsasDetalle + " ]";
    }
    
}
