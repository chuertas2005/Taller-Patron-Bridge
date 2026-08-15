/** Concrete refined abstraction: a credit note. */
public class NotaCredito extends Comprobante {

    public NotaCredito(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "Nota Credito #002 - Total: 45000";
    }
}
