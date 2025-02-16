package Pokemons;

public class Clefairy extends Pokemon {

  public Clefairy(){
    super(35, "Clefairy", "Fairy", 32, 1, "Fighting" , "Dragon", null, null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is clefairy and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      life = poke.getHp() - this.getStrength();
    }
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is clefairy and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is clefairy and I run");
  }
}
