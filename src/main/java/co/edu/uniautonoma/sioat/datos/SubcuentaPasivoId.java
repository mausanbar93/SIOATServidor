package co.edu.uniautonoma.sioat.datos;
// Generated 6/03/2018 01:23:43 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SubcuentaPasivoId generated by hbm2java
 */
@Embeddable
public class SubcuentaPasivoId implements java.io.Serializable {

    private int idSubcuenta;
    private int idPasivo;

    public SubcuentaPasivoId() {
    }

    public SubcuentaPasivoId(int idSubcuenta, int idPasivo) {
        this.idSubcuenta = idSubcuenta;
        this.idPasivo = idPasivo;
    }

    @Column(name = "id_subcuenta", nullable = false)
    public int getIdSubcuenta() {
        return this.idSubcuenta;
    }

    public void setIdSubcuenta(int idSubcuenta) {
        this.idSubcuenta = idSubcuenta;
    }

    @Column(name = "id_pasivo", nullable = false)
    public int getIdPasivo() {
        return this.idPasivo;
    }

    public void setIdPasivo(int idPasivo) {
        this.idPasivo = idPasivo;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof SubcuentaPasivoId)) {
            return false;
        }
        SubcuentaPasivoId castOther = (SubcuentaPasivoId) other;

        return (this.getIdSubcuenta() == castOther.getIdSubcuenta())
                && (this.getIdPasivo() == castOther.getIdPasivo());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdSubcuenta();
        result = 37 * result + this.getIdPasivo();
        return result;
    }

}
