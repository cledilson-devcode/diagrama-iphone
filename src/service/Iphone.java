package service;

import service.aparelho.AparelhoTelefonico;
import service.aparelho.AparelhoTelefonicoImpl;
import service.navegador.NavegadorInternet;
import service.navegador.NavegadorInternetImpl;
import service.reprodutor.ReprodutorMusical;
import service.reprodutor.ReprodutorMusicalImpl;

// service.Iphone.java
public class Iphone {
    private String modelo;
    private String cor;
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
    }

    public void ligar() {
        System.out.println("service.Iphone ligado.");
    }

    public void desligar() {
        System.out.println("service.Iphone desligado.");
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}

