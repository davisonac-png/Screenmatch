package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Carga Explosiva 3");
        meuFilme.setAnoDeLancamento(2008);
        meuFilme.setDiretor("Louis Leterrier");
        meuFilme.setIndicacao(String.valueOf(14)); // antes: "14 anos"
        meuFilme.setDuracaoEmMinutos(String.valueOf(104)); // antes: "104 minutos"
        meuFilme.setAtorIlustre("Jason Statham");

        meuFilme.avaliar(7.0);
        meuFilme.avaliar(8);
        meuFilme.avaliar(3);
        meuFilme.avaliar(5);
        meuFilme.avaliar(6);
        meuFilme.avaliar(9);

        meuFilme.exibirFichaTecnica();

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliação: " + meuFilme.getMediaAvaliacao());

        System.out.println("\n-------------------------\n");

        Serie suits = new Serie();
        suits.setNome("Suits");
        suits.setAnoDeLancamento(2011);
        suits.setTemporadas(9);
        suits.setEpisodiosPorTemporada(16);
        suits.setMinutosPorEpisodio(45);
        suits.setClassificacao(String.valueOf(14)); // antes: "14 anos"
        suits.setGenero("Drama");

        suits.exibirFichaTecnica();
        System.out.println("Duração total para maratonar: " + suits.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(suits);
        episodio.setTotalVisualizacoes(52);
        filtro.filtra(episodio);
    }
}
