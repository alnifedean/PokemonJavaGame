package Pokemons;

public class Dewgong extends Pokemon {

  public Dewgong(){
    super(87, "Dewgong", "Water/Ice", 24, 4, "Fire" , "Ground", "Rock", "Grass", "Flying", "Dragon", null);
  }

  @Override
  public void attack(Pokemon poke, int atkTypeSel) {
    System.out.println("My name is dewgong and I attack");
    int life;
    String typeP = poke.getType();

    if(atkTypeSel==1){
      int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    } else {
      int typeDamage = typeP.contains(this.getStrongTo4()) || typeP.contains(this.getStrongTo5()) || typeP.contains(this.getStrongTo6()) ? 1 : 0;
      life = poke.getHp() - this.getStrength() - typeDamage;
    }
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is dewgong and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is dewgong and I run");
  }
}
