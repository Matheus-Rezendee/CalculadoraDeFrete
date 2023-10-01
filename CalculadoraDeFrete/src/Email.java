public class Email extends Notificacao {


    public Email(String mensagem) {
        super(mensagem);
    }

    public void enviar(Usuario usuario) {
        System.out.println("Enviando email para " + usuario.getEmail());
        System.out.println("Mensagem: " + getMensagem());

    }
}
