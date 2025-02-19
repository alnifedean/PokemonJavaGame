package Pokemons;
import Interf.Constants;
import Interf.IFly;

public class NormalFlyingPokemon extends Pokemon implements IFly {

  public NormalFlyingPokemon(int numPokemon, String name, String type, int hp, int strength, String strongTo1, String strongTo2, String strongTo3, String strongTo4, String strongTo5, String strongTo6, String strongTo7){ 
    super(numPokemon, name, type, hp, strength, strongTo1, strongTo2, strongTo3, strongTo4, strongTo5, strongTo6, strongTo7);
    // super(16, "Pidgey", "Normal/Flying", 20, 8, "Grass" , "Bug", "Fighting", null, null, null, null);
  }

  @Override
  public int FlyAttack(String typeP) {
    int typeB = Constants.TYPE_BOOST;
    return typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? typeB : 0;
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is "+this.getName()+" and I attack");
    int life;
    String typeP = poke.getType();
    
    if(atkTypeSel==1){
      life = poke.getHp() - this.getStrength();
    } else {
      int typeDamage = FlyAttack(typeP);
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
