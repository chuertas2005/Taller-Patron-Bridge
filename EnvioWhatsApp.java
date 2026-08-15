/** Concrete channel: sends the content by WhatsApp. */
public class EnvioWhatsApp implements CanalEnvio {
    @Override
    public void enviar(String contenido) {
        System.out.println("[WhatsApp] Enviando: " + contenido);
    }
}
