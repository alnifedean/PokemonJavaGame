public class Gastly extends Pokemon {
  public Gastly() { 
    this.numPokemon = 92;
    this.name = "Gastly";
    this.type = "Ghost/Poison";
    this.hp = 18;
    this.strength = 8;
    // Ghost
    this.strongTo1 = "Psychic";
    // Posion
    this.strongTo2 = "Bug";
    this.strongTo3 = "Fairy";
    this.strongTo4 = "Grass";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is gastly and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) || typeP.contains(strongTo4) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is gastly and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is gastly and I run");
  }
}
