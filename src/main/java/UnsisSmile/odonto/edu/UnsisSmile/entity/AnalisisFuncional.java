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
@Table(name = "analisis_funcional")

public class AnalisisFuncional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_analisis_funcional")
    private Integer idAnalisisFuncional;
    @Lob
    @Column(name = "Deglucion")
    private String deglucion;
    @Lob
    @Column(name = "Fonacion_masticacion")
    private String fonacionmasticacion;
    @Lob
    @Column(name = "Respiracion")
    private String respiracion;
    @Lob
    @Column(name = "Observaciones")
    private String observaciones;
    @OneToMany(mappedBy = "analisisFuncional", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public AnalisisFuncional() {
    }

    public AnalisisFuncional(Integer idAnalisisFuncional) {
        this.idAnalisisFuncional = idAnalisisFuncional;
    }

    public Integer getIdAnalisisFuncional() {
        return idAnalisisFuncional;
    }

    public void setIdAnalisisFuncional(Integer idAnalisisFuncional) {
        this.idAnalisisFuncional = idAnalisisFuncional;
    }

    public String getDeglucion() {
        return deglucion;
    }

    public void setDeglucion(String deglucion) {
        this.deglucion = deglucion;
    }

    public String getFonacionmasticacion() {
        return fonacionmasticacion;
    }

    public void setFonacionmasticacion(String fonacionmasticacion) {
        this.fonacionmasticacion = fonacionmasticacion;
    }

    public String getRespiracion() {
        return respiracion;
    }

    public void setRespiracion(String respiracion) {
        this.respiracion = respiracion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        hash += (idAnalisisFuncional != null ? idAnalisisFuncional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnalisisFuncional)) {
            return false;
        }
        AnalisisFuncional other = (AnalisisFuncional) object;
        if ((this.idAnalisisFuncional == null && other.idAnalisisFuncional != null) || (this.idAnalisisFuncional != null && !this.idAnalisisFuncional.equals(other.idAnalisisFuncional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.AnalisisFuncional[ idAnalisisFuncional=" + idAnalisisFuncional + " ]";
    }
    
}
