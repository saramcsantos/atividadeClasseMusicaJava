public class Music {
    String tituloDaMusica;
    String artista;
    int anoDeLancamentoDaMusica;
    double somaDasAvaliacoesDaMusica;
    int quantidadeDeAvaliacoesDaMusica;

    void exibeFichaTecnicaMusica(){
        System.out.println("Título da música: " + tituloDaMusica);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamentoDaMusica);
    }

    double registraAvaliacoesDaMusica(double nota){
        somaDasAvaliacoesDaMusica += nota;
        quantidadeDeAvaliacoesDaMusica++;
        return somaDasAvaliacoesDaMusica;
    }

    double calculaAMediaDasAvaliacoes(){
        if(quantidadeDeAvaliacoesDaMusica == 0){
            return 0;
        }
        return somaDasAvaliacoesDaMusica / quantidadeDeAvaliacoesDaMusica;
    }
}
