/**
 * Implementor interface for the delivery side of the Bridge.
 * Concrete channels decide how the content reaches the client
 * (email, WhatsApp, self-service portal, ...).
 */
public interface CanalEnvio {
    void enviar(String contenido);
}
