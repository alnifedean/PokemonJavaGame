package Pokemons;

public class Dratini extends Pokemon {
  public Dratini() { 
    this.numPokemon = 147;
    this.name = "Dratini";
    this.type = "Dragon";
    this.hp = 22;
    this.strength = 8;
    // Dragon
    this.strongTo1 = "Dragon";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is dratini and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is dratini and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is dratini and I run");
  }
}
