package br.com.alura.sreenmatch.modelos;

public class Titulo  implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private String genero;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Incluído no Plano: " + (incluidoNoPlano ? "Sim" : "Não"));
        System.out.println("Total de Avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Gênero: " + genero);
    }


    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double calculaMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0; // Evita divisão por zero
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
