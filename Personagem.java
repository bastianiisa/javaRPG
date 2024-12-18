public interface Personagem {
    void atacar(Personagem oponente);
    void usarItem();
    void fugir();
    int getVida(); 
    void reduzirVida(int dano);
    String getNome();
}
