public class Guerreiro implements Personagem {
    private String nome;
    private int vida;
    private int forca;

    
    public Guerreiro(String nome) {
        this.nome = nome;  
        this.vida = 100;  
        this.forca = 15;   
    }
    
    @Override
    public void atacar(Personagem oponente) {
        int dano = this.forca + 15; 
        oponente.reduzirVida(dano); 
        System.out.println(this.nome + " atacou " + oponente.getNome() + " e causou " + dano + " de dano!");
    }

    @Override
    public void usarItem() {
        System.out.println(nome + " usou uma poção de cura!");
        vida += 5;
    }

    @Override
    public void fugir() {
        System.out.println(nome + " tenta fugir da batalha!");
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void reduzirVida(int dano) {
        vida -= dano;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Guerreiro " + nome + " | Vida: " + vida + " | Força: " + forca;
    }

}
