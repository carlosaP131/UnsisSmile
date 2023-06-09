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
@Table(name = "EXPLORACIoN_DE_LA_CAVIDAD_BUCAL_Y_ANEXOS")
public class EXPLORACIoNDELACAVIDADBUCALYANEXOS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_EXPLORACIoN_DE_LA_CAVIDAD_BUCAL_Y_ANEXOS")
    private Integer idEXPLORACIoNDELACAVIDADBUCALYANEXOS;
    @Lob
    @Column(name = "Tejidos_Blandos")
    private String tejidosBlandos;
    @Lob
    @Column(name = "Tejidos_oseos")
    private String tejidososeos;
    @Lob
    @Column(name = "Articulacion_Temporomandibular")
    private String articulacionTemporomandibular;
    @Lob
    @Column(name = "Diagnostico")
    private String diagnostico;
    @Lob
    @Column(name = "Estudio_de_Laboratorio_y_Gabinete")
    private String estudiodeLaboratorioyGabinete;
    @Lob
    @Column(name = "Indicaciones_de_interconsulta_Medica_u_Odontologica")
    private String indicacionesdeinterconsultaMedicauOdontologica;

    public EXPLORACIoNDELACAVIDADBUCALYANEXOS() {
    }

    public EXPLORACIoNDELACAVIDADBUCALYANEXOS(Integer idEXPLORACIoNDELACAVIDADBUCALYANEXOS) {
        this.idEXPLORACIoNDELACAVIDADBUCALYANEXOS = idEXPLORACIoNDELACAVIDADBUCALYANEXOS;
    }

    public Integer getIdEXPLORACIoNDELACAVIDADBUCALYANEXOS() {
        return idEXPLORACIoNDELACAVIDADBUCALYANEXOS;
    }

    public void setIdEXPLORACIoNDELACAVIDADBUCALYANEXOS(Integer idEXPLORACIoNDELACAVIDADBUCALYANEXOS) {
        this.idEXPLORACIoNDELACAVIDADBUCALYANEXOS = idEXPLORACIoNDELACAVIDADBUCALYANEXOS;
    }

    public String getTejidosBlandos() {
        return tejidosBlandos;
    }

    public void setTejidosBlandos(String tejidosBlandos) {
        this.tejidosBlandos = tejidosBlandos;
    }

    public String getTejidososeos() {
        return tejidososeos;
    }

    public void setTejidososeos(String tejidososeos) {
        this.tejidososeos = tejidososeos;
    }

    public String getArticulacionTemporomandibular() {
        return articulacionTemporomandibular;
    }

    public void setArticulacionTemporomandibular(String articulacionTemporomandibular) {
        this.articulacionTemporomandibular = articulacionTemporomandibular;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getEstudiodeLaboratorioyGabinete() {
        return estudiodeLaboratorioyGabinete;
    }

    public void setEstudiodeLaboratorioyGabinete(String estudiodeLaboratorioyGabinete) {
        this.estudiodeLaboratorioyGabinete = estudiodeLaboratorioyGabinete;
    }

    public String getIndicacionesdeinterconsultaMedicauOdontologica() {
        return indicacionesdeinterconsultaMedicauOdontologica;
    }

    public void setIndicacionesdeinterconsultaMedicauOdontologica(String indicacionesdeinterconsultaMedicauOdontologica) {
        this.indicacionesdeinterconsultaMedicauOdontologica = indicacionesdeinterconsultaMedicauOdontologica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEXPLORACIoNDELACAVIDADBUCALYANEXOS != null ? idEXPLORACIoNDELACAVIDADBUCALYANEXOS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EXPLORACIoNDELACAVIDADBUCALYANEXOS)) {
            return false;
        }
        EXPLORACIoNDELACAVIDADBUCALYANEXOS other = (EXPLORACIoNDELACAVIDADBUCALYANEXOS) object;
        if ((this.idEXPLORACIoNDELACAVIDADBUCALYANEXOS == null && other.idEXPLORACIoNDELACAVIDADBUCALYANEXOS != null) || (this.idEXPLORACIoNDELACAVIDADBUCALYANEXOS != null && !this.idEXPLORACIoNDELACAVIDADBUCALYANEXOS.equals(other.idEXPLORACIoNDELACAVIDADBUCALYANEXOS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.EXPLORACIoNDELACAVIDADBUCALYANEXOS[ idEXPLORACIoNDELACAVIDADBUCALYANEXOS=" + idEXPLORACIoNDELACAVIDADBUCALYANEXOS + " ]";
    }
    
}
