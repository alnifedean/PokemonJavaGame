package Pokemons;

public class Squirtle extends Pokemon {

  public Squirtle(){
    super(7, "Squirtle", "Water", 24, 4, "Fire", "Ground", "Rock", null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is squirtle and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is squirtle and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is squirtle and I run");
  }

}
