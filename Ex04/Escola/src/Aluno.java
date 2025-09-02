public class Aluno {
    private String nome;
    private double notaUm;
    private double notaDois;
    private double notaTres;
    private double media;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double notaUm, double notaDois, double notaTres) {
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public double getMedia() {
        return media;
    }

    public void calculaMedia() {
        this.media = (this.notaUm + this.notaDois + this.notaTres) / 3;
    }

    public void exibirDados() {
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.printf("Nota um: %.2f", this.notaUm);
        System.out.printf("\nNota dois: %.2f", this.notaDois);
        System.out.printf("\nNota três: %.2f", this.notaTres);
        System.out.printf("\nMédia: %.2f\n", this.media);
    }
}
