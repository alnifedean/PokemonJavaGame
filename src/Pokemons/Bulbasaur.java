package Pokemons;

public class Bulbasaur extends Pokemon {

  public Bulbasaur(){
    super(1, "Bulbasaur", "Grass/Poison", 28, 2, "Water" , "Ground", "Rock", "Grass", "Fairy", null, null);
  }
  

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is bulbasaur and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      int typeDamage = typeP.contains(this.getStrongTo4()) || typeP.contains(this.getStrongTo5()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    }
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is bulbasaur and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is bulbasaur and I run");
  }
}