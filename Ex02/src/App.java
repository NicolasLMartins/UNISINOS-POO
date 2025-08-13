public class App {
    public static void main(String[] args) throws Exception {
        Caneta canetaA = new Caneta("Azul", "Bic", "Esferográfica");
        Carro carroA = new Carro();
        Retangulo r2 = new Retangulo();
        // Retangulo r2 = new Retangulo(5.0, 3.0);

        Funcionario f = new Funcionario("Fulano");

        carroA.setPlaca("ASD1234");
        carroA.setConsumoMedio(12.0);
        carroA.setNivelTanque(50.0);

        
    }
}
