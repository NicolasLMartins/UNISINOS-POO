public class Caneta {
    private String cor;
    private String marca;
    private double preco;
    private String ponta;

    public Caneta(String cor, String marca, String ponta) {
        this.cor = cor;
        this.marca = marca;
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setPreco(String ponta){
        this.ponta = ponta;
    }
}
