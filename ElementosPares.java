import java.util.ArrayList;
import java.util.HashMap;

public class ElementosPares {
    public static <T>ArrayList<T> elementosRepetidos(ArrayList<T> lista) {
        HashMap<T, Integer> contadorElementos = new HashMap<>();

        for (T elemento : lista) {
            contadorElementos.put(elemento, contadorElementos.getOrDefault(elemento, 0));
        }

        ArrayList<T> elementosPares = new ArrayList<>();

        for (T elemento : contadorElementos) {
            if (contadorElementos.get(elemento) % 2 == 0) {
                elementosPares.add(elemento);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("A");
        lista1.add("C");
        lista1.add("C");
        lista1.add("C");
        lista1.add("C");
        System.out.println(elementosRepetidos(lista1));
    }
}
