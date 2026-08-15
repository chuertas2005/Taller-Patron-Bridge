/**
 * Abstraction of the Bridge pattern.
 * Holds a reference to one implementor of each of the three independent
 * axes (export format, delivery channel, signature provider) and delegates
 * to them, so new document types and new implementors can evolve separately.
 */
public abstract class Comprobante {

    protected ExportadorFormato exportador;
    protected CanalEnvio canal;
    protected ProveedorFirma firma;

    public Comprobante(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        this.exportador = exportador;
        this.canal = canal;
        this.firma = firma;
    }

    protected abstract String construirContenido();

    public void procesar() {
        String contenido = construirContenido();
        exportador.exportar(contenido);
        canal.enviar(contenido);
        firma.firmar(contenido);
    }
}
