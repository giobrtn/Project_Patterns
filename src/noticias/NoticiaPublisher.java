package noticias;

import java.util.ArrayList;
import java.util.List;

// Classe Publisher - Sujeito
public class NoticiaPublisher {
    private List<Observador> observadores = new ArrayList<>();
    private String noticiaAtual;


    public void inscrever(Observador observador) {
        observadores.add(observador);
    }


    public void desinscrever(Observador observador) {
        observadores.remove(observador);
    }


    public void publicarNoticia(String noticia) {
        this.noticiaAtual = noticia;
        System.out.println("Nova notícia publicada: " + noticia);
        notificarObservadores();
    }


    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(noticiaAtual);
        }
    }
}