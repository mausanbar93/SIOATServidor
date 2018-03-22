package co.edu.uniautonoma.sioat.datos;
// Generated 6/03/2018 01:23:43 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SubcuentaActivoId generated by hbm2java
 */
@Embeddable
public class SubcuentaActivoId implements java.io.Serializable {

    private int idActivo;
    private int idSubcuenta;

    public SubcuentaActivoId() {
    }

    public SubcuentaActivoId(int idActivo, int idSubcuenta) {
        this.idActivo = idActivo;
        this.idSubcuenta = idSubcuenta;
    }

    @Column(name = "id_activo", nullable = false)
    public int getIdActivo() {
        return this.idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    @Column(name = "id_subcuenta", nullable = false)
    public int getIdSubcuenta() {
        return this.idSubcuenta;
    }

    public void setIdSubcuenta(int idSubcuenta) {
        this.idSubcuenta = idSubcuenta;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof SubcuentaActivoId)) {
            return false;
        }
        SubcuentaActivoId castOther = (SubcuentaActivoId) other;

        return (this.getIdActivo() == castOther.getIdActivo())
                && (this.getIdSubcuenta() == castOther.getIdSubcuenta());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdActivo();
        result = 37 * result + this.getIdSubcuenta();
        return result;
    }

}