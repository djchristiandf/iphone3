package main.java.com.myapp.interfaces;

public interface AparelhoTelefonicoInterface {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
    void ligar();
    void atender();
    void iniciarCorreioVoz();
    void gerarListaContatos();
    void escolherIndividuo(String individuo);

}