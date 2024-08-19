public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(123);
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(13);
        somaNumeros.adicionarNumero(43);
        
        System.out.println(somaNumeros.calcularSoma());
        
        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    
    }
}
