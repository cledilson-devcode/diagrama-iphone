package service.reprodutor;

import service.musica.Musica;

// service.reprodutor.ReprodutorMusical.java
public interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(Musica musica);
}
