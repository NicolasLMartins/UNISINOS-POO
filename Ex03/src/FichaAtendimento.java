public class FichaAtendimento {
    private int qtdClientes = 0;

    public void adicionarCliente() {
        this.qtdClientes++;
    }

    public void atenderCliente() {
        if (!this.verificarFilaVazia()) {
            this.qtdClientes--;
        }
    }

    public boolean verificarFilaVazia() {
        return !(this.qtdClientes > 0);
    }

    public void imprimeTamanhoFila() {
        System.out.printf("Número de clientes na fila: %d\n", this.qtdClientes);
    }
    
    public int getQtdClientes() {
        return qtdClientes;
    }
}
