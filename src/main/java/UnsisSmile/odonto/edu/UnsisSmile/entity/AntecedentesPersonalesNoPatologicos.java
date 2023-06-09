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
@Table(name = "antecedentes_personales_no_patologicos")
//@NamedQueries({
//    @NamedQuery(name = "AntecedentesPersonalesNoPatologicos.findAll", query = "SELECT a FROM AntecedentesPersonalesNoPatologicos a")})
public class AntecedentesPersonalesNoPatologicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_antecedentes_personales_no_patologicos")
    private Integer idAntecedentesPersonalesNoPatologicos;
    @Column(name = "come_frutas_verduras")
    private Boolean comeFrutasVerduras;
    @Column(name = "come_carne")
    private Boolean comeCarne;
    @Column(name = "come_cereales")
    private Boolean comeCereales;
    @Column(name = "come_alimentos_chatarra")
    private Boolean comeAlimentosChatarra;
    @Column(name = "toma_dos_litros_de_agua_x_dia")
    private Boolean tomaDosLitrosDeAguaXDia;
    @Column(name = "uno_o_mas_refrescos_dia")
    private Boolean unoOMasRefrescosDia;
    @Column(name = "horas_duerme_dia")
    private Integer horasDuermeDia;
    @Column(name = "ba\u00f1o_veces_x_semana")
    private Integer bañoVecesXSemana;
    @Column(name = "cepillado_x_dia")
    private Integer cepilladoXDia;
    @Column(name = "su_vivienda_tiene_piso")
    private Integer suViviendaTienePiso;
    @Column(name = "material_de_vivienda")
    private String materialDeVivienda;
    @OneToMany(mappedBy = "antecedentesPersonalesNoPatologicos", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

    public AntecedentesPersonalesNoPatologicos() {
    }

    public AntecedentesPersonalesNoPatologicos(Integer idAntecedentesPersonalesNoPatologicos) {
        this.idAntecedentesPersonalesNoPatologicos = idAntecedentesPersonalesNoPatologicos;
    }

    public Integer getIdAntecedentesPersonalesNoPatologicos() {
        return idAntecedentesPersonalesNoPatologicos;
    }

    public void setIdAntecedentesPersonalesNoPatologicos(Integer idAntecedentesPersonalesNoPatologicos) {
        this.idAntecedentesPersonalesNoPatologicos = idAntecedentesPersonalesNoPatologicos;
    }

    public Boolean getComeFrutasVerduras() {
        return comeFrutasVerduras;
    }

    public void setComeFrutasVerduras(Boolean comeFrutasVerduras) {
        this.comeFrutasVerduras = comeFrutasVerduras;
    }

    public Boolean getComeCarne() {
        return comeCarne;
    }

    public void setComeCarne(Boolean comeCarne) {
        this.comeCarne = comeCarne;
    }

    public Boolean getComeCereales() {
        return comeCereales;
    }

    public void setComeCereales(Boolean comeCereales) {
        this.comeCereales = comeCereales;
    }

    public Boolean getComeAlimentosChatarra() {
        return comeAlimentosChatarra;
    }

    public void setComeAlimentosChatarra(Boolean comeAlimentosChatarra) {
        this.comeAlimentosChatarra = comeAlimentosChatarra;
    }

    public Boolean getTomaDosLitrosDeAguaXDia() {
        return tomaDosLitrosDeAguaXDia;
    }

    public void setTomaDosLitrosDeAguaXDia(Boolean tomaDosLitrosDeAguaXDia) {
        this.tomaDosLitrosDeAguaXDia = tomaDosLitrosDeAguaXDia;
    }

    public Boolean getUnoOMasRefrescosDia() {
        return unoOMasRefrescosDia;
    }

    public void setUnoOMasRefrescosDia(Boolean unoOMasRefrescosDia) {
        this.unoOMasRefrescosDia = unoOMasRefrescosDia;
    }

    public Integer getHorasDuermeDia() {
        return horasDuermeDia;
    }

    public void setHorasDuermeDia(Integer horasDuermeDia) {
        this.horasDuermeDia = horasDuermeDia;
    }

    public Integer getBañoVecesXSemana() {
        return bañoVecesXSemana;
    }

    public void setBañoVecesXSemana(Integer bañoVecesXSemana) {
        this.bañoVecesXSemana = bañoVecesXSemana;
    }

    public Integer getCepilladoXDia() {
        return cepilladoXDia;
    }

    public void setCepilladoXDia(Integer cepilladoXDia) {
        this.cepilladoXDia = cepilladoXDia;
    }

    public Integer getSuViviendaTienePiso() {
        return suViviendaTienePiso;
    }

    public void setSuViviendaTienePiso(Integer suViviendaTienePiso) {
        this.suViviendaTienePiso = suViviendaTienePiso;
    }

    public String getMaterialDeVivienda() {
        return materialDeVivienda;
    }

    public void setMaterialDeVivienda(String materialDeVivienda) {
        this.materialDeVivienda = materialDeVivienda;
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
        hash += (idAntecedentesPersonalesNoPatologicos != null ? idAntecedentesPersonalesNoPatologicos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AntecedentesPersonalesNoPatologicos)) {
            return false;
        }
        AntecedentesPersonalesNoPatologicos other = (AntecedentesPersonalesNoPatologicos) object;
        if ((this.idAntecedentesPersonalesNoPatologicos == null && other.idAntecedentesPersonalesNoPatologicos != null) || (this.idAntecedentesPersonalesNoPatologicos != null && !this.idAntecedentesPersonalesNoPatologicos.equals(other.idAntecedentesPersonalesNoPatologicos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AntecedentesPersonalesNoPatologicos[ idAntecedentesPersonalesNoPatologicos=" + idAntecedentesPersonalesNoPatologicos + " ]";
    }
    
}
