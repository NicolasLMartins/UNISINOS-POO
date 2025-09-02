public class Material {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Material(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void comprarMaterial() {
        this.quantidade++;
    }

    public void venderMaterial() {
        this.quantidade--;
    }

    public void comprarMaterial(int quantidade) {
        this.quantidade += quantidade;
    }

    public void venderMaterial(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void exibirDados() {
        System.out.printf("Código: %d\nNome: %s\nPreço: R$ %.2f\nQuantidade: %d\n", codigo, nome, preco, quantidade);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f, %d", codigo, nome, preco, quantidade);
    }
}
