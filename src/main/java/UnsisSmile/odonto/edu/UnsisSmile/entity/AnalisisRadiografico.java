/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Analisis radiografico
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

/**
 *
 * @author labingsw05
 */
@Entity
@Table(name = "analisis_radiografico")

public class AnalisisRadiografico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_analisis_radiografico")
    private Integer idAnalisisRadiografico;
    @Lob
    @Column(name = "Periapical")
    private String periapical;
    @Lob
    @Column(name = "cefalica_lateral")
    private String cefalicaLateral;
    @Lob
    @Column(name = "Panoramica")
    private String panoramica;
    @OneToMany(mappedBy = "analisisRadiografico", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public AnalisisRadiografico() {
    }

    public AnalisisRadiografico(Integer idAnalisisRadiografico) {
        this.idAnalisisRadiografico = idAnalisisRadiografico;
    }

    public Integer getIdAnalisisRadiografico() {
        return idAnalisisRadiografico;
    }

    public void setIdAnalisisRadiografico(Integer idAnalisisRadiografico) {
        this.idAnalisisRadiografico = idAnalisisRadiografico;
    }

    public String getPeriapical() {
        return periapical;
    }

    public void setPeriapical(String periapical) {
        this.periapical = periapical;
    }

    public String getCefalicaLateral() {
        return cefalicaLateral;
    }

    public void setCefalicaLateral(String cefalicaLateral) {
        this.cefalicaLateral = cefalicaLateral;
    }

    public String getPanoramica() {
        return panoramica;
    }

    public void setPanoramica(String panoramica) {
        this.panoramica = panoramica;
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
        hash += (idAnalisisRadiografico != null ? idAnalisisRadiografico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnalisisRadiografico)) {
            return false;
        }
        AnalisisRadiografico other = (AnalisisRadiografico) object;
        if ((this.idAnalisisRadiografico == null && other.idAnalisisRadiografico != null) || (this.idAnalisisRadiografico != null && !this.idAnalisisRadiografico.equals(other.idAnalisisRadiografico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.AnalisisRadiografico[ idAnalisisRadiografico=" + idAnalisisRadiografico + " ]";
    }
    
}
