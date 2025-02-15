package Pokemons;
import Interf.AttackFire;

public class Charmander extends Pokemon implements AttackFire {

  public Charmander(){
    super(4, "Charmander", "Fire", 17, 8, "Grass" , "Bug", "Ice", "Steel", null, null, null);
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is charmander and I attack");
    String typeP = poke.getType();
    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) || typeP.contains(this.getStrongTo4()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void Flamethrower() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Flamethrower'");
  }

  @Override
  public void heal() {
    System.out.println("My name is charmander and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is charmander and I run");
  }


}
