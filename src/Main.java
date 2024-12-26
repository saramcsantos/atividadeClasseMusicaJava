public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.tituloDaMusica = "Dont't stop now!";
        music.artista = "Queen";
        music.anoDeLancamentoDaMusica = 1979;

        music.exibeFichaTecnicaMusica();

        music.registraAvaliacoesDaMusica(8);
        music.registraAvaliacoesDaMusica(9);
        music.registraAvaliacoesDaMusica(10);

        System.out.println("A média das avalições da música é: " + music.calculaAMediaDasAvaliacoes());
    }
}
