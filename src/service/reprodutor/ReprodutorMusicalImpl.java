package service.reprodutor;

import service.musica.Musica;

// service.reprodutor.ReprodutorMusicalImpl.java
public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando a música: " + musica.getTitulo());
    }
}
