package br.com.alura.screenmatch.modelos;

public abstract class Titulo {
    private String nome;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getMediaAvaliacao() {
        if (totalDeAvaliacoes == 0) return 0;
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void avaliar(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public abstract void exibirFichaTecnica();

    public double getDuracaoEmMinhutos() {
        return 0;
    }
}
