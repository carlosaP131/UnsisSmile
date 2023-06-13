/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Antecedentes patologicos
 */

package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;   
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

/**
 *
 * @author labingsw05
 */
@Entity
@Table(name = "Antecedentes_Patologicos")
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
    @Column(name = "Cancer")
    private Boolean cancer;
    @Column(name = "Dependencia_de_Drogas_o_Narcoticos")
    private Boolean dependenciadeDrogasoNarcoticos;
    @Column(name = "Diabetes")
    private Boolean diabetes;
    @Column(name = "Enfermedades_Venereas")
    private Boolean enfermedadesVenereas;
    @Column(name = "Epilepsia")
    private Boolean epilepsia;
    @Column(name = "Trastorno_del_Rinion_o_Higado")
    private Boolean trastornodelRinionoHigado;
    @Column(name = "SIDA")
    private Boolean sida;
    @Column(name = "Lesiones_en_cabeza_o_cuello")
    private Boolean lesionesencabezaocuello;
    @Column(name = "Migrania")
    private Boolean migrania;
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
    @Column(name = "Ulceras_del_Estomago")
    private Boolean ulcerasdelEstomago;
    @Column(name = "Fiebre_Reumatica")
    private Boolean fiebreReumatica;
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

    public Boolean getCancer() {
        return cancer;
    }

    public void setCancer(Boolean cancer) {
        this.cancer = cancer;
    }

    public Boolean getDependenciadeDrogasoNarcoticos() {
        return dependenciadeDrogasoNarcoticos;
    }

    public void setDependenciadeDrogasoNarcoticos(Boolean dependenciadeDrogasoNarcoticos) {
        this.dependenciadeDrogasoNarcoticos = dependenciadeDrogasoNarcoticos;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getEnfermedadesVenereas() {
        return enfermedadesVenereas;
    }

    public void setEnfermedadesVenereas(Boolean enfermedadesVenereas) {
        this.enfermedadesVenereas = enfermedadesVenereas;
    }

    public Boolean getEpilepsia() {
        return epilepsia;
    }

    public void setEpilepsia(Boolean epilepsia) {
        this.epilepsia = epilepsia;
    }

    public Boolean getTrastornodelRinionoHigado() {
        return trastornodelRinionoHigado;
    }

    public void setTrastornodelRinionoHigado(Boolean trastornodelRinionoHigado) {
        this.trastornodelRinionoHigado = trastornodelRinionoHigado;
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

    public Boolean getMigrania() {
        return migrania;
    }

    public void setMigrania(Boolean migrania) {
        this.migrania = migrania;
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

    public Boolean getUlcerasdelEstomago() {
        return ulcerasdelEstomago;
    }

    public void setUlcerasdelEstomago(Boolean ulcerasdelEstomago) {
        this.ulcerasdelEstomago = ulcerasdelEstomago;
    }

    public Boolean getFiebreReumatica() {
        return fiebreReumatica;
    }

    public void setFiebreReumatica(Boolean fiebreReumatica) {
        this.fiebreReumatica = fiebreReumatica;
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
        return "com.unsis.odonto.edu.entity.base.AntecedentesPatologicos[ idAntecedentesPatologicos=" + idAntecedentesPatologicos + " ]";
    }
    
}
