public class Usuario {

    private String nome;
    private String email;
    private String numeroTelefone;

    public Usuario(String nome, String email, String numeroTelefone) {
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }
}
