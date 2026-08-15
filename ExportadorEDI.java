/**
 * New concrete exporter added to satisfy the extension requirement.
 * It only implements ExportadorFormato: Comprobante and its four
 * subclasses (FacturaVenta, NotaCredito, NotaDebito, ComprobanteRetencion)
 * depend on the ExportadorFormato interface, not on this concrete class,
 * so none of them needed to change or be recompiled to support EDI.
 */
public class ExportadorEDI implements ExportadorFormato {
    @Override
    public void exportar(String contenido) {
        System.out.println("[EDI] Exportando: " + contenido);
    }
}
