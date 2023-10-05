package main.java.com.myapp.interfaces;

public interface ReprodutorMusicalInterface {
    void reproduzirMusica(String musica);
    void pausarMusica();
    void pararMusica();
    void selecionarMusica(String musica);
    void gerarListaMusicas();
    void selecionarAlbum(String album);
    void selecionarCantor(String cantor);
}