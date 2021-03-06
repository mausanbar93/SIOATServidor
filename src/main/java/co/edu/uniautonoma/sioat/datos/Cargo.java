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
 * Cargo generated by hbm2java
 */
@Entity
@Table(name = "cargo")
public class Cargo implements java.io.Serializable {

    private Integer id;
    private String nombre;
    private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Cargo() {
    }

    public Cargo(String nombre) {
        this.nombre = nombre;
    }

    public Cargo(String nombre, Set<Usuario> usuarios) {
        this.nombre = nombre;
        this.usuarios = usuarios;
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

    @XmlTransient
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cargo")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
