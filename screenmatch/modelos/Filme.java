package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    public String getDuracaoEmMinutos;
    private String diretor;
    private String duracaoEmMinutos;
    private String indicacao;
    private String atorIlustre;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(String duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getAtorIlustre() {
        return atorIlustre;
    }

    public void setAtorIlustre(String atorIlustre) {
        this.atorIlustre = atorIlustre;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("=== FICHA TÉCNICA DO FILME ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Diretor: " + diretor);
        System.out.println("Indicação: " + indicacao);
        System.out.println("Duração: " + duracaoEmMinutos);
        System.out.println("Ator ilustre: " + atorIlustre);
        System.out.println("Média de avaliação: " + getMediaAvaliacao());
    }

    @Override
    public int getclassificacao() {
        return (int) getMediaAvaliacao() / 2;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
