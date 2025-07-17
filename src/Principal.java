import br.com.alura.sreenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O diabo veste Prada");
        filme1.setAnoDeLancamento(2006);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(109);
        filme1.setGenero("Comédia");
        filme1.avalia(4.5);
        filme1.avalia(5.0);
        filme1.avalia(3.5);

        filme1.exibirFichaTecnica();

    }
}