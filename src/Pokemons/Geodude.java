package Pokemons;

public class Geodude extends Pokemon {
  public Geodude() { 
    this.numPokemon = 74;
    this.name = "Geodude";
    this.type = "Rock/Ground";
    this.hp = 22;
    this.strength = 6;
    // Rock
    this.strongTo1 = "Fire";
    this.strongTo2 = "Flying";
    this.strongTo3 = "Ice";
    this.strongTo4 = "Bug";
    // Ground
    this.strongTo5 = "Poison";
    this.strongTo6 = "Rock";
    this.strongTo7 = "Electric";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is geodude and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) || typeP.contains(strongTo4) || typeP.contains(strongTo5) || typeP.contains(strongTo6) || typeP.contains(strongTo7) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is geodude and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is geodude and I run");
  }
}
