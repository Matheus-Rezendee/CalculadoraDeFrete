public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", "joao@joao.com", "+1234567890");

        Email email = new Email("Olá, este é um email de teste.");
        Sms sms = new Sms("Olá, este é um SMS de teste.");
        Push push = new Push("Olá, esta é uma notificação push de teste.");

        email.enviar(usuario1);
        sms.enviar(usuario1);
        push.enviar(usuario1);
    }
}