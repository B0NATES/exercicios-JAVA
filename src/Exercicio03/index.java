package Exercicio03;

public class index {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.anoLancamento = 2023;
        musica1.titulo = "Teorema de carlão";
        musica1.artista = "Pedra Leticia";

        musica1.exibeFichaTecnica();
        musica1.avalia(5);
        musica1.avalia(10);
        musica1.avalia(10);

        System.out.println(musica1.media());


    }
}
