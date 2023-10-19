package service.aparelho;

// service.aparelho.AparelhoTelefonicoImpl.java
public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Chamada iniciada.");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
