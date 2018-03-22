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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Renta generated by hbm2java
 */
@Entity
@Table(name = "renta")
public class Renta implements java.io.Serializable {

    private Integer id;
    private Cliente cliente;
    private String estado;
    private byte[] documento;
    private String periodo;
    private Set<Subcuenta> subcuentas = new HashSet<Subcuenta>(0);

    public Renta() {
    }

    public Renta(Cliente cliente, String estado, byte[] documento, String periodo, Set<Subcuenta> subcuentas) {
        this.cliente = cliente;
        this.estado = estado;
        this.documento = documento;
        this.periodo = periodo;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Column(name = "estado", length = 25)
    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "documento")
    public byte[] getDocumento() {
        return this.documento;
    }

    public void setDocumento(byte[] documento) {
        this.documento = documento;
    }

    @Column(name = "periodo", length = 4)
    public String getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @XmlTransient
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "renta")
    public Set<Subcuenta> getSubcuentas() {
        return this.subcuentas;
    }

    public void setSubcuentas(Set<Subcuenta> subcuentas) {
        this.subcuentas = subcuentas;
    }

}