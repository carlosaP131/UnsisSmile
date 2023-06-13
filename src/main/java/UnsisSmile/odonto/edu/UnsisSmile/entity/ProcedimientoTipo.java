/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Procedimiento tipo
 */
package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;  
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "procedimiento_tipo")

public class ProcedimientoTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_procedimiento_tipo")
    private Integer idProcedimientoTipo;
    @Column(name = "procedimiento")
    private String procedimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "procedimientoTipo", fetch = FetchType.LAZY)
    private List<Consulta> consultaList;

    public ProcedimientoTipo() {
    }

    public ProcedimientoTipo(Integer idProcedimientoTipo) {
        this.idProcedimientoTipo = idProcedimientoTipo;
    }

    public Integer getIdProcedimientoTipo() {
        return idProcedimientoTipo;
    }

    public void setIdProcedimientoTipo(Integer idProcedimientoTipo) {
        this.idProcedimientoTipo = idProcedimientoTipo;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public List<Consulta> getConsultaList() {
        return consultaList;
    }

    public void setConsultaList(List<Consulta> consultaList) {
        this.consultaList = consultaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedimientoTipo != null ? idProcedimientoTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientoTipo)) {
            return false;
        }
        ProcedimientoTipo other = (ProcedimientoTipo) object;
        if ((this.idProcedimientoTipo == null && other.idProcedimientoTipo != null) || (this.idProcedimientoTipo != null && !this.idProcedimientoTipo.equals(other.idProcedimientoTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.ProcedimientoTipo[ idProcedimientoTipo=" + idProcedimientoTipo + " ]";
    }
    
}
