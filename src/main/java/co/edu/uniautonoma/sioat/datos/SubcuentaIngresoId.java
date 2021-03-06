package co.edu.uniautonoma.sioat.datos;
// Generated 6/03/2018 01:23:43 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SubcuentaIngresoId generated by hbm2java
 */
@Embeddable
public class SubcuentaIngresoId implements java.io.Serializable {

    private int idSubcuenta;
    private int idIngreso;

    public SubcuentaIngresoId() {
    }

    public SubcuentaIngresoId(int idSubcuenta, int idIngreso) {
        this.idSubcuenta = idSubcuenta;
        this.idIngreso = idIngreso;
    }

    @Column(name = "id_subcuenta", nullable = false)
    public int getIdSubcuenta() {
        return this.idSubcuenta;
    }

    public void setIdSubcuenta(int idSubcuenta) {
        this.idSubcuenta = idSubcuenta;
    }

    @Column(name = "id_ingreso", nullable = false)
    public int getIdIngreso() {
        return this.idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof SubcuentaIngresoId)) {
            return false;
        }
        SubcuentaIngresoId castOther = (SubcuentaIngresoId) other;

        return (this.getIdSubcuenta() == castOther.getIdSubcuenta())
                && (this.getIdIngreso() == castOther.getIdIngreso());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdSubcuenta();
        result = 37 * result + this.getIdIngreso();
        return result;
    }

}
