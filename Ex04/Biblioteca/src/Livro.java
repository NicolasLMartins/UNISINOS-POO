public class Livro {
    private int codigo;
    private String titulo;
    private boolean isRetirado = false;

    public Livro() {
    }

    public Livro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public void retira() {
        this.isRetirado = true;
    }

    public void devolve() {
        this.isRetirado = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibeDados() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Situação: " + (isRetirado ? "Retirado" : "Disponível"));
    }
}