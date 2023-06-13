/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Diente detalle
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
@Table(name = "diente_detalle")

public class DienteDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_diente_detalle")
    private Integer idDienteDetalle;
    @JoinColumn(name = "fk_id_codigo_pieza_dental", referencedColumnName = "id_codigo_pieza_dental")
    @ManyToOne(fetch = FetchType.LAZY)
    private CodigoPiezaDental codigoPiezaDental;
    @JoinColumn(name = "fk_id_estado_diente", referencedColumnName = "id_estado_diente")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoDiente estadoDiente;
    @JoinColumn(name = "fk_id_odontograma", referencedColumnName = "id_odontograma")
    @ManyToOne(fetch = FetchType.LAZY)
    private Odontograma odontograma;
    @JoinColumn(name = "fk_id_region_diente", referencedColumnName = "id_region")
    @ManyToOne(fetch = FetchType.LAZY)
    private RegionDiente regionDiente;

    public DienteDetalle() {
    }

    public DienteDetalle(Integer idDienteDetalle) {
        this.idDienteDetalle = idDienteDetalle;
    }

    public Integer getIdDienteDetalle() {
        return idDienteDetalle;
    }

    public void setIdDienteDetalle(Integer idDienteDetalle) {
        this.idDienteDetalle = idDienteDetalle;
    }

    public CodigoPiezaDental getCodigoPiezaDental() {
        return codigoPiezaDental;
    }

    public void setCodigoPiezaDental(CodigoPiezaDental codigoPiezaDental) {
        this.codigoPiezaDental = codigoPiezaDental;
    }

    public EstadoDiente getEstadoDiente() {
        return estadoDiente;
    }

    public void setEstadoDiente(EstadoDiente estadoDiente) {
        this.estadoDiente = estadoDiente;
    }

    public Odontograma getOdontograma() {
        return odontograma;
    }

    public void setOdontograma(Odontograma odontograma) {
        this.odontograma = odontograma;
    }

    public RegionDiente getRegionDiente() {
        return regionDiente;
    }

    public void setRegionDiente(RegionDiente regionDiente) {
        this.regionDiente = regionDiente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDienteDetalle != null ? idDienteDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DienteDetalle)) {
            return false;
        }
        DienteDetalle other = (DienteDetalle) object;
        if ((this.idDienteDetalle == null && other.idDienteDetalle != null) || (this.idDienteDetalle != null && !this.idDienteDetalle.equals(other.idDienteDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.DienteDetalle[ idDienteDetalle=" + idDienteDetalle + " ]";
    }
    
}
