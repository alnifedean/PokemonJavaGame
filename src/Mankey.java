public class Mankey extends Pokemon {
  public Mankey() { 
    this.numPokemon = 56;
    this.name = "Mankey";
    this.type = "Fighting";
    this.hp = 20;
    this.strength = 6;
    // Fighting
    this.strongTo1 = "Normal";
    this.strongTo2 = "Ice";
    this.strongTo3 = "Rock";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is mankey and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is mankey and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is mankey and I run");
  }
}
