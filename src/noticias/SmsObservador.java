package noticias;

// Implementação do Observador para notificação via SMS
public class SmsObservador implements Observador {
    private String numero;

    public SmsObservador(String numero) {
        this.numero = numero;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println("Enviando SMS para " + numero + ": Nova notícia - " + noticia);
    }
}