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
@Table(name = "modelos_de_estudio_fotografias")
//@NamedQueries({
//    @NamedQuery(name = "ModelosDeEstudioFotografias.findAll", query = "SELECT m FROM ModelosDeEstudioFotografias m")})
public class ModelosDeEstudioFotografias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_modelos_de_estudio_fotografias")
    private Integer idModelosDeEstudioFotografias;
    @Lob
    @Column(name = "Modelos_de_estudio")
    private String modelosdeestudio;
    @Lob
    @Column(name = "Tipo_de_arcada")
    private String tipodearcada;
    @Lob
    @Column(name = "Fotografias")
    private String fotografias;
    @OneToMany(mappedBy = "modelosDeEstudioFotografias", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public ModelosDeEstudioFotografias() {
    }

    public ModelosDeEstudioFotografias(Integer idModelosDeEstudioFotografias) {
        this.idModelosDeEstudioFotografias = idModelosDeEstudioFotografias;
    }

    public Integer getIdModelosDeEstudioFotografias() {
        return idModelosDeEstudioFotografias;
    }

    public void setIdModelosDeEstudioFotografias(Integer idModelosDeEstudioFotografias) {
        this.idModelosDeEstudioFotografias = idModelosDeEstudioFotografias;
    }

    public String getModelosdeestudio() {
        return modelosdeestudio;
    }

    public void setModelosdeestudio(String modelosdeestudio) {
        this.modelosdeestudio = modelosdeestudio;
    }

    public String getTipodearcada() {
        return tipodearcada;
    }

    public void setTipodearcada(String tipodearcada) {
        this.tipodearcada = tipodearcada;
    }

    public String getFotografias() {
        return fotografias;
    }

    public void setFotografias(String fotografias) {
        this.fotografias = fotografias;
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
        hash += (idModelosDeEstudioFotografias != null ? idModelosDeEstudioFotografias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelosDeEstudioFotografias)) {
            return false;
        }
        ModelosDeEstudioFotografias other = (ModelosDeEstudioFotografias) object;
        if ((this.idModelosDeEstudioFotografias == null && other.idModelosDeEstudioFotografias != null) || (this.idModelosDeEstudioFotografias != null && !this.idModelosDeEstudioFotografias.equals(other.idModelosDeEstudioFotografias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ModelosDeEstudioFotografias[ idModelosDeEstudioFotografias=" + idModelosDeEstudioFotografias + " ]";
    }
    
}
