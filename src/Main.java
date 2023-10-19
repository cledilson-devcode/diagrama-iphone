import service.Iphone;
import service.aparelho.AparelhoTelefonico;
import service.musica.Musica;
import service.navegador.NavegadorInternet;
import service.reprodutor.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone 12", "Preto");

        // Ligar o iPhone
        iphone.ligar();

        // Reprodutor Musical
        ReprodutorMusical reprodutorMusical = iphone.getReprodutorMusical();
        Musica musica = new Musica("Música de Exemplo", "Artista", 240);
        reprodutorMusical.selecionarMusica(musica);
        reprodutorMusical.tocar();

        // Aparelho Telefonico
        AparelhoTelefonico aparelhoTelefonico = iphone.getAparelhoTelefonico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();

        // Navegador na Internet
        NavegadorInternet navegadorInternet = iphone.getNavegadorInternet();
        navegadorInternet.exibirPagina("https://www.exemplo.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        // Desligar o iPhone
        iphone.desligar();
    }
}
