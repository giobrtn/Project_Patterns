package noticias;

public class Main {
    public static void main(String[] args) {
        // Cria o Publisher (Sujeito)
        NoticiaPublisher noticiaPublisher = new NoticiaPublisher();

        // Cria observadores
        Observador emailObservador = new EmailObservador("usuario@exemplo.com");
        Observador smsObservador = new SmsObservador("123-456-7890");

        // Inscreve os observadores
        noticiaPublisher.inscrever(emailObservador);
        noticiaPublisher.inscrever(smsObservador);

        // Publica uma nova notícia e notifica todos os observadores
        noticiaPublisher.publicarNoticia("Novo avanço na inteligência artificial!");

        // Remove o observador de SMS
        noticiaPublisher.desinscrever(smsObservador);

        // Publica outra notícia
        noticiaPublisher.publicarNoticia("Descoberta revolucionária em biotecnologia!");
    }
}