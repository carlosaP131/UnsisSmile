/**
 * Autor: Baldomero Sainos Hernández 
 * Autor de modificación: Baldomero Sainos Hernández
 * Fecha creación: 05 de Junio de 2023
 * Fecha modificación: 13 Junio de 2023
 * Descripción: Clase Catedraticos, se implementó la clase entity.
 */

package UnsisSmile.odonto.edu.UnsisSmile.entity;
/**
 * Librerias importadas para el dasarrollo del entity. 
 */
import java.io.Serializable;  
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "catedraticos")
public class Catedraticos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_catedratico")
    private Integer idCatedratico;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "apellido2")
    private String apellido2;
    @Column(name = "curp")
    private String curp;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "fecha_nacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacimiento;
    @Column(name = "numero_trabajador")
    private String numeroTrabajador;
    @Basic(optional = false)
    @Column(name = "email_catedratico")
    private String emailCatedratico;
    @Column(name = "estatus")
    private Boolean estatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catedraticos", fetch = FetchType.LAZY)
    private List<HistoriaClinicaGeneral> historiaClinicaGeneralList;
    @JoinColumn(name = "fk_id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JsonIgnore
    private Usuarios usuarios;
    @OneToMany(mappedBy = "catedraticos", fetch = FetchType.LAZY)
    private List<CatedraticoGrupo> catedraticoGrupoList;

    public Catedraticos() {
    }

    public Catedraticos(Integer idCatedratico) {
        this.idCatedratico = idCatedratico;
    }

    public Catedraticos(Integer idCatedratico, String emailCatedratico) {
        this.idCatedratico = idCatedratico;
        this.emailCatedratico = emailCatedratico;
    }

    public Integer getIdCatedratico() {
        return idCatedratico;
    }

    public void setIdCatedratico(Integer idCatedratico) {
        this.idCatedratico = idCatedratico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(String numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getEmailCatedratico() {
        return emailCatedratico;
    }

    public void setEmailCatedratico(String emailCatedratico) {
        this.emailCatedratico = emailCatedratico;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }

    public List<HistoriaClinicaGeneral> getHistoriaClinicaGeneralList() {
        return historiaClinicaGeneralList;
    }

    public void setHistoriaClinicaGeneralList(List<HistoriaClinicaGeneral> historiaClinicaGeneralList) {
        this.historiaClinicaGeneralList = historiaClinicaGeneralList;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public List<CatedraticoGrupo> getCatedraticoGrupoList() {
        return catedraticoGrupoList;
    }

    public void setCatedraticoGrupoList(List<CatedraticoGrupo> catedraticoGrupoList) {
        this.catedraticoGrupoList = catedraticoGrupoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatedratico != null ? idCatedratico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catedraticos)) {
            return false;
        }
        Catedraticos other = (Catedraticos) object;
        if ((this.idCatedratico == null && other.idCatedratico != null) || (this.idCatedratico != null && !this.idCatedratico.equals(other.idCatedratico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unsis.odonto.edu.entity.base.Catedraticos[ idCatedratico=" + idCatedratico + " ]";
    }
    
}
