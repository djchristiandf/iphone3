package main.java.com.myapp.interfaces;

public interface NavegadorInternetInterface {
    void navegarPara(String url);
    void voltar();
    void avancar();
    void exibirPagina(String pagina);
    void adicionarNovaAba(String pagina);
    void atualizarPagina();
    void gerarListaPaginas();
    void selecionarPagina(String pagina);
}