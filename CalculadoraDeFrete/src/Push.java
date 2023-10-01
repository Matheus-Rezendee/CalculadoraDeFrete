public class Push extends Notificacao{

    public Push(String mensagem) {
        super(mensagem);
    }

    public void enviar(Usuario usuario) {
        System.out.println("Enviando Push para " + usuario.getNome());
        System.out.println("Mensagem: " + getMensagem());
    }

}
