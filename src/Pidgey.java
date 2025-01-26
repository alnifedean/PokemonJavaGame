public class Pidgey extends Pokemon {
  public Pidgey() { 
    this.numPokemon = 16;
    this.name = "Pidgey";
    this.type = "Normal/Flying";
    this.hp = 20;
    this.strength = 8;
    // Flying
    this.strongTo1 = "Grass";
    this.strongTo2 = "Bug";
    this.strongTo3 = "Fighting";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is pidgey and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is pidgey and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is pidgey and I run");
  }
}
