package Pokemons;

public class Sandshrew extends Pokemon {

  public Sandshrew(){
    super(27, "Sandshrew", "Ground", 28, 2, "Electric" , "Fire", "Poison", "Rock", null, null, null);
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is sandshrew and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) || typeP.contains(this.getStrongTo4()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
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
