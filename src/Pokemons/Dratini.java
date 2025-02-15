package Pokemons;

public class Dratini extends Pokemon {

  public Dratini(){
    super(147, "Dratini", "Dragon", 22, 8, "Dragon" , null, null, null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is dratini and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is dratini and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is dratini and I run");
  }
}
