package Pokemons;

public class Pikachu extends Pokemon {

  public Pikachu(){
    super(25, "Pikachu", "Electric", 20, 6, "Water" , "Flying", null, null, null, null, null);
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    int life;
    String typeP = poke.getType();
    
    if(atkTypeSel==1){
      int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
      System.out.println("My name is pikachu and I attack");
    } else {
      life = poke.getHp() - this.getStrength();
    }
    poke.setHp(life);
    System.out.println("My name is pikachu and I attack");
  }

  @Override
  public void heal() {
    System.out.println("My name is pikachu and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is pikachu and I run");
  }


}
