/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Examen bucal
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
@Table(name = "examen_bucal")

public class ExamenBucal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_examen_bucal")
    private Integer idExamenBucal;
    @Lob
    @Column(name = "Relacion_molar_Derecha")
    private String relacionmolarDerecha;
    @Lob
    @Column(name = "Relacion_molar_Izquierda")
    private String relacionmolarIzquierda;
    @Lob
    @Column(name = "Relacion_canina_Derecha")
    private String relacioncaninaDerecha;
    @Lob
    @Column(name = "Relacion_canina_Izquierda")
    private String relacioncaninaIzquierda;
    @OneToMany(mappedBy = "examenBucal", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

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

    public String getRelacionmolarDerecha() {
        return relacionmolarDerecha;
    }

    public void setRelacionmolarDerecha(String relacionmolarDerecha) {
        this.relacionmolarDerecha = relacionmolarDerecha;
    }

    public String getRelacionmolarIzquierda() {
        return relacionmolarIzquierda;
    }

    public void setRelacionmolarIzquierda(String relacionmolarIzquierda) {
        this.relacionmolarIzquierda = relacionmolarIzquierda;
    }

    public String getRelacioncaninaDerecha() {
        return relacioncaninaDerecha;
    }

    public void setRelacioncaninaDerecha(String relacioncaninaDerecha) {
        this.relacioncaninaDerecha = relacioncaninaDerecha;
    }

    public String getRelacioncaninaIzquierda() {
        return relacioncaninaIzquierda;
    }

    public void setRelacioncaninaIzquierda(String relacioncaninaIzquierda) {
        this.relacioncaninaIzquierda = relacioncaninaIzquierda;
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
        return "com.unsis.odonto.edu.entity.base.ExamenBucal[ idExamenBucal=" + idExamenBucal + " ]";
    }
    
}
