package Exercicio03;

// Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double numAvaliacao;



    void exibeFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliações: " + avaliacao);
        System.out.println("Qtd de avalição: " + numAvaliacao);
    }

    void avalia (double nota){
        avaliacao += nota;
        numAvaliacao ++;
    }

    double media (){
       return avaliacao/numAvaliacao;
    }

}
