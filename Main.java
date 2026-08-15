/**
 * Demonstrates that any Comprobante subclass works with any combination
 * of implementors, without needing one class per combination.
 */
public class Main {
    public static void main(String[] args) {
        Comprobante c1 = new FacturaVenta(new ExportadorXML(), new EnvioCorreo(), new FirmaLocal());
        Comprobante c2 = new NotaCredito(new ExportadorPDF(), new EnvioWhatsApp(), new FirmaEnNube());
        Comprobante c3 = new NotaDebito(new ExportadorJSON(), new EnvioPortalWeb(), new FirmaHSM());
        Comprobante c4 = new ComprobanteRetencion(new ExportadorXML(), new EnvioPortalWeb(), new FirmaEnNube());
        Comprobante c5 = new FacturaVenta(new ExportadorJSON(), new EnvioCorreo(), new FirmaHSM());
        // Nuevo formato EDI agregado sin modificar Comprobante ni sus subclases.
        Comprobante c6 = new NotaCredito(new ExportadorEDI(), new EnvioCorreo(), new FirmaLocal());

        Comprobante[] comprobantes = { c1, c2, c3, c4, c5, c6 };

        for (Comprobante c : comprobantes) {
            c.procesar();
            System.out.println("---");
        }
    }
}
