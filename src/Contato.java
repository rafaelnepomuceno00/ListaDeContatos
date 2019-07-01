
public class Contato {

    public Contato(String n, String e, String Num) {
        this.setNome(n);
        this.setEmail(e);
        this.setNumero(Num);
    }

    private String Nome;
    private String Email;
    private String Numero;

    public String getNome() {
        return Nome;
    }

    public void setNome(String N) {
        this.Nome = N;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String E) {
        this.Email = E;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Num) {
        this.Numero = Num;
    }

}
