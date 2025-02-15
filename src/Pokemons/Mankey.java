package Pokemons;

public class Mankey extends Pokemon {

  public Mankey(){
    super(56, "Mankey", "Fighting", 20, 6, "Normal", "Ice", "Rock", null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is mankey and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
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
