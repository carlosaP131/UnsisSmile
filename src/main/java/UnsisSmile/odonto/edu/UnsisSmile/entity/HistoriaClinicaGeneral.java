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
@Table(name = "historia_clinica_general")
//@NamedQueries({
//    @NamedQuery(name = "HistoriaClinicaGeneral.findAll", query = "SELECT h FROM HistoriaClinicaGeneral h")})
public class HistoriaClinicaGeneral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_historia_clinica_general")
    private Integer idHistoriaClinicaGeneral;
    @JoinColumn(name = "fk_id_analisis_radiografico", referencedColumnName = "id_analisis_radiografico")
    @ManyToOne(fetch = FetchType.LAZY)
    private AnalisisRadiografico analisisRadiografico;
    @JoinColumn(name = "fk_id_analisis_funcional", referencedColumnName = "id_analisis_funcional")
    @ManyToOne(fetch = FetchType.LAZY)
    private AnalisisFuncional analisisFuncional;
    @JoinColumn(name = "fk_id_antecedentes_heredofamiliares", referencedColumnName = "id_antecedentes_heredofamiliares")
    @ManyToOne(fetch = FetchType.LAZY)
    private AntecedentesHeredofamiliares antecedentesHeredofamiliares;
    @JoinColumn(name = "fk_id_antecedentes_personales_no_patologicos", referencedColumnName = "id_antecedentes_personales_no_patologicos")
    @ManyToOne(fetch = FetchType.LAZY)
    private AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos;
    @JoinColumn(name = "fk_id_modelos_de_estudio_fotografias", referencedColumnName = "id_modelos_de_estudio_fotografias")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private ModelosDeEstudioFotografias modelosDeEstudioFotografias;
//    @JoinColumn(name = "fk_id_odontograma_final", referencedColumnName = "id_odontograma")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Odontograma odontograma;
//    @JoinColumn(name = "fk_id_postura_del_paciente", referencedColumnName = "id_postura_del_paciente")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private PosturaDelPaciente posturaDelPaciente;
    @JoinColumn(name = "fk_id_antecedentes_personales_patologicos", referencedColumnName = "id_antecedentes_personales_patologicos")
    @ManyToOne(fetch = FetchType.LAZY)
    private AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos;
//    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Paciente paciente;
    @JoinColumn(name = "fk_id_catedratico_responsable", referencedColumnName = "id_catedratico")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Catedraticos catedraticos;
    @JoinColumn(name = "fk_id_estudio_de_laboratorio_biopsia", referencedColumnName = "id_estudio_de_laboratorio_biopsia")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstudioDeLaboratorioBiopsia estudioDeLaboratorioBiopsia;
//    @JoinColumn(name = "fk_id_signos_vitales", referencedColumnName = "id_signos_vitales")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private SignosVitales signosVitales;
    @JoinColumn(name = "fk_id_examen_bucal", referencedColumnName = "id_examen_bucal")
    @ManyToOne(fetch = FetchType.LAZY)
    private ExamenBucal examenBucal;
    @JoinColumn(name = "fk_id_examen_clinico", referencedColumnName = "id_examen_clinico")
    @ManyToOne(fetch = FetchType.LAZY)
    private ExamenClinico examenClinico;
    @JoinColumn(name = "fk_id_examen_facial", referencedColumnName = "id_examen_facial")
    @ManyToOne(fetch = FetchType.LAZY)
    private ExamenFacial examenFacial;
//    @JoinColumn(name = "fk_id_odontograma_inicial", referencedColumnName = "id_odontograma")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Odontograma odontograma1;
//    @JoinColumn(name = "fk_id_interconsulta_medica", referencedColumnName = "id_interconsulta_medica")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private InterconsultaMedica interconsultaMedica;

    public HistoriaClinicaGeneral() {
    }

    public HistoriaClinicaGeneral(Integer idHistoriaClinicaGeneral) {
        this.idHistoriaClinicaGeneral = idHistoriaClinicaGeneral;
    }

    public Integer getIdHistoriaClinicaGeneral() {
        return idHistoriaClinicaGeneral;
    }

    public void setIdHistoriaClinicaGeneral(Integer idHistoriaClinicaGeneral) {
        this.idHistoriaClinicaGeneral = idHistoriaClinicaGeneral;
    }

    public AnalisisRadiografico getAnalisisRadiografico() {
        return analisisRadiografico;
    }

    public void setAnalisisRadiografico(AnalisisRadiografico analisisRadiografico) {
        this.analisisRadiografico = analisisRadiografico;
    }

    public AnalisisFuncional getAnalisisFuncional() {
        return analisisFuncional;
    }

    public void setAnalisisFuncional(AnalisisFuncional analisisFuncional) {
        this.analisisFuncional = analisisFuncional;
    }

    public AntecedentesHeredofamiliares getAntecedentesHeredofamiliares() {
        return antecedentesHeredofamiliares;
    }

    public void setAntecedentesHeredofamiliares(AntecedentesHeredofamiliares antecedentesHeredofamiliares) {
        this.antecedentesHeredofamiliares = antecedentesHeredofamiliares;
    }

    public AntecedentesPersonalesNoPatologicos getAntecedentesPersonalesNoPatologicos() {
        return antecedentesPersonalesNoPatologicos;
    }

    public void setAntecedentesPersonalesNoPatologicos(AntecedentesPersonalesNoPatologicos antecedentesPersonalesNoPatologicos) {
        this.antecedentesPersonalesNoPatologicos = antecedentesPersonalesNoPatologicos;
    }

//    public ModelosDeEstudioFotografias getModelosDeEstudioFotografias() {
//        return modelosDeEstudioFotografias;
//    }
//
//    public void setModelosDeEstudioFotografias(ModelosDeEstudioFotografias modelosDeEstudioFotografias) {
//        this.modelosDeEstudioFotografias = modelosDeEstudioFotografias;
//    }
//
//    public Odontograma getOdontograma() {
//        return odontograma;
//    }
//
//    public void setOdontograma(Odontograma odontograma) {
//        this.odontograma = odontograma;
//    }
//
//    public PosturaDelPaciente getPosturaDelPaciente() {
//        return posturaDelPaciente;
//    }
//
//    public void setPosturaDelPaciente(PosturaDelPaciente posturaDelPaciente) {
//        this.posturaDelPaciente = posturaDelPaciente;
//    }

    public AntecedentesPersonalesPatologicos getAntecedentesPersonalesPatologicos() {
        return antecedentesPersonalesPatologicos;
    }

    public void setAntecedentesPersonalesPatologicos(AntecedentesPersonalesPatologicos antecedentesPersonalesPatologicos) {
        this.antecedentesPersonalesPatologicos = antecedentesPersonalesPatologicos;
    }

//    public Paciente getPaciente() {
//        return paciente;
//    }
//
//    public void setPaciente(Paciente paciente) {
//        this.paciente = paciente;
//    }

    public Catedraticos getCatedraticos() {
        return catedraticos;
    }

    public void setCatedraticos(Catedraticos catedraticos) {
        this.catedraticos = catedraticos;
    }

    public EstudioDeLaboratorioBiopsia getEstudioDeLaboratorioBiopsia() {
        return estudioDeLaboratorioBiopsia;
    }

    public void setEstudioDeLaboratorioBiopsia(EstudioDeLaboratorioBiopsia estudioDeLaboratorioBiopsia) {
        this.estudioDeLaboratorioBiopsia = estudioDeLaboratorioBiopsia;
    }
//
//    public SignosVitales getSignosVitales() {
//        return signosVitales;
//    }
//
//    public void setSignosVitales(SignosVitales signosVitales) {
//        this.signosVitales = signosVitales;
//    }

    public ExamenBucal getExamenBucal() {
        return examenBucal;
    }

    public void setExamenBucal(ExamenBucal examenBucal) {
        this.examenBucal = examenBucal;
    }

    public ExamenClinico getExamenClinico() {
        return examenClinico;
    }

    public void setExamenClinico(ExamenClinico examenClinico) {
        this.examenClinico = examenClinico;
    }

    public ExamenFacial getExamenFacial() {
        return examenFacial;
    }

    public void setExamenFacial(ExamenFacial examenFacial) {
        this.examenFacial = examenFacial;
    }

//    public Odontograma getOdontograma1() {
//        return odontograma1;
//    }
//
//    public void setOdontograma1(Odontograma odontograma1) {
//        this.odontograma1 = odontograma1;
//    }
//
//    public InterconsultaMedica getInterconsultaMedica() {
//        return interconsultaMedica;
//    }
//
//    public void setInterconsultaMedica(InterconsultaMedica interconsultaMedica) {
//        this.interconsultaMedica = interconsultaMedica;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoriaClinicaGeneral != null ? idHistoriaClinicaGeneral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriaClinicaGeneral)) {
            return false;
        }
        HistoriaClinicaGeneral other = (HistoriaClinicaGeneral) object;
        if ((this.idHistoriaClinicaGeneral == null && other.idHistoriaClinicaGeneral != null) || (this.idHistoriaClinicaGeneral != null && !this.idHistoriaClinicaGeneral.equals(other.idHistoriaClinicaGeneral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.HistoriaClinicaGeneral[ idHistoriaClinicaGeneral=" + idHistoriaClinicaGeneral + " ]";
    }
    
}
