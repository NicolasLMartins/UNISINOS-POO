public class CalculadoraTest {
    public static void main(String[] args) throws Exception {
        Teclado input = new Teclado();
        Calculadora calc = new Calculadora();

        System.out.println("Informe dois números para somar: ");
        System.out.printf("Resultado: %.1f\n", calc.somar(input.leDouble("Primeiro número: "), input.leDouble("Segundo número: ")));
        
        System.out.println("Informe dois números para subtrair: ");
        System.out.printf("Resultado: %.1f\n", calc.subtrair(input.leDouble("Primeiro número: "), input.leDouble("Segundo número: ")));
        
        System.out.println("Informe dois números para multiplicar: ");
        System.out.printf("Resultado: %.1f\n", calc.multiplicar(input.leDouble("Primeiro número: "), input.leDouble("Segundo número: ")));
        
        System.out.println("Informe dois números para dividir: ");
        System.out.printf("Resultado: %.1f\n", calc.dividir(input.leDouble("Primeiro número: "), input.leDouble("Segundo número: ")));
    }
}
