public class App {
    public static void main(String[] args) throws Exception {
        Teclado input = new Teclado();

        Aluno[] alunos = new Aluno[2];

        for (int i = 0; i < 2; i++) {
            String nome = input.leString("Digite o nome do aluno: ");
            double notaUm = input.leDouble("Digite a nota um do aluno: ");
            double notaDois = input.leDouble("Digite a nota dois do aluno: ");
            double notaTres = input.leDouble("Digite a nota três do aluno: ");

            alunos[i] = new Aluno(nome, notaUm, notaDois, notaTres);
        }

        System.out.println("Relatório de notas");
        System.out.println("Nome do aluno                        Notas          Média");

        for (Aluno aluno : alunos) {
            aluno.calculaMedia();
            System.out.printf(
                    "%-30s %-6.2f %-6.2f %-6.2f %5.2f%n",
                    aluno.getNome(),
                    aluno.getNotaUm(),
                    aluno.getNotaDois(),
                    aluno.getNotaTres(),
                    aluno.getMedia());
        }
    }
}
