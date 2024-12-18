public class Mago implements Personagem {
    private String nome;
    private int vida;
    private int mana;


    public Mago(String nome) {
        this.nome = nome;
        this.vida = 80;  
        this.mana = 25;  
    }

    @Override
    public void atacar(Personagem oponente) {
        int dano = 10; // Valor fixo do dano do feitiço
        oponente.reduzirVida(dano * 2); // Feitiço causa dano dobrado
        System.out.println(this.nome + " lançou um feitiço em " + oponente.getNome() 
            + " e causou " + (dano * 2) + " de dano!");
    }

    @Override
    public void usarItem() {
        System.out.println(nome + " usou uma poção de mana!");
        mana += 5;
    }

    @Override
    public void fugir() {
        System.out.println(nome + " teleporta para longe da batalha!");
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
        return "Mago " + nome + " | Vida: " + vida + " | Mana: " + mana;
    }

}
