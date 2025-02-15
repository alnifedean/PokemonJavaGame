package Pokemons;

public class Geodude extends Pokemon {

  public Geodude(){
    super(74, "Geodude", "Rock/Ground", 22, 6, "Fire", "Flying", "Ice", "Bug", "Poison", "Rock", "Electric");
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is geodude and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(this.getStrongTo1()) || typeP.contains(this.getStrongTo2()) || typeP.contains(this.getStrongTo3()) || typeP.contains(this.getStrongTo4()) || typeP.contains(this.getStrongTo5()) || typeP.contains(this.getStrongTo6()) || typeP.contains(this.getStrongTo7()) ? 1 : 0;

    int life = poke.getHp() - this.getStrength() - typeDamage;
    poke.setHp(life);
  }

  @Override
  public void heal() {
    System.out.println("My name is geodude and I heal");
    this.setHp(this.getHp()+2);
  }

  @Override
  public void run() {
    System.out.println("My name is geodude and I run");
  }
}
