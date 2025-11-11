package br.com.alura.screenmatch.calculos;


import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private String tempoTotal;

    public String getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
//}

public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinhutos();
    }
}
