# Desafio Diagramação de Classes do iPhone

Este projeto representa a modelagem e a implementação básica do componente iPhone, que inclui funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. 


## Diagrama de Classes
```mermaid
classDiagram
    class Iphone {
        + String modelo
        + String cor
        + ReprodutorMusical reprodutorMusical
        + AparelhoTelefonico aparelhoTelefonico
        + NavegadorInternet navegadorInternet
        --
        + ligar()
        + desligar()
    }

    interface ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        + ligar()
        + atender()
        + iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

```
