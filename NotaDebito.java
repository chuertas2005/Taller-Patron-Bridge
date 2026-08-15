/** Concrete refined abstraction: a debit note. */
public class NotaDebito extends Comprobante {

    public NotaDebito(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "Nota Debito #003 - Total: 32000";
    }
}
