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
@Table(name = "movimientosUsuarios")

public class MovimientosUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_movimientos")
    private Integer idMovimientos;
    @Column(name = "entidad")
    private String entidad;
    @Column(name = "id_entidad")
    private Integer idEntidad;
    @Column(name = "fecha_de_realizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeRealizacion;
    @Column(name = "tipo_movimiento")
    private Character tipoMovimiento;

    public MovimientosUsuarios() {
    }

    public MovimientosUsuarios(Integer idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public Integer getIdMovimientos() {
        return idMovimientos;
    }

    public void setIdMovimientos(Integer idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Integer getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }

    public Date getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(Date fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public Character getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(Character tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimientos != null ? idMovimientos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovimientosUsuarios)) {
            return false;
        }
        MovimientosUsuarios other = (MovimientosUsuarios) object;
        if ((this.idMovimientos == null && other.idMovimientos != null) || (this.idMovimientos != null && !this.idMovimientos.equals(other.idMovimientos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.MovimientosUsuarios[ idMovimientos=" + idMovimientos + " ]";
    }
    
}
