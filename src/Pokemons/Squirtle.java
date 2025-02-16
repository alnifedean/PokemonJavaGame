package Pokemons;

public class Squirtle extends Pokemon {

  public Squirtle(){
    super(7, "Squirtle", "Water", 24, 4, "Fire", "Ground", "Rock", null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is squirtle and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      life = poke.getHp() - this.getStrength();
    }
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
