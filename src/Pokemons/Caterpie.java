package Pokemons;

public class Caterpie extends Pokemon {
  public Caterpie() { 
    this.numPokemon = 1;
    this.name = "Caterpie";
    this.type = "Bug";
    this.hp = 28;
    this.strength = 2;
    // Grass
    this.strongTo1 = "Grass";
    this.strongTo2 = "Psychic";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is caterpie and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is caterpie and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is caterpie and I run");
  }
}
