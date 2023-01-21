public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200);
       // com tratamento
        try {
            conta.saca(200.20);
        } catch (SaldoInsuficienteException ex) {
            Console.logln("Ex: " + ex.getMessage());
        }

        Console.logln(conta.getSaldo());
    }

}
