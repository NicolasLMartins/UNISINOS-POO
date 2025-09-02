public class Pedido {
    private double valorTotal;
    private int totalItens;

    public void adicionarItem(double valorUnitario, int qtd) {
        this.totalItens += qtd;
        this.valorTotal += valorUnitario * qtd;
    }

    public void imprimirResumoConta() {
        System.out.printf("\nValor total: R$ %.2f\nTotal de itens: %d", this.valorTotal, this.totalItens);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getTotalItens() {
        return totalItens;
    }
}
