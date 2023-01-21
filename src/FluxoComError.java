public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");

        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
            // getMessage: pega a mensagem
            String msg = ex.getMessage();
            Console.logln("Exception " + msg);
            // printStackTrace: imprime a pilha de execucao
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        Console.logln("Chamando o metodo 2");
        metodo2();
        Console.logln("fim do metodo 2");
    }
}