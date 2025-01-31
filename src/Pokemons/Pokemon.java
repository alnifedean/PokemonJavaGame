package Pokemons;

public abstract class Pokemon {
  
  protected int numPokemon;
  protected String name;
  protected String type;
  protected int hp;
  protected int strength;
  protected String strongTo1;
  protected String strongTo2;
  protected String strongTo3;
  protected String strongTo4;
  protected String strongTo5;
  protected String strongTo6;
  protected String strongTo7;

  public Pokemon() {}

  public Pokemon( int numPokemon, String name, String type, int hp, int strength, String strongTo1, String strongTo2, String strongTo3, String strongTo4, String strongTo5, String strongTo6, String strongTo7) {
    this.numPokemon = numPokemon;
    this.name = name;
    this.type = type;
    this.hp = hp;
    this.strength = strength;
    this.strongTo1 = strongTo1;
    this.strongTo2 = strongTo2;
    this.strongTo3 = strongTo3;
    this.strongTo4 = strongTo4;
    this.strongTo5 = strongTo5;
    this.strongTo6 = strongTo6;
    this.strongTo7 = strongTo7;
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

  public void setType(String type ) {
    this.type = type;
  }
  public String getType() {
    return type;
  }

  public void setHp(int hp ) {
    this.hp = hp;
  }
  public int getHp() {
    return hp;
  }

  public void setStrength(int strength ) {
    this.strength = strength;
  }
  public int getStrength() {
    return strength;
  }
  
  public void setStrongTo1(String strongTo1 ) {
    this.strongTo1 = strongTo1;
  }
  public String getStrongTo1() {
    return strongTo1;
  }

  public void setStrongTo2(String strongTo2 ) {
    this.strongTo2 = strongTo2;
  }
  public String getStrongTo2() {
    return strongTo2;
  }

  public void setStrongTo3(String strongTo3 ) {
    this.strongTo3 = strongTo3;
  }
  public String getStrongTo3() {
    return strongTo3;
  }

  public void setStrongTo4(String strongTo4 ) {
    this.strongTo4 = strongTo4;
  }
  public String getStrongTo4() {
    return strongTo4;
  }

  public void setStrongTo5(String strongTo5 ) {
    this.strongTo5 = strongTo5;
  }
  public String getStrongTo5() {
    return strongTo5;
  }

  public void setStrongTo6(String strongTo6 ) {
    this.strongTo6 = strongTo6;
  }
  public String getStrongTo6() {
    return strongTo6;
  }

  public void setStrongTo7(String strongTo7 ) {
    this.strongTo7 = strongTo7;
  }
  public String getStrongTo7() {
    return strongTo7;
  }

  public abstract void attack(Pokemon target);
  public abstract void heal();
  public abstract void run();

}