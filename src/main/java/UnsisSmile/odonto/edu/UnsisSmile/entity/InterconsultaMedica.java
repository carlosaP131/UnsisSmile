/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Interconsulta medica
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
@Table(name = "interconsulta_medica")

public class InterconsultaMedica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_interconsulta_medica")
    private Integer idInterconsultaMedica;
    @Column(name = "nombre_medico")
    private String nombreMedico;
    @Lob
    @Column(name = "razon")
    private String razon;
    @Lob
    @Column(name = "motivo_diagnostico_presuntivo")
    private String motivoDiagnosticoPresuntivo;
    @Lob
    @Column(name = "motivo_de_envio")
    private String motivoDeEnvio;
    @Lob
    @Column(name = "servicio_al_que_se_envia")
    private String servicioAlQueSeEnvia;
    @OneToMany(mappedBy = "interconsultaMedica", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public InterconsultaMedica() {
    }

    public InterconsultaMedica(Integer idInterconsultaMedica) {
        this.idInterconsultaMedica = idInterconsultaMedica;
    }

    public Integer getIdInterconsultaMedica() {
        return idInterconsultaMedica;
    }

    public void setIdInterconsultaMedica(Integer idInterconsultaMedica) {
        this.idInterconsultaMedica = idInterconsultaMedica;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getMotivoDiagnosticoPresuntivo() {
        return motivoDiagnosticoPresuntivo;
    }

    public void setMotivoDiagnosticoPresuntivo(String motivoDiagnosticoPresuntivo) {
        this.motivoDiagnosticoPresuntivo = motivoDiagnosticoPresuntivo;
    }

    public String getMotivoDeEnvio() {
        return motivoDeEnvio;
    }

    public void setMotivoDeEnvio(String motivoDeEnvio) {
        this.motivoDeEnvio = motivoDeEnvio;
    }

    public String getServicioAlQueSeEnvia() {
        return servicioAlQueSeEnvia;
    }

    public void setServicioAlQueSeEnvia(String servicioAlQueSeEnvia) {
        this.servicioAlQueSeEnvia = servicioAlQueSeEnvia;
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
        hash += (idInterconsultaMedica != null ? idInterconsultaMedica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InterconsultaMedica)) {
            return false;
        }
        InterconsultaMedica other = (InterconsultaMedica) object;
        if ((this.idInterconsultaMedica == null && other.idInterconsultaMedica != null) || (this.idInterconsultaMedica != null && !this.idInterconsultaMedica.equals(other.idInterconsultaMedica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.InterconsultaMedica[ idInterconsultaMedica=" + idInterconsultaMedica + " ]";
    }
    
}
