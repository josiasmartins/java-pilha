public class TestaConexao {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao() ) {
            conexao.leDados();
        } catch (IllegalStateException ex) {
            Console.logln("Deu erro na conexão");
        }


//        // ------------------------------
//        Conexao con = null;
//
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex) {
//            Console.logln("Deu erro na conexão");
//        } finally {
//            Console.logln("finally");
//            if (con != null) {
//                con.close();
//            }
//        }
    }

}
