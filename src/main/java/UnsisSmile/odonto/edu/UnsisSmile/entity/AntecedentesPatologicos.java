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
@Table(name = "Antecedentes_Patologicos")
//@NamedQueries({
//    @NamedQuery(name = "AntecedentesPatologicos.findAll", query = "SELECT a FROM AntecedentesPatologicos a")})
public class AntecedentesPatologicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_Antecedentes_Patologicos")
    private Integer idAntecedentesPatologicos;
    @Column(name = "Alcoholismo")
    private Boolean alcoholismo;
    @Column(name = "Alergias")
    private Boolean alergias;
    @Column(name = "Anemias")
    private Boolean anemias;
    @Column(name = "Artritis")
    private Boolean artritis;
    @Column(name = "Asma")
    private Boolean asma;
    @Column(name = "C\u00e1ncer")
    private Boolean cáncer;
    @Column(name = "Dependencia_de_Drogas_o_Narc\u00f3ticos")
    private Boolean dependenciadeDrogasoNarcóticos;
    @Column(name = "Diabetes")
    private Boolean diabetes;
    @Column(name = "Enfermedades_Ven\u00e9reas")
    private Boolean enfermedadesVenéreas;
    @Column(name = "Epilepsia")
    private Boolean epilepsia;
    @Column(name = "Trastorno_del_Ri\u00f1\u00f3n_o_H\u00edgado")
    private Boolean trastornodelRiñónoHígado;
    @Column(name = "SIDA")
    private Boolean sida;
    @Column(name = "Lesiones_en_cabeza_o_cuello")
    private Boolean lesionesencabezaocuello;
    @Column(name = "Migra\u00f1a")
    private Boolean migraña;
    @Column(name = "Problemas_Cardiacos")
    private Boolean problemasCardiacos;
    @Column(name = "Sinusitis")
    private Boolean sinusitis;
    @Column(name = "Trastornos_Metales")
    private Boolean trastornosMetales;
    @Column(name = "Trastornos_Respiratorios")
    private Boolean trastornosRespiratorios;
    @Column(name = "Tuberculosis")
    private Boolean tuberculosis;
    @Column(name = "Ulceras_del_Est\u00f3mago")
    private Boolean ulcerasdelEstómago;
    @Column(name = "Fiebre_Reum\u00e1tica")
    private Boolean fiebreReumática;
    @Lob
    @Column(name = "otras")
    private String otras;

    public AntecedentesPatologicos() {
    }

    public AntecedentesPatologicos(Integer idAntecedentesPatologicos) {
        this.idAntecedentesPatologicos = idAntecedentesPatologicos;
    }

    public Integer getIdAntecedentesPatologicos() {
        return idAntecedentesPatologicos;
    }

    public void setIdAntecedentesPatologicos(Integer idAntecedentesPatologicos) {
        this.idAntecedentesPatologicos = idAntecedentesPatologicos;
    }

    public Boolean getAlcoholismo() {
        return alcoholismo;
    }

    public void setAlcoholismo(Boolean alcoholismo) {
        this.alcoholismo = alcoholismo;
    }

    public Boolean getAlergias() {
        return alergias;
    }

    public void setAlergias(Boolean alergias) {
        this.alergias = alergias;
    }

    public Boolean getAnemias() {
        return anemias;
    }

    public void setAnemias(Boolean anemias) {
        this.anemias = anemias;
    }

    public Boolean getArtritis() {
        return artritis;
    }

    public void setArtritis(Boolean artritis) {
        this.artritis = artritis;
    }

    public Boolean getAsma() {
        return asma;
    }

    public void setAsma(Boolean asma) {
        this.asma = asma;
    }

    public Boolean getCáncer() {
        return cáncer;
    }

    public void setCáncer(Boolean cáncer) {
        this.cáncer = cáncer;
    }

    public Boolean getDependenciadeDrogasoNarcóticos() {
        return dependenciadeDrogasoNarcóticos;
    }

    public void setDependenciadeDrogasoNarcóticos(Boolean dependenciadeDrogasoNarcóticos) {
        this.dependenciadeDrogasoNarcóticos = dependenciadeDrogasoNarcóticos;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getEnfermedadesVenéreas() {
        return enfermedadesVenéreas;
    }

    public void setEnfermedadesVenéreas(Boolean enfermedadesVenéreas) {
        this.enfermedadesVenéreas = enfermedadesVenéreas;
    }

    public Boolean getEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(Boolean epilepsia) {
        this.epilepsia = epilepsia;
    }

    public Boolean getTrastornodelRiñónoHígado() {
        return trastornodelRiñónoHígado;
    }

    public void setTrastornodelRiñónoHígado(Boolean trastornodelRiñónoHígado) {
        this.trastornodelRiñónoHígado = trastornodelRiñónoHígado;
    }

    public Boolean getSida() {
        return sida;
    }

    public void setSida(Boolean sida) {
        this.sida = sida;
    }

    public Boolean getLesionesencabezaocuello() {
        return lesionesencabezaocuello;
    }

    public void setLesionesencabezaocuello(Boolean lesionesencabezaocuello) {
        this.lesionesencabezaocuello = lesionesencabezaocuello;
    }

    public Boolean getMigraña() {
        return migraña;
    }

    public void setMigraña(Boolean migraña) {
        this.migraña = migraña;
    }

    public Boolean getProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(Boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public Boolean getSinusitis() {
        return sinusitis;
    }

    public void setSinusitis(Boolean sinusitis) {
        this.sinusitis = sinusitis;
    }

    public Boolean getTrastornosMetales() {
        return trastornosMetales;
    }

    public void setTrastornosMetales(Boolean trastornosMetales) {
        this.trastornosMetales = trastornosMetales;
    }

    public Boolean getTrastornosRespiratorios() {
        return trastornosRespiratorios;
    }

    public void setTrastornosRespiratorios(Boolean trastornosRespiratorios) {
        this.trastornosRespiratorios = trastornosRespiratorios;
    }

    public Boolean getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(Boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public Boolean getUlcerasdelEstómago() {
        return ulcerasdelEstómago;
    }

    public void setUlcerasdelEstómago(Boolean ulcerasdelEstómago) {
        this.ulcerasdelEstómago = ulcerasdelEstómago;
    }

    public Boolean getFiebreReumática() {
        return fiebreReumática;
    }

    public void setFiebreReumática(Boolean fiebreReumática) {
        this.fiebreReumática = fiebreReumática;
    }

    public String getOtras() {
        return otras;
    }

    public void setOtras(String otras) {
        this.otras = otras;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAntecedentesPatologicos != null ? idAntecedentesPatologicos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesPatologicos)) {
            return false;
        }
        AntecedentesPatologicos other = (AntecedentesPatologicos) object;
        if ((this.idAntecedentesPatologicos == null && other.idAntecedentesPatologicos != null) || (this.idAntecedentesPatologicos != null && !this.idAntecedentesPatologicos.equals(other.idAntecedentesPatologicos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AntecedentesPatologicos[ idAntecedentesPatologicos=" + idAntecedentesPatologicos + " ]";
    }
    
}
