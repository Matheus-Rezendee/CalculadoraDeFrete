public class Sms extends Notificacao{


    public Sms(String mensagem) {
        super(mensagem);
    }

    public void enviar(Usuario usuario) {
        System.out.println("Enviando SMS para " + usuario.getNumeroTelefone());
        System.out.println("Mensagem: " + getMensagem());
    }
}
