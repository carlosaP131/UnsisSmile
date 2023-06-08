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
@Table(name = "examen_clinico")
//@NamedQueries({
//    @NamedQuery(name = "ExamenClinico.findAll", query = "SELECT e FROM ExamenClinico e")})
public class ExamenClinico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_examen_clinico")
    private Integer idExamenClinico;
    @Lob
    @Column(name = "Paladar")
    private String paladar;
    @Lob
    @Column(name = "Istmo_fauces")
    private String istmofauces;
    @Lob
    @Column(name = "Mucosa_yugal")
    private String mucosayugal;
    @Lob
    @Column(name = "N\u00f3dulos_linf\u00e1ticos")
    private String nóduloslinfáticos;
    @Lob
    @Column(name = "Lengua")
    private String lengua;
    @Lob
    @Column(name = "Piso_boca")
    private String pisoboca;
    @Lob
    @Column(name = "Labios")
    private String labios;
    @Lob
    @Column(name = "Gl\u00e1ndulas_salivales")
    private String glándulassalivales;
    @Lob
    @Column(name = "Enc\u00eda")
    private String encía;
    @Lob
    @Column(name = "Frenillos")
    private String frenillos;
    @Lob
    @Column(name = "Saliva")
    private String saliva;
    @Lob
    @Column(name = "Otras_se\u00f1as_particulares")
    private String otrasseñasparticulares;
//    @OneToMany(mappedBy = "examenClinico", fetch = FetchType.LAZY)
//    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public ExamenClinico() {
    }

    public ExamenClinico(Integer idExamenClinico) {
        this.idExamenClinico = idExamenClinico;
    }

    public Integer getIdExamenClinico() {
        return idExamenClinico;
    }

    public void setIdExamenClinico(Integer idExamenClinico) {
        this.idExamenClinico = idExamenClinico;
    }

    public String getPaladar() {
        return paladar;
    }

    public void setPaladar(String paladar) {
        this.paladar = paladar;
    }

    public String getIstmofauces() {
        return istmofauces;
    }

    public void setIstmofauces(String istmofauces) {
        this.istmofauces = istmofauces;
    }

    public String getMucosayugal() {
        return mucosayugal;
    }

    public void setMucosayugal(String mucosayugal) {
        this.mucosayugal = mucosayugal;
    }

    public String getNóduloslinfáticos() {
        return nóduloslinfáticos;
    }

    public void setNóduloslinfáticos(String nóduloslinfáticos) {
        this.nóduloslinfáticos = nóduloslinfáticos;
    }

    public String getLengua() {
        return lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }

    public String getPisoboca() {
        return pisoboca;
    }

    public void setPisoboca(String pisoboca) {
        this.pisoboca = pisoboca;
    }

    public String getLabios() {
        return labios;
    }

    public void setLabios(String labios) {
        this.labios = labios;
    }

    public String getGlándulassalivales() {
        return glándulassalivales;
    }

    public void setGlándulassalivales(String glándulassalivales) {
        this.glándulassalivales = glándulassalivales;
    }

    public String getEncía() {
        return encía;
    }

    public void setEncía(String encía) {
        this.encía = encía;
    }

    public String getFrenillos() {
        return frenillos;
    }

    public void setFrenillos(String frenillos) {
        this.frenillos = frenillos;
    }

    public String getSaliva() {
        return saliva;
    }

    public void setSaliva(String saliva) {
        this.saliva = saliva;
    }

    public String getOtrasseñasparticulares() {
        return otrasseñasparticulares;
    }

    public void setOtrasseñasparticulares(String otrasseñasparticulares) {
        this.otrasseñasparticulares = otrasseñasparticulares;
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
        hash += (idExamenClinico != null ? idExamenClinico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenClinico)) {
            return false;
        }
        ExamenClinico other = (ExamenClinico) object;
        if ((this.idExamenClinico == null && other.idExamenClinico != null) || (this.idExamenClinico != null && !this.idExamenClinico.equals(other.idExamenClinico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ExamenClinico[ idExamenClinico=" + idExamenClinico + " ]";
    }
    
}
