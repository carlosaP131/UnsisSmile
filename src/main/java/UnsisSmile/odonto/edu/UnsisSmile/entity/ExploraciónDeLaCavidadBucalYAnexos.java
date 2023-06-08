/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UnsisSmile.odonto.edu.UnsisSmile.entity;

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
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/**
 *
 * @author froste
 */
@Entity
@Table(name = "EXPLORACI\u00d3N_DE_LA_CAVIDAD_BUCAL_Y_ANEXOS")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Exploraci\u00f3nDeLaCavidadBucalYAnexos.findAll", query = "SELECT e FROM Exploraci\u00f3nDeLaCavidadBucalYAnexos e"),
//    @NamedQuery(name = "Exploraci\u00f3nDeLaCavidadBucalYAnexos.findByIdEXPLORACI\u00d3NDELACAVIDADBUCALYANEXOS", query = "SELECT e FROM Exploraci\u00f3nDeLaCavidadBucalYAnexos e WHERE e.idEXPLORACI\u00d3NDELACAVIDADBUCALYANEXOS = :idEXPLORACI\u00d3NDELACAVIDADBUCALYANEXOS")})
public class ExploraciónDeLaCavidadBucalYAnexos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_EXPLORACI\u00d3N_DE_LA_CAVIDAD_BUCAL_Y_ANEXOS")
    private Integer idEXPLORACIÓNDELACAVIDADBUCALYANEXOS;
    @Lob
    @Column(name = "Tejidos_Blandos")
    private String tejidosBlandos;
    @Lob
    @Column(name = "Tejidos_\u00d3seos")
    private String tejidosÓseos;
    @Lob
    @Column(name = "Articulaci\u00f3n_Temporomandibular")
    private String articulaciónTemporomandibular;
    @Lob
    @Column(name = "Diagn\u00f3stico")
    private String diagnóstico;
    @Lob
    @Column(name = "Estudio_de_Laboratorio_y_Gabinete")
    private String estudiodeLaboratorioyGabinete;
    @Lob
    @Column(name = "Indicaciones_de_interconsulta_M\u00e9dica_u_Odontol\u00f3gica")
    private String indicacionesdeinterconsultaMédicauOdontológica;

    public ExploraciónDeLaCavidadBucalYAnexos() {
    }

    public ExploraciónDeLaCavidadBucalYAnexos(Integer idEXPLORACIÓNDELACAVIDADBUCALYANEXOS) {
        this.idEXPLORACIÓNDELACAVIDADBUCALYANEXOS = idEXPLORACIÓNDELACAVIDADBUCALYANEXOS;
    }

    public Integer getIdEXPLORACIÓNDELACAVIDADBUCALYANEXOS() {
        return idEXPLORACIÓNDELACAVIDADBUCALYANEXOS;
    }

    public void setIdEXPLORACIÓNDELACAVIDADBUCALYANEXOS(Integer idEXPLORACIÓNDELACAVIDADBUCALYANEXOS) {
        this.idEXPLORACIÓNDELACAVIDADBUCALYANEXOS = idEXPLORACIÓNDELACAVIDADBUCALYANEXOS;
    }

    public String getTejidosBlandos() {
        return tejidosBlandos;
    }

    public void setTejidosBlandos(String tejidosBlandos) {
        this.tejidosBlandos = tejidosBlandos;
    }

    public String getTejidosÓseos() {
        return tejidosÓseos;
    }

    public void setTejidosÓseos(String tejidosÓseos) {
        this.tejidosÓseos = tejidosÓseos;
    }

    public String getArticulaciónTemporomandibular() {
        return articulaciónTemporomandibular;
    }

    public void setArticulaciónTemporomandibular(String articulaciónTemporomandibular) {
        this.articulaciónTemporomandibular = articulaciónTemporomandibular;
    }

    public String getDiagnóstico() {
        return diagnóstico;
    }

    public void setDiagnóstico(String diagnóstico) {
        this.diagnóstico = diagnóstico;
    }

    public String getEstudiodeLaboratorioyGabinete() {
        return estudiodeLaboratorioyGabinete;
    }

    public void setEstudiodeLaboratorioyGabinete(String estudiodeLaboratorioyGabinete) {
        this.estudiodeLaboratorioyGabinete = estudiodeLaboratorioyGabinete;
    }

    public String getIndicacionesdeinterconsultaMédicauOdontológica() {
        return indicacionesdeinterconsultaMédicauOdontológica;
    }

    public void setIndicacionesdeinterconsultaMédicauOdontológica(String indicacionesdeinterconsultaMédicauOdontológica) {
        this.indicacionesdeinterconsultaMédicauOdontológica = indicacionesdeinterconsultaMédicauOdontológica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEXPLORACIÓNDELACAVIDADBUCALYANEXOS != null ? idEXPLORACIÓNDELACAVIDADBUCALYANEXOS.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExploraciónDeLaCavidadBucalYAnexos)) {
            return false;
        }
        ExploraciónDeLaCavidadBucalYAnexos other = (ExploraciónDeLaCavidadBucalYAnexos) object;
        if ((this.idEXPLORACIÓNDELACAVIDADBUCALYANEXOS == null && other.idEXPLORACIÓNDELACAVIDADBUCALYANEXOS != null) || (this.idEXPLORACIÓNDELACAVIDADBUCALYANEXOS != null && !this.idEXPLORACIÓNDELACAVIDADBUCALYANEXOS.equals(other.idEXPLORACIÓNDELACAVIDADBUCALYANEXOS))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.Exploraci\u00f3nDeLaCavidadBucalYAnexos[ idEXPLORACI\u00d3NDELACAVIDADBUCALYANEXOS=" + idEXPLORACIÓNDELACAVIDADBUCALYANEXOS + " ]";
    }
    
}
