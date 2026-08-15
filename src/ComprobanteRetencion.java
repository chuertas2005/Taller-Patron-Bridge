/** Concrete refined abstraction: a withholding certificate. */
public class ComprobanteRetencion extends Comprobante {

    public ComprobanteRetencion(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "Comprobante Retencion #004 - Total: 12000";
    }
}
