package br.com.alura.sreenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Recomendamos fortemente!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Recomendamos com ressalvas.");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
