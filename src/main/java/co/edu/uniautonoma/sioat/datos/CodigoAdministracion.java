package co.edu.uniautonoma.sioat.datos;
// Generated 6/03/2018 01:23:43 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 * CodigoAdministracion generated by hbm2java
 */
@Entity
@Table(name = "codigo_administracion")
public class CodigoAdministracion implements java.io.Serializable {

    private Integer id;
    private String nombre;
    private String codigo;
    private Set<Cliente> clientes = new HashSet<Cliente>(0);

    public CodigoAdministracion() {
    }

    public CodigoAdministracion(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public CodigoAdministracion(String nombre, String codigo, Set<Cliente> clientes) {
        this.nombre = nombre;
        this.codigo = codigo;
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

    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "codigo", nullable = false, length = 10)
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "codigoAdministracion")
    public Set<Cliente> getClientes() {
        return this.clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

}