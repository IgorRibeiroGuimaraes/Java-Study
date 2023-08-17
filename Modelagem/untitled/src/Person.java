

public class Person {
    public String nome;
    public int idade;
    public String raca;
    public int lvl;
    public int ataque;
    public int defesa;
    public int hp;

    public Person(String nome, int idade, String raca, int lvl, int ataque, int defesa, int hp) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.lvl = lvl;
        this.ataque = ataque;
        this.defesa = defesa;
        this.hp = hp;
    }

public String Info(){
        return "Nome: " + this.nome + " Idade: " + this.idade + " Raca: " + this.raca + " Level: " + this.lvl + " Atack: " + this.ataque + " Defesa: " + this.defesa + " HP: " + this.hp;
    }












}
