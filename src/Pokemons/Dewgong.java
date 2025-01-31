package Pokemons;

public class Dewgong extends Pokemon {
  
  public Dewgong() { 
    this.numPokemon = 87;
    this.name = "Dewgong";
    this.type = "Water/Ice";
    this.hp = 24;
    this.strength = 4;
    // Water
    this.strongTo1 = "Fire";
    this.strongTo2 = "Ground";
    this.strongTo3 = "Rock";
    // Ice
    this.strongTo4 = "Grass";
    this.strongTo5 = "Flying";
    this.strongTo6 = "Dragon";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is dewgong and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) || typeP.contains(strongTo4) || typeP.contains(strongTo5) || typeP.contains(strongTo6) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is dewgong and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is dewgong and I run");
  }
}
