/**
 * Implementor interface for the export side of the Bridge.
 * Concrete exporters decide how the built content is written out
 * (XML, PDF, JSON, EDI, ...), independently of the Comprobante hierarchy.
 */
public interface ExportadorFormato {
    void exportar(String contenido);
}
