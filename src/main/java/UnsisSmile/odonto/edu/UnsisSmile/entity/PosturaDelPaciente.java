/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Postura del Paciente
 */
package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;  
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "postura_del_paciente")
public class PosturaDelPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_postura_del_paciente")
    private Integer idPosturaDelPaciente;
    @Lob
    @Column(name = "atm_palpacion")
    private String atmPalpacion;
    @OneToMany(mappedBy = "posturaDelPaciente", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public PosturaDelPaciente() {
    }

    public PosturaDelPaciente(Integer idPosturaDelPaciente) {
        this.idPosturaDelPaciente = idPosturaDelPaciente;
    }

    public Integer getIdPosturaDelPaciente() {
        return idPosturaDelPaciente;
    }

    public void setIdPosturaDelPaciente(Integer idPosturaDelPaciente) {
        this.idPosturaDelPaciente = idPosturaDelPaciente;
    }

    public String getAtmPalpacion() {
        return atmPalpacion;
    }

    public void setAtmPalpacion(String atmPalpacion) {
        this.atmPalpacion = atmPalpacion;
    }

    public List<HistoriaClinicaGeneral> getHistoriaClinicaGeneralList() {
        return historiaClinicaGeneralList;
    }

    public void setHistoriaClinicaGeneralList(List<HistoriaClinicaGeneral> historiaClinicaGeneralList) {
        this.historiaClinicaGeneralList = historiaClinicaGeneralList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPosturaDelPaciente != null ? idPosturaDelPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosturaDelPaciente)) {
            return false;
        }
        PosturaDelPaciente other = (PosturaDelPaciente) object;
        if ((this.idPosturaDelPaciente == null && other.idPosturaDelPaciente != null) || (this.idPosturaDelPaciente != null && !this.idPosturaDelPaciente.equals(other.idPosturaDelPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.PosturaDelPaciente[ idPosturaDelPaciente=" + idPosturaDelPaciente + " ]";
    }
    
}
