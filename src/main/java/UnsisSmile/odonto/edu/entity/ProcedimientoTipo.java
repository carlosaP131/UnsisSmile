/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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



/**
 *
 * @author froste
 */
//@Entity
//@Table(name = "procedimiento_tipo")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "ProcedimientoTipo.findAll", query = "SELECT p FROM ProcedimientoTipo p"),
//    @NamedQuery(name = "ProcedimientoTipo.findByIdProcedimientoTipo", query = "SELECT p FROM ProcedimientoTipo p WHERE p.idProcedimientoTipo = :idProcedimientoTipo"),
//    @NamedQuery(name = "ProcedimientoTipo.findByProcedimiento", query = "SELECT p FROM ProcedimientoTipo p WHERE p.procedimiento = :procedimiento")})
public class ProcedimientoTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Basic(optional = false)
    @jakarta.persistence.Column(name = "id_procedimiento_tipo")
    private Integer idProcedimientoTipo;
    @jakarta.persistence.Column(name = "procedimiento")
    private String procedimiento;
//    @jakarta.persistence.OneToMany(cascade = jakarta.persistence.CascadeType.ALL, mappedBy = "fkIdProcedimientoRealizado")
//    private Collection<Consulta> consultaCollection;

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

//    @XmlTransient
//    public Collection<Consulta> getConsultaCollection() {
//        return consultaCollection;
//    }

//    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
//        this.consultaCollection = consultaCollection;
//    }

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
        return "com.unsis.odonto.edu.entity.ProcedimientoTipo[ idProcedimientoTipo=" + idProcedimientoTipo + " ]";
    }
    
}
