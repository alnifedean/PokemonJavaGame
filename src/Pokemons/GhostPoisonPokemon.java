package Pokemons;
import Interf.Constants;
import Interf.IGhost;
import Interf.IPoison;

public class GhostPoisonPokemon extends Pokemon implements IGhost, IPoison {

  public GhostPoisonPokemon(int numPokemon, String name, String type, int hp, int strength, String strongTo1, String strongTo2, String strongTo3, String strongTo4, String strongTo5, String strongTo6, String strongTo7){ 
    super(numPokemon, name, type, hp, strength, strongTo1, strongTo2, strongTo3, strongTo4, strongTo5, strongTo6, strongTo7);
    // super(92, "Gastly", "Ghost/Poison", 18, 8, "Psychic" , "Bug", "Fairy", "Grass", null, null, null);
  }

  @Override
  public int PoisonAttack(String typeP) {
    int typeB = Constants.TYPE_BOOST;
    return typeP.contains(this.getStrongTo1()) ? typeB : 0;
  }

  @Override
  public int GhostAttack(String typeP) {
    int typeB = Constants.TYPE_BOOST;
    return typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) || typeP.contains(this.getStrongTo4()) ? typeB : 0;
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is "+this.getName()+" and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = PoisonAttack(typeP);
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      int typeDamage = GhostAttack(typeP);
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
