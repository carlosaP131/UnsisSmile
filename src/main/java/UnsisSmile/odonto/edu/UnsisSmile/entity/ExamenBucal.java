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
@Table(name = "examen_bucal")
//@NamedQueries({
//    @NamedQuery(name = "ExamenBucal.findAll", query = "SELECT e FROM ExamenBucal e")})
public class ExamenBucal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_examen_bucal")
    private Integer idExamenBucal;
    @Lob
    @Column(name = "Relaci\u00f3n_molar_Derecha")
    private String relaciónmolarDerecha;
    @Lob
    @Column(name = "Relaci\u00f3n_molar_Izquierda")
    private String relaciónmolarIzquierda;
    @Lob
    @Column(name = "Relaci\u00f3n_canina_Derecha")
    private String relacióncaninaDerecha;
    @Lob
    @Column(name = "Relaci\u00f3n_canina_Izquierda")
    private String relacióncaninaIzquierda;
//    @OneToMany(mappedBy = "examenBucal", fetch = FetchType.LAZY)
//    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public ExamenBucal() {
    }

    public ExamenBucal(Integer idExamenBucal) {
        this.idExamenBucal = idExamenBucal;
    }

    public Integer getIdExamenBucal() {
        return idExamenBucal;
    }

    public void setIdExamenBucal(Integer idExamenBucal) {
        this.idExamenBucal = idExamenBucal;
    }

    public String getRelaciónmolarDerecha() {
        return relaciónmolarDerecha;
    }

    public void setRelaciónmolarDerecha(String relaciónmolarDerecha) {
        this.relaciónmolarDerecha = relaciónmolarDerecha;
    }

    public String getRelaciónmolarIzquierda() {
        return relaciónmolarIzquierda;
    }

    public void setRelaciónmolarIzquierda(String relaciónmolarIzquierda) {
        this.relaciónmolarIzquierda = relaciónmolarIzquierda;
    }

    public String getRelacióncaninaDerecha() {
        return relacióncaninaDerecha;
    }

    public void setRelacióncaninaDerecha(String relacióncaninaDerecha) {
        this.relacióncaninaDerecha = relacióncaninaDerecha;
    }

    public String getRelacióncaninaIzquierda() {
        return relacióncaninaIzquierda;
    }

    public void setRelacióncaninaIzquierda(String relacióncaninaIzquierda) {
        this.relacióncaninaIzquierda = relacióncaninaIzquierda;
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
        hash += (idExamenBucal != null ? idExamenBucal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamenBucal)) {
            return false;
        }
        ExamenBucal other = (ExamenBucal) object;
        if ((this.idExamenBucal == null && other.idExamenBucal != null) || (this.idExamenBucal != null && !this.idExamenBucal.equals(other.idExamenBucal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ExamenBucal[ idExamenBucal=" + idExamenBucal + " ]";
    }
    
}
