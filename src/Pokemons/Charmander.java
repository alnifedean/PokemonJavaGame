package Pokemons;

public class Charmander extends Pokemon {

  public Charmander () {
    this.numPokemon = 4;
    this.name = "Charmander";
    this.type = "Fire";
    this.hp = 17;
    this.strength = 8;
    this.strongTo1 = "Grass";
    this.strongTo2 = "Bug";
    this.strongTo3 = "Ice";
    this.strongTo4 = "Steel";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is charmander and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) || typeP.contains(strongTo4) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is charmander and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is charmander and I run");
  }

}
