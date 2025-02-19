package Pokemons;
import Interf.Constants;
import Interf.IIce;
import Interf.IWater;

public class WaterIcePokemon extends Pokemon implements IWater, IIce {

  public WaterIcePokemon(int numPokemon, String name, String type, int hp, int strength, String strongTo1, String strongTo2, String strongTo3, String strongTo4, String strongTo5, String strongTo6, String strongTo7){ 
      super(numPokemon, name, type, hp, strength, strongTo1, strongTo2, strongTo3, strongTo4, strongTo5, strongTo6, strongTo7);
    // super(87, "Dewgong", "Water/Ice", 24, 4, "Fire" , "Ground", "Rock", "Grass", "Flying", "Dragon", null);
  }

  @Override
  public int WaterAttack(String typeP) {
    int typeB = Constants.TYPE_BOOST;
    return typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? typeB : 0;
  }

  @Override
  public int IceAttack(String typeP) {
    int typeB = Constants.TYPE_BOOST;
    return typeP.contains(this.getStrongTo4()) || typeP.contains(this.getStrongTo5()) || typeP.contains(this.getStrongTo6()) ? typeB : 0;
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is "+this.getName()+" and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = WaterAttack(typeP);
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      int typeDamage = IceAttack(typeP);
      life = poke.getHp() - this.getStrength() - typeDamage;
    }
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is "+this.getName()+" and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is "+this.getName()+" and I run");
  }
}
