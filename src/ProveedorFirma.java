/**
 * Implementor interface for the electronic signature side of the Bridge.
 * Concrete providers decide how the content gets signed
 * (local certificate, cloud signing service, hardware HSM, ...).
 */
public interface ProveedorFirma {
    void firmar(String contenido);
}
