public class Bulbasaur extends Pokemon {
  
  public Bulbasaur() { 
    this.numPokemon = 1;
    this.name = "Bulbasaur";
    this.type = "Grass/Poison";
    this.hp = 28;
    this.strength = 2;
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is bulbasaur and I attack");
    int life = poke.getHp()- this.strength;
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


