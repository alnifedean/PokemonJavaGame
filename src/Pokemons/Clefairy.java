package Pokemons;

public class Clefairy extends Pokemon{
  public Clefairy() { 
    this.numPokemon = 35;
    this.name = "Clefairy";
    this.type = "Fairy";
    this.hp = 32;
    this.strength = 1;
    // Fairy
    this.strongTo1 = "Fighting";
    this.strongTo2 = "Dragon";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is clefairy and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is clefairy and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is clefairy and I run");
  }
}
