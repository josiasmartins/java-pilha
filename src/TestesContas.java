public class TestesContas  {

    public static void main(String[] args) throws SaldoInsuficienteException {
        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.deposita(100);

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        Console.logln("CC: " + cc.getSaldo());
        Console.logln("CP: " + cp.getSaldo());
    }
}
