/** Concrete channel: publishes the content on the self-service web portal. */
public class EnvioPortalWeb implements CanalEnvio {
    @Override
    public void enviar(String contenido) {
        System.out.println("[PortalWeb] Enviando: " + contenido);
    }
}
