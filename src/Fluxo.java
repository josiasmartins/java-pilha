public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");

        try {
            metodo1();
        } catch (Exception ex) {
            // getMessage: pega a mensagem
            String msg = ex.getMessage();
            Console.logln("Exception " + msg);
            // printStackTrace: imprime a pilha de execucao
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao    {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao  {
        System.out.println("Ini do metodo2");
        //Conta c = new Conta();
        // lanca a exececao
        // throw: só funciona com execeçoes;
        throw new MinhaExcecao("deu muito errado");

        //System.out.println("Fim do metodo2");
    }
}