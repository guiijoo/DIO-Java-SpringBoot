public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Execução da main");
        a();
        System.out.println("Finalização da main!");
    }

    static void a()
    {
        System.out.println("Execução de a");
        b();
        System.out.println("Finalização de a"); 
    }

    static void b()
    {
        System.out.println("Execução de b");
        for(int i =0; i<=4; i++) System.out.println(i);
        c();
        System.out.println("Finalização de b"); 
    }

    static void c()
    {
        System.out.println("Execução de c");
        // Thread.dumpStack();
        System.out.println("Finalização de c"); 
    }
}
    