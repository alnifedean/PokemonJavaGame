public abstract class Pokemon {
  
  protected int numPokemon;
  protected String name;
  protected String type;
  protected int hp;
  protected int strength;

  public Pokemon() {}

  public Pokemon( int numPokemon, String name, String type, int hp, int strength) {
    this.numPokemon = numPokemon;
    this.name = name;
    this.type = type;
    this.hp = hp;
    this.strength = strength;
  }

  public void setNumPokemon(int numPokemon ) {
    this.numPokemon = numPokemon;
  }
  public int getNumPokemon() {
    return numPokemon;
  }

  public void setName(String name ) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  protected void setType(String type ) {
    this.type = type;
  }
  protected String getType() {
    return type;
  }

  protected void setHp(int hp ) {
    this.hp = hp;
  }
  protected int getHp() {
    return hp;
  }

  protected void setStrength(int strength ) {
    this.strength = strength;
  }
  protected int getStrength() {
    return strength;
  }
  

  public abstract void attack();
  public abstract void heal();
  public abstract void run();

}