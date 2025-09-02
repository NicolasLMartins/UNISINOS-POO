public class App {
    public static void main(String[] args) throws Exception {
        Livro l = new Livro();

        l.setCodigo(7228);
        l.setTitulo("Jogador Número 1");
        l.retira();
        l.exibeDados();
        l.devolve();
        l.exibeDados();
    }
}