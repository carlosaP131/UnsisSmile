/** ****************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 7-06-2023 ***
 *Fecha de actualización:8-06-2023
 *Descripción: Entity de analisis funcional
 **
 * ****************************************************************************/
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
//@NamedQueries({
//    @NamedQuery(name = "AnalisisFuncional.findAll", query = "SELECT a FROM AnalisisFuncional a")})
public class AnalisisFuncional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_analisis_funcional")
    private Integer idAnalisisFuncional;
    @Lob
    @Column(name = "Degluci\u00f3n")
    private String deglución;
    @Lob
    @Column(name = "Fonaci\u00f3n_masticaci\u00f3n")
    private String fonaciónmasticación;
    @Lob
    @Column(name = "Respiraci\u00f3n")
    private String respiración;
    @Lob
    @Column(name = "Observaciones")
    private String observaciones;
 //   @OneToMany(mappedBy = "analisisFuncional", fetch = FetchType.LAZY)
  //  private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

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

    public String getDeglución() {
        return deglución;
    }

    public void setDeglución(String deglución) {
        this.deglución = deglución;
    }

    public String getFonaciónmasticación() {
        return fonaciónmasticación;
    }

    public void setFonaciónmasticación(String fonaciónmasticación) {
        this.fonaciónmasticación = fonaciónmasticación;
    }

    public String getRespiración() {
        return respiración;
    }

    public void setRespiración(String respiración) {
        this.respiración = respiración;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

//    public List<HistoriaClinicaGeneral> getHistoriaClinicaGeneralList() {
//        return historiaClinicaGeneralList;
//    }
//
//    public void setHistoriaClinicaGeneralList(List<HistoriaClinicaGeneral> historiaClinicaGeneralList) {
//        this.historiaClinicaGeneralList = historiaClinicaGeneralList;
//    }

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
        return "entity.AnalisisFuncional[ idAnalisisFuncional=" + idAnalisisFuncional + " ]";
    }
    
}
