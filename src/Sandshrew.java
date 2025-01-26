public class Sandshrew extends Pokemon {
  
  public Sandshrew() { 
    this.numPokemon = 1;
    this.name = "Sandshrew";
    this.type = "Ground";
    this.hp = 28;
    this.strength = 2;
    // Ground
    this.strongTo1 = "Electric";
    this.strongTo2 = "Fire";
    this.strongTo3 = "Poison";
    this.strongTo4 = "Rock";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is sandshrew and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) || typeP.contains(strongTo4) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is sandshrew and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is sandshrew and I run");
  }
}
