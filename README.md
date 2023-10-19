# Desafio Diagramação de Classes do iPhone

Este projeto representa a modelagem e a implementação básica do componente iPhone, que inclui funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. 


## Diagrama de Classes
```mermaid
classDiagram
    class Iphone {
        - String modelo
        - String cor
        - ReprodutorMusical reprodutorMusical
        - AparelhoTelefonico aparelhoTelefonico
        - NavegadorInternet navegadorInternet
        + ligar()
        + desligar()
    }

    class ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(Musica musica)
    }

    class AparelhoTelefonico {
        + ligar()
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class Musica {
        - String titulo
        - String artista
        - int duracao
        + Musica(String titulo, String artista, int duracao)
        + getTitulo()
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
    ReprodutorMusical --> Musica
    NavegadorInternet --> Musica
```
