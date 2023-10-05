package main.java;

import main.java.com.myapp.classes.AparelhoTelefonico;
import main.java.com.myapp.classes.NavegadorInternet;
import main.java.com.myapp.classes.ReprodutorMusical;
import main.java.com.myapp.interfaces.AparelhoTelefonicoInterface;
import main.java.com.myapp.interfaces.NavegadorInternetInterface;
import main.java.com.myapp.interfaces.ReprodutorMusicalInterface;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do ReprodutorMusical
        ReprodutorMusicalInterface reprodutor = new ReprodutorMusical();
        reprodutor.selecionarAlbum("Album 1");
        reprodutor.selecionarCantor("Cantor 1");
        reprodutor.selecionarMusica("Música 1");
        reprodutor.reproduzirMusica("Música 1");
        reprodutor.pausarMusica();
        reprodutor.pararMusica();
        reprodutor.gerarListaMusicas();

        // Criando uma instância do NavegadorInternet
        NavegadorInternetInterface navegador = new NavegadorInternet();
        navegador.navegarPara("https://www.example.com");
        navegador.voltar();
        navegador.avancar();
        navegador.adicionarNovaAba("https://www.example.com");
        navegador.selecionarPagina("https://www.example.com");
        navegador.exibirPagina("https://www.example.com");
        navegador.atualizarPagina();
        navegador.gerarListaPaginas();

        // Criando uma instância do AparelhoTelefonico
        AparelhoTelefonicoInterface telefone = new AparelhoTelefonico();
        telefone.ligar();
        telefone.fazerChamada("123456789");
        telefone.receberChamada("987654321");
        telefone.atender();
        telefone.encerrarChamada();
        telefone.iniciarCorreioVoz();
        telefone.gerarListaContatos();
        telefone.escolherIndividuo("Indivíduo 1");
    }
}
