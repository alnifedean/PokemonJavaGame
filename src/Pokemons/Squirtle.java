package Pokemons;

public class Squirtle extends Pokemon {
  
  public Squirtle() {
    this.numPokemon = 7;
    this.name = "Squirtle";
    this.type = "Water";
    this.hp = 24;
    this.strength = 4;
    this.strongTo1 = "Fire";
    this.strongTo2 = "Ground";
    this.strongTo3 = "Rock";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is squirtle and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is squirtle and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is squirtle and I run");
  }

}
