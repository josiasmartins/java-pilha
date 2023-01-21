public class Conexao implements AutoCloseable {

    public Conexao() {
        Console.logln("Abrindo conexão");
        throw new IllegalStateException();
    };

    public void leDados() {
        Console.logln("Recebendo dados");
        // indica que o objeto que está usado tem um estado inconsistente
        throw new IllegalStateException();
    }

    @Override
    public void close()  {
        Console.logln("Fechando conexão");
    }
}
