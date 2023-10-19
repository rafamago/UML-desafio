package model;

import funcionalidades.aparelhoTelefonico.AparelhoTelefonico;
import funcionalidades.navegadorNaInternet.NavegadorNaInternet;
import funcionalidades.reprodutorMusical.ReprodutorMusical;

public class Iphone implements NavegadorNaInternet, AparelhoTelefonico, ReprodutorMusical {
    String proprietarioDoAparelho = "Rafa";
    String modelo = "17";
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        System.out.println(">> Funcoes de serviço de telefonia:");
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.atender();
        System.out.println(" ");
        System.out.println(">> Funcoes de serviço de navegador de internet:");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        System.out.println(" ");
        System.out.println(">> Funcoes de serviço de reproducao de músicas:");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        System.out.println(" ");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
}