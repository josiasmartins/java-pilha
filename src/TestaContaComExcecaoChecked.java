public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {

        Conta c = new ContaCorrente(123, 321);

        try {
            c.deposita(201);
        } catch (Exception ex) {
            Console.logln("Tratamento ...");
        }
    }
}
