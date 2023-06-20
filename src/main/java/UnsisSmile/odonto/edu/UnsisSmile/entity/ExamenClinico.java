/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Examen clinico
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
@Table(name = "examen_clinico")

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
    @Column(name = "Nodulos_linfaticos")
    private String noduloslinfaticos;
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
    @Column(name = "Glandulas_salivales")
    private String glandulassalivales;
    @Lob
    @Column(name = "Encia")
    private String encia;
    @Lob
    @Column(name = "Frenillos")
    private String frenillos;
    @Lob
    @Column(name = "Saliva")
    private String saliva;
    @Lob
    @Column(name = "Otras_senias_particulares")
    private String otrasseniasparticulares;
    @OneToMany(mappedBy = "examenClinico", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

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

    public String getNoduloslinfaticos() {
        return noduloslinfaticos;
    }

    public void setNoduloslinfaticos(String noduloslinfaticos) {
        this.noduloslinfaticos = noduloslinfaticos;
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

    public String getGlandulassalivales() {
        return glandulassalivales;
    }

    public void setGlandulassalivales(String glandulassalivales) {
        this.glandulassalivales = glandulassalivales;
    }

    public String getEncia() {
        return encia;
    }

    public void setEncia(String encia) {
        this.encia = encia;
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

    public String getOtrasseniasparticulares() {
        return otrasseniasparticulares;
    }

    public void setOtrasseniasparticulares(String otrasseniasparticulares) {
        this.otrasseniasparticulares = otrasseniasparticulares;
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
        return "com.unsis.odonto.edu.entity.base.ExamenClinico[ idExamenClinico=" + idExamenClinico + " ]";
    }
    
}
