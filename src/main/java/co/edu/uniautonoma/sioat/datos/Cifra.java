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
 * Cifra generated by hbm2java
 */
@Entity
@Table(name = "cifra")
public class Cifra implements java.io.Serializable {

    private Integer id;
    private int idCliente;
    private float saldo;
    private Set<Subcuenta> subcuentas = new HashSet<Subcuenta>(0);

    public Cifra() {
    }

    public Cifra(int idCliente, float saldo) {
        this.idCliente = idCliente;
        this.saldo = saldo;
    }

    public Cifra(int idCliente, float saldo, Set<Subcuenta> subcuentas) {
        this.idCliente = idCliente;
        this.saldo = saldo;
        this.subcuentas = subcuentas;
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

    @Column(name = "id_cliente", nullable = false)
    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Column(name = "saldo", nullable = false, precision = 12, scale = 0)
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @XmlTransient
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cifra")
    public Set<Subcuenta> getSubcuentas() {
        return this.subcuentas;
    }

    public void setSubcuentas(Set<Subcuenta> subcuentas) {
        this.subcuentas = subcuentas;
    }

}
