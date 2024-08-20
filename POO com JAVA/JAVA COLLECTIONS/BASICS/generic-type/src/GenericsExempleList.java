import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        List listaSemGenerics = new ArrayList<>();
        listaSemGenerics.add("Elemento1");
        listaSemGenerics.add(10);
        listaSemGenerics.add(true);
        listaSemGenerics.add(10.45f);

        List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Elemento 1");
		listaGenerics.add("Elemento 2");
        // listaGenerics.add(10); apresenta erro por não ser do tipo string

        // Iterando sobre a lista com Generics
		for (String elemento : listaGenerics) {
			System.out.println(elemento);
		}

		// Iterando sobre a lista sem Generics (necessário fazer cast)
		for (Object elemento : listaSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
    }
}
