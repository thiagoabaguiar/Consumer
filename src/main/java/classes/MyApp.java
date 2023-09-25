package classes;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author thiagoabaguiar
 */
public class MyApp {

    public static void main(String[] args) {

        List<String> minhaLista = new LinkedList<String>();

        Consumer<String> consumidor = new ImprimeNaMesmaLinha();

        minhaLista.add("Palavra 1");
        minhaLista.add("Palavra 2");
        minhaLista.add("Palavra 3");
        minhaLista.add("Palavra 4");

        minhaLista.forEach(consumidor);
        
    }
}
