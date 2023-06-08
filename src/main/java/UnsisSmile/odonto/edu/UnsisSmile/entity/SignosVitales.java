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
@Table(name = "signos_vitales")
//@NamedQueries({
//    @NamedQuery(name = "SignosVitales.findAll", query = "SELECT s FROM SignosVitales s")})
public class SignosVitales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_signos_vitales")
    private Integer idSignosVitales;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "peso")
    private Double peso;
    @Column(name = "estatura")
    private Double estatura;
    @Column(name = "temperatura")
    private Double temperatura;
    @Column(name = "frecuencia_cardiaca")
    private Double frecuenciaCardiaca;
    @Column(name = "frecuencia_respiratoria")
    private Double frecuenciaRespiratoria;
    @Column(name = "pesion_arterial")
    private Double pesionArterial;
    @Column(name = "saturacion_oxigeno")
    private Double saturacionOxigeno;
    @Column(name = "glucosa")
    private Double glucosa;
    @Column(name = "pulso")
    private Double pulso;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "signosVitales", fetch = FetchType.LAZY)
//    private List<Consulta> consultaList;
    @OneToMany(mappedBy = "signosVitales", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public SignosVitales() {
    }

    public SignosVitales(Integer idSignosVitales) {
        this.idSignosVitales = idSignosVitales;
    }

    public Integer getIdSignosVitales() {
        return idSignosVitales;
    }

    public void setIdSignosVitales(Integer idSignosVitales) {
        this.idSignosVitales = idSignosVitales;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(Double frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public Double getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(Double frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public Double getPesionArterial() {
        return pesionArterial;
    }

    public void setPesionArterial(Double pesionArterial) {
        this.pesionArterial = pesionArterial;
    }

    public Double getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(Double saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public Double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(Double glucosa) {
        this.glucosa = glucosa;
    }

    public Double getPulso() {
        return pulso;
    }

    public void setPulso(Double pulso) {
        this.pulso = pulso;
    }

//    public List<Consulta> getConsultaList() {
//        return consultaList;
//    }
//
//    public void setConsultaList(List<Consulta> consultaList) {
//        this.consultaList = consultaList;
//    }

    public List<HistoriaClinicaGeneral> getHistoriaClinicaGeneralList() {
        return historiaClinicaGeneralList;
    }

    public void setHistoriaClinicaGeneralList(List<HistoriaClinicaGeneral> historiaClinicaGeneralList) {
        this.historiaClinicaGeneralList = historiaClinicaGeneralList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSignosVitales != null ? idSignosVitales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SignosVitales)) {
            return false;
        }
        SignosVitales other = (SignosVitales) object;
        if ((this.idSignosVitales == null && other.idSignosVitales != null) || (this.idSignosVitales != null && !this.idSignosVitales.equals(other.idSignosVitales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SignosVitales[ idSignosVitales=" + idSignosVitales + " ]";
    }
    
}
