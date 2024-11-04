package noticias;

// Implementação do Observador para notificação via e-mail
public class EmailObservador implements Observador {
    private String email;

    public EmailObservador(String email) {
        this.email = email;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("Enviando email para " + email + ": Nova notícia - " + noticia);
    }
}