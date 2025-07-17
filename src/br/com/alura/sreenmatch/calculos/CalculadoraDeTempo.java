package br.com.alura.sreenmatch.calculos;
import br.com.alura.sreenmatch.modelos.Titulo;


public class CalculadoraDeTempo {
    private int calculaTempo;

    public int getCalculaTempo() {
        return this.calculaTempo;
    }

    public void inclui(Titulo titulo) {
        this.calculaTempo += titulo.getDuracaoEmMinutos();
    }

}

