public class Bulbasaur extends Pokemon {
  
  public Bulbasaur() { 
    this.numPokemon = 1;
    this.name = "Bulbasaur";
    this.type = "Grass/Poison";
    this.hp = 28;
    this.strength = 2;
    // Grass
    this.strongTo1 = "Water";
    this.strongTo2 = "Ground";
    this.strongTo3 = "Rock";
    // Posion
    this.strongTo4 = "Grass";
    this.strongTo5 = "Fairy";
  }

  @Override
  public void attack(Pokemon poke) {
    System.out.println("My name is bulbasaur and I attack");
    String typeP = poke.getType();

    int typeDamage = typeP.contains(strongTo1) || typeP.contains(strongTo2) || typeP.contains(strongTo3) || typeP.contains(strongTo4) || typeP.contains(strongTo5) ? 1 : 0;

    int life = poke.getHp() - this.strength - typeDamage;
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