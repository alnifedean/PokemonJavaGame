package Pokemons;

public class Dratini extends Pokemon {

  public Dratini(){
    super(147, "Dratini", "Dragon", 22, 8, "Dragon" , null, null, null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is dratini and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = typeP.contains(this.getStrongTo1()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      life = poke.getHp() - this.getStrength();
    }
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
