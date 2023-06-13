/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Estudio de laboratorio biopsia
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
@Table(name = "estudio_de_laboratorio_biopsia")

public class EstudioDeLaboratorioBiopsia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estudio_de_laboratorio_biopsia")
    private Integer idEstudioDeLaboratorioBiopsia;
    @Lob
    @Column(name = "tipo_de_estudio")
    private String tipoDeEstudio;
    @Lob
    @Column(name = "tipo_de_biopsia")
    private String tipoDeBiopsia;
    @Lob
    @Column(name = "region_donde_se_realizo_biopsia")
    private String regionDondeSeRealizoBiopsia;
    @Lob
    @Column(name = "laboratorio_donde_se_envia_el_estudio")
    private String laboratorioDondeSeEnviaElEstudio;
    @OneToMany(mappedBy = "estudioDeLaboratorioBiopsia", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public EstudioDeLaboratorioBiopsia() {
    }

    public EstudioDeLaboratorioBiopsia(Integer idEstudioDeLaboratorioBiopsia) {
        this.idEstudioDeLaboratorioBiopsia = idEstudioDeLaboratorioBiopsia;
    }

    public Integer getIdEstudioDeLaboratorioBiopsia() {
        return idEstudioDeLaboratorioBiopsia;
    }

    public void setIdEstudioDeLaboratorioBiopsia(Integer idEstudioDeLaboratorioBiopsia) {
        this.idEstudioDeLaboratorioBiopsia = idEstudioDeLaboratorioBiopsia;
    }

    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    public String getTipoDeBiopsia() {
        return tipoDeBiopsia;
    }

    public void setTipoDeBiopsia(String tipoDeBiopsia) {
        this.tipoDeBiopsia = tipoDeBiopsia;
    }

    public String getRegionDondeSeRealizoBiopsia() {
        return regionDondeSeRealizoBiopsia;
    }

    public void setRegionDondeSeRealizoBiopsia(String regionDondeSeRealizoBiopsia) {
        this.regionDondeSeRealizoBiopsia = regionDondeSeRealizoBiopsia;
    }

    public String getLaboratorioDondeSeEnviaElEstudio() {
        return laboratorioDondeSeEnviaElEstudio;
    }

    public void setLaboratorioDondeSeEnviaElEstudio(String laboratorioDondeSeEnviaElEstudio) {
        this.laboratorioDondeSeEnviaElEstudio = laboratorioDondeSeEnviaElEstudio;
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
        hash += (idEstudioDeLaboratorioBiopsia != null ? idEstudioDeLaboratorioBiopsia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstudioDeLaboratorioBiopsia)) {
            return false;
        }
        EstudioDeLaboratorioBiopsia other = (EstudioDeLaboratorioBiopsia) object;
        if ((this.idEstudioDeLaboratorioBiopsia == null && other.idEstudioDeLaboratorioBiopsia != null) || (this.idEstudioDeLaboratorioBiopsia != null && !this.idEstudioDeLaboratorioBiopsia.equals(other.idEstudioDeLaboratorioBiopsia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.EstudioDeLaboratorioBiopsia[ idEstudioDeLaboratorioBiopsia=" + idEstudioDeLaboratorioBiopsia + " ]";
    }
    
}
