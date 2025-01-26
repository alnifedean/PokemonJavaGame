public class Abra extends Pokemon {
  public Abra() { 
    this.numPokemon = 63;
    this.name = "Abra";
    this.type = "Psychic";
    this.hp = 22;
    this.strength = 8;
    // Psychic
    this.strongTo1 = "Fighting";
    this.strongTo2 = "Poison";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is abra and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is abra and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is abra and I run");
  }
}
