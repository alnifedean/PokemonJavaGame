public class Bulbasaur extends Pokemon {
  
  public Bulbasaur() { 
    this.numPokemon = 1;
    this.name = "bulbasaur";
    this.type = "planta";
    this.hp = 14;
    this.strength = 1;
  }

  @Override
  public void attack() {
    System.out.println("Me llamo bulbasaur y ataco");
  }

  @Override
  public void heal() {
    System.out.println("Me llamo bulbasaur y me curo");
  }

  @Override
  public void run() {
    System.out.println("Me llamo bulbasaur y huyo");
  }
}


