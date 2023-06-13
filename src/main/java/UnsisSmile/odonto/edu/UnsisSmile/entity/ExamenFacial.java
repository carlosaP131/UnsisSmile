/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Examen facial
 */
package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "examen_facial")

public class ExamenFacial implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "id_examen_facial")
	private Integer idExamenFacial;
	@Lob
	@Column(name = "perfil")
	private String perfil;
	@Lob
	@Column(name = "frente")
	private String frente;
	@Lob
	@Column(name = "senias_particulares")
	private String seniasParticulares;
	@OneToMany(mappedBy = "examenFacial", fetch = FetchType.LAZY)
	private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;

	public ExamenFacial() {
	}

	public ExamenFacial(Integer idExamenFacial) {
		this.idExamenFacial = idExamenFacial;
	}

	public Integer getIdExamenFacial() {
		return idExamenFacial;
	}

	public void setIdExamenFacial(Integer idExamenFacial) {
		this.idExamenFacial = idExamenFacial;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getFrente() {
		return frente;
	}

	public void setFrente(String frente) {
		this.frente = frente;
	}

	public String getSeniasParticulares() {
		return seniasParticulares;
	}

	public void setSeniasParticulares(String seniasParticulares) {
		this.seniasParticulares = seniasParticulares;
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
		hash += (idExamenFacial != null ? idExamenFacial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof ExamenFacial)) {
			return false;
		}
		ExamenFacial other = (ExamenFacial) object;
		if ((this.idExamenFacial == null && other.idExamenFacial != null)
				|| (this.idExamenFacial != null && !this.idExamenFacial.equals(other.idExamenFacial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.unsis.odonto.edu.entity.base.ExamenFacial[ idExamenFacial=" + idExamenFacial + " ]";
	}

}
