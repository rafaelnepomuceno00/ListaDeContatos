package newpackage;


//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class TestaSet {
    public static void main(String[] args){
        Set<String> Gruposeminario = new HashSet<>();
        Gruposeminario.add("Carla");
        Gruposeminario.add("Elvis");
        Gruposeminario.add("Petronio");
        Gruposeminario.add("Rafael");
        Gruposeminario.add("Samuel");
        Gruposeminario.add("Carla");//repetido
        
        System.out.println(Gruposeminario);
        Gruposeminario.remove("Rafael");
        System.out.println(Gruposeminario);
        System.out.println(Gruposeminario.size());
        
    }
}
