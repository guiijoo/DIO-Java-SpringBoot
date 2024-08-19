public class Main {

    public static void main(String[] args) {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Rei de pratania", "guiijoo", 2024);
        catalogoLivros.adicionarLivro("Amor in sexto lugar", "Carlos Gomes Tavares", 2023);
        catalogoLivros.adicionarLivro("Aguas primordiais", "guiijoo", 2020);
        catalogoLivros.adicionarLivro("O Retorno do Rei", "nig prod", 1946);
        catalogoLivros.adicionarLivro("Familia JM", "The simios", 2019);

        System.out.println(catalogoLivros.pesquisarPorAutor("guiijoo"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2023, 2048));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1940, 2020));

        System.out.println(catalogoLivros.pesquisarPorTitulo("rei de pratania"));

        System.out.println(catalogoLivros.exibirLivros());
    }
}