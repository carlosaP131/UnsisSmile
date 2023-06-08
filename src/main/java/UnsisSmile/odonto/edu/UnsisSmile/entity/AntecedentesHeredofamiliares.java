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
@Table(name = "antecedentes_heredofamiliares")
//@NamedQueries({
//    @NamedQuery(name = "AntecedentesHeredofamiliares.findAll", query = "SELECT a FROM AntecedentesHeredofamiliares a")})
public class AntecedentesHeredofamiliares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_antecedentes_heredofamiliares")
    private Integer idAntecedentesHeredofamiliares;
    @Column(name = "Neoplacia")
    private Boolean neoplacia;
    @Lob
    @Column(name = "Neoplacia_rAmplia")
    private String neoplaciarAmplia;
    @Column(name = "diabetes")
    private Boolean diabetes;
    @Lob
    @Column(name = "diabetes_amplio")
    private String diabetesAmplio;
    @Column(name = "hipertencion")
    private Boolean hipertencion;
    @Lob
    @Column(name = "hipertencion_amplio")
    private String hipertencionAmplio;
    @Column(name = "padecimientos_mentales_neurologicos")
    private Boolean padecimientosMentalesNeurologicos;
    @Lob
    @Column(name = "padecimientos_mentales_neurologicos_amplio")
    private String padecimientosMentalesNeurologicosAmplio;
    @Column(name = "obecidad")
    private Boolean obecidad;
    @Lob
    @Column(name = "obecidad_amplio")
    private String obecidadAmplio;
    @Column(name = "padecimientos_hematologicos")
    private Boolean padecimientosHematologicos;
    @Lob
    @Column(name = "padecimientos_hematologicos_amplio")
    private String padecimientosHematologicosAmplio;
    @Column(name = "malformaciones_congenitas")
    private Boolean malformacionesCongenitas;
    @Lob
    @Column(name = "malformaciones_congenitas_amplio")
    private String malformacionesCongenitasAmplio;
    @Column(name = "problemas_cardiacos")
    private Boolean problemasCardiacos;
    @Lob
    @Column(name = "problemas_cardiacos_amplio")
    private String problemasCardiacosAmplio;
//    @OneToMany(mappedBy = "antecedentesHeredofamiliares", fetch = FetchType.LAZY)
//    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public AntecedentesHeredofamiliares() {
    }

    public AntecedentesHeredofamiliares(Integer idAntecedentesHeredofamiliares) {
        this.idAntecedentesHeredofamiliares = idAntecedentesHeredofamiliares;
    }

    public Integer getIdAntecedentesHeredofamiliares() {
        return idAntecedentesHeredofamiliares;
    }

    public void setIdAntecedentesHeredofamiliares(Integer idAntecedentesHeredofamiliares) {
        this.idAntecedentesHeredofamiliares = idAntecedentesHeredofamiliares;
    }

    public Boolean getNeoplacia() {
        return neoplacia;
    }

    public void setNeoplacia(Boolean neoplacia) {
        this.neoplacia = neoplacia;
    }

    public String getNeoplaciarAmplia() {
        return neoplaciarAmplia;
    }

    public void setNeoplaciarAmplia(String neoplaciarAmplia) {
        this.neoplaciarAmplia = neoplaciarAmplia;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public String getDiabetesAmplio() {
        return diabetesAmplio;
    }

    public void setDiabetesAmplio(String diabetesAmplio) {
        this.diabetesAmplio = diabetesAmplio;
    }

    public Boolean getHipertencion() {
        return hipertencion;
    }

    public void setHipertencion(Boolean hipertencion) {
        this.hipertencion = hipertencion;
    }

    public String getHipertencionAmplio() {
        return hipertencionAmplio;
    }

    public void setHipertencionAmplio(String hipertencionAmplio) {
        this.hipertencionAmplio = hipertencionAmplio;
    }

    public Boolean getPadecimientosMentalesNeurologicos() {
        return padecimientosMentalesNeurologicos;
    }

    public void setPadecimientosMentalesNeurologicos(Boolean padecimientosMentalesNeurologicos) {
        this.padecimientosMentalesNeurologicos = padecimientosMentalesNeurologicos;
    }

    public String getPadecimientosMentalesNeurologicosAmplio() {
        return padecimientosMentalesNeurologicosAmplio;
    }

    public void setPadecimientosMentalesNeurologicosAmplio(String padecimientosMentalesNeurologicosAmplio) {
        this.padecimientosMentalesNeurologicosAmplio = padecimientosMentalesNeurologicosAmplio;
    }

    public Boolean getObecidad() {
        return obecidad;
    }

    public void setObecidad(Boolean obecidad) {
        this.obecidad = obecidad;
    }

    public String getObecidadAmplio() {
        return obecidadAmplio;
    }

    public void setObecidadAmplio(String obecidadAmplio) {
        this.obecidadAmplio = obecidadAmplio;
    }

    public Boolean getPadecimientosHematologicos() {
        return padecimientosHematologicos;
    }

    public void setPadecimientosHematologicos(Boolean padecimientosHematologicos) {
        this.padecimientosHematologicos = padecimientosHematologicos;
    }

    public String getPadecimientosHematologicosAmplio() {
        return padecimientosHematologicosAmplio;
    }

    public void setPadecimientosHematologicosAmplio(String padecimientosHematologicosAmplio) {
        this.padecimientosHematologicosAmplio = padecimientosHematologicosAmplio;
    }

    public Boolean getMalformacionesCongenitas() {
        return malformacionesCongenitas;
    }

    public void setMalformacionesCongenitas(Boolean malformacionesCongenitas) {
        this.malformacionesCongenitas = malformacionesCongenitas;
    }

    public String getMalformacionesCongenitasAmplio() {
        return malformacionesCongenitasAmplio;
    }

    public void setMalformacionesCongenitasAmplio(String malformacionesCongenitasAmplio) {
        this.malformacionesCongenitasAmplio = malformacionesCongenitasAmplio;
    }

    public Boolean getProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(Boolean problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public String getProblemasCardiacosAmplio() {
        return problemasCardiacosAmplio;
    }

    public void setProblemasCardiacosAmplio(String problemasCardiacosAmplio) {
        this.problemasCardiacosAmplio = problemasCardiacosAmplio;
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
        hash += (idAntecedentesHeredofamiliares != null ? idAntecedentesHeredofamiliares.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesHeredofamiliares)) {
            return false;
        }
        AntecedentesHeredofamiliares other = (AntecedentesHeredofamiliares) object;
        if ((this.idAntecedentesHeredofamiliares == null && other.idAntecedentesHeredofamiliares != null) || (this.idAntecedentesHeredofamiliares != null && !this.idAntecedentesHeredofamiliares.equals(other.idAntecedentesHeredofamiliares))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AntecedentesHeredofamiliares[ idAntecedentesHeredofamiliares=" + idAntecedentesHeredofamiliares + " ]";
    }
    
}
