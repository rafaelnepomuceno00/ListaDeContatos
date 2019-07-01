
import java.util.ArrayList;
import java.util.Collections;

public class ListaDeContatos {

    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        Contato c1 = new Contato("Rafael", "rafaelnepomuceno00@gmail.com", "991624199");
        Contato c2 = new Contato("Carla", "carla.rafa@gmail.com", "981447561");
        Contato c3 = new Contato("Samuel", "samuel@gmail.com", "9587413548");
        Contato c4 = new Contato("Petronio", "petronio@gmail.com", "9154896320");

        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);
        contatos.add(c4);

        for (Contato c : contatos) {
            System.out.println("Nome:" + c.getNome() + "\nE-mail:" + c.getEmail() + "\nNum:" + c.getNumero());

        }
        //System.out.println("Total de contatos: " +contatos.size());

        // System.out.println(contatos.contains(c2));
        // contatos.remove(c2);        
        // System.out.println(contatos.contains(c2)); 
    }

}
