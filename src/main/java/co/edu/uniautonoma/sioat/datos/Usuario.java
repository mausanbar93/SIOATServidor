package co.edu.uniautonoma.sioat.datos;
// Generated 6/03/2018 01:23:43 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario")
public class Usuario implements java.io.Serializable {

    private Integer id;
    private Cargo cargo;
    private Login login;
    private String nombre;
    private String apellido;
    private String correo;
    private Long numeroCelular;
    private String direccion;
    private long cedula;
    private Date fechaNacimiento;
    private boolean habilitado;
    private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public Usuario() {
    }

    public Usuario(Cargo cargo, Login login, String nombre, String apellido, long cedula, Date fechaNacimiento, boolean habilitado) {
        this.cargo = cargo;
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.habilitado = habilitado;
    }

    public Usuario(Cargo cargo, Login login, String nombre, String apellido, String correo, Long numeroCelular, String direccion, long cedula, Date fechaNacimiento, boolean habilitado, Set<Cliente> clientes) {
        this.cargo = cargo;
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.habilitado = habilitado;
        this.clientes = clientes;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo", nullable = false)
    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_login", nullable = false)
    public Login getLogin() {
        return this.login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Column(name = "nombre", nullable = false, length = 30)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "apellido", nullable = false, length = 30)
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Column(name = "correo", length = 50)
    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Column(name = "numero_celular")
    public Long getNumeroCelular() {
        return this.numeroCelular;
    }

    public void setNumeroCelular(Long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Column(name = "direccion", length = 100)
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name = "cedula", nullable = false)
    public long getCedula() {
        return this.cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento", nullable = false, length = 10)
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Column(name = "habilitado", nullable = false)
    public boolean isHabilitado() {
        return this.habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @XmlTransient
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

}
