/**
 * Autor: Joel Francisco Figueroa Martinez 
 * Fecha creación: 09 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Modela a la tabla Consulta
 */

package UnsisSmile.odonto.edu.UnsisSmile.entity;

import java.io.Serializable;   
import java.time.LocalDate;
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
import jakarta.persistence.Table;

/**
 *
 * @author labingsw05
 */
@Entity
@Table(name = "consulta")

public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consulta")
    private Integer idConsulta;
    @Lob
    @Column(name = "diagnostico")
    private String diagnostico;
    @Lob
    @Column(name = "pronostico")
    private String pronostico;
    @Lob
    @Column(name = "tratamiento")
    private String tratamiento;
    @Lob
    @Column(name = "manejo_integral")
    private String manejoIntegral;
    @Lob
    @Column(name = "motivo_de_la_consulta")
    private String motivoDeLaConsulta;
    @Column(name = "fecha_de_consulta",  columnDefinition = "DATE")
    private LocalDate fechaDeConsulta;
    @JoinColumn(name = "fk_id_clinica", referencedColumnName = "id_clinica")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Clinica clinica;
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id_paciente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;
    @JoinColumn(name = "fk_id_procedimiento_realizado", referencedColumnName = "id_procedimiento_tipo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ProcedimientoTipo procedimientoTipo;
    @JoinColumn(name = "fk_id_signos_vitales", referencedColumnName = "id_signos_vitales")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SignosVitales signosVitales;
    @JoinColumn(name = "fk_id_alumno", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuarios usuarios;

    public Consulta() {
    }

    public Consulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getManejoIntegral() {
        return manejoIntegral;
    }

    public void setManejoIntegral(String manejoIntegral) {
        this.manejoIntegral = manejoIntegral;
    }

    public String getMotivoDeLaConsulta() {
        return motivoDeLaConsulta;
    }

    public void setMotivoDeLaConsulta(String motivoDeLaConsulta) {
        this.motivoDeLaConsulta = motivoDeLaConsulta;
    }

    public LocalDate getFechaDeConsulta() {
        return fechaDeConsulta;
    }

    public void setFechaDeConsulta(LocalDate fechaDeConsulta) {
        this.fechaDeConsulta = fechaDeConsulta;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ProcedimientoTipo getProcedimientoTipo() {
        return procedimientoTipo;
    }

    public void setProcedimientoTipo(ProcedimientoTipo procedimientoTipo) {
        this.procedimientoTipo = procedimientoTipo;
    }

    public SignosVitales getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(SignosVitales signosVitales) {
        this.signosVitales = signosVitales;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsulta != null ? idConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idConsulta == null && other.idConsulta != null) || (this.idConsulta != null && !this.idConsulta.equals(other.idConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.Consulta[ idConsulta=" + idConsulta + " ]";
    }
    
}
