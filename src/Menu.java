import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import Pokemons.*;

public class Menu {
  
  Scanner input = new Scanner(System.in);
  Random random = new Random();
  Pokemon pokemon1 = null;
  Pokemon pokemon2 = null;
  int sel = 0;
  int selType;
  String winner;

  public String menu(List<Pokemon> FilterP) {

    try {
      pokemon1 = FilterP.get(0);
      pokemon2 = FilterP.get(1);
    } catch (Exception e) {
      System.out.println("Something went wrong casting the list...");
    }

    while (true) {
      int enemyRandom = random.nextInt(101);
      
      if (pokemon1.getHp()<=0) {
        winner = pokemon2.getName();
        System.out.println("\n====================================================================================");
        System.out.println("\t"+pokemon2.getName()+" won!!!.");
        System.out.println("====================================================================================");
        break;
      } else if (pokemon2.getHp()<=0) {
        winner = pokemon1.getName();
        System.out.println("\n====================================================================================");
        System.out.println("\t"+pokemon1.getName()+" won!!!.");
        System.out.println("====================================================================================");
        break;
      }

      System.out.println("====================================================================================");
      System.out.println("=                                    Enemy                                         =");
      System.out.println("====================================================================================");
      System.out.println("                         "+pokemon1.getNumPokemon()+".- "+pokemon1.getName()+"  health: "+pokemon1.getHp());
      System.out.println("=  ==============================================================================  =");
      System.out.println("");
      System.out.println("====================================================================================");
      System.out.println("=                                    My pokemon                                    =");
      System.out.println("====================================================================================");
      System.out.println("                         "+pokemon2.getNumPokemon()+".- "+pokemon2.getName()+"  health: "+pokemon2.getHp());
      System.out.println("                                                                                    ");
      System.out.println("           1.- attack   2.- heal   3.- run                                          ");
      System.out.println("=  ==============================================================================  =");
      System.out.print("=  Select you next mouvement (using the numbers 1, 2 or 3): ");
      
      try {
        sel = input.nextInt();
        if (sel<1 || sel>3) {
          throw new InputMismatchException("Invalid option...");
        }
      } catch (Exception e) {
        System.out.println("You selected an invalid option, pelase select 1, 2 or 3!!");
        input.nextLine();
        continue;
      }
      
      System.out.println("=  ==============================================================================  =");
      if(sel==1) {  
        if(pokemon2.getType().contains("/")) {
          String [] splitString = pokemon2.getType().split("/");
          System.out.print("=  Select the attack type (1.- "+splitString[0]+" 2.- "+splitString[1]+"): ");
          try {
            selType = input.nextInt();
            if (sel<1 || sel>2) {
              throw new InputMismatchException("Invalid option...");
            }
          } catch (Exception e) {
            System.out.println("You selected an invalid option, pelase select 1, 2 or 3!!");
            input.nextLine();
            continue;
          }
        } else {
          System.out.print("=  Select the attack type (1.- "+pokemon2.getType()+" 2.- "+"Normal"+"): ");
          try {
            selType = input.nextInt();
            if (sel<1 || sel>2) {
              throw new InputMismatchException("Invalid option...");
            }
          } catch (Exception e) {
            System.out.println("You selected an invalid option, pelase select 1, 2 or 3!!");
            input.nextLine();
            continue;
          }
        }
      } else {selType=1;}

      if (sel == 3) {winner=pokemon1.getName();} else if (enemyRandom >95) winner=pokemon2.getName();

      System.out.println("=  ==============================================================================  =");
      System.out.println("\n\n");
      System.out.println("************************************************************************************");

      System.out.print("\tYou: ");
      try {
        if (pokemon2 instanceof BugPokemon) {
          BugPokemon bugPokemon = (BugPokemon)pokemon2;
          if (sel == 1) {
            bugPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            bugPokemon.heal();
          } else {
            bugPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof DragonPokemon) {
          DragonPokemon dragonPokemon = (DragonPokemon)pokemon2;
          if (sel == 1) {
            dragonPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            dragonPokemon.heal();
          } else {
            dragonPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof ElectricPokemon) {
          ElectricPokemon electricPokemon = (ElectricPokemon)pokemon2;
          if (sel == 1) {
            electricPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            electricPokemon.heal();
          } else {
            electricPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof FairyPokemon) {
          FairyPokemon fairyPokemon = (FairyPokemon)pokemon2;
          if (sel == 1) {
            fairyPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            fairyPokemon.heal();
          } else {
            fairyPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof FightingPokemon) {
          FightingPokemon fightingPokemon = (FightingPokemon)pokemon2;
          if (sel == 1) {
            fightingPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            fightingPokemon.heal();
          } else {
            fightingPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof FirePokemon) {
          FirePokemon firePokemon = (FirePokemon)pokemon2;
          if (sel == 1) {
            firePokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            firePokemon.heal();
          } else {
            firePokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof GhostPoisonPokemon) {
          GhostPoisonPokemon ghostPoisonPokemon = (GhostPoisonPokemon)pokemon2;
          if (sel == 1) {
            ghostPoisonPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            ghostPoisonPokemon.heal();
          } else {
            ghostPoisonPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof GrassPoisonPokemon) {
          GrassPoisonPokemon grassPoisonPokemon = (GrassPoisonPokemon)pokemon2;
          if (sel == 1) {
            grassPoisonPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            grassPoisonPokemon.heal();
          } else {
            grassPoisonPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof GroundPokemon) {
          GroundPokemon groundPokemon = (GroundPokemon)pokemon2;
          if (sel == 1) {
            groundPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            groundPokemon.heal();
          } else {
            groundPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof NormalFlyingPokemon) {
          NormalFlyingPokemon normalFlyingPokemon = (NormalFlyingPokemon)pokemon2;
          if (sel == 1) {
            normalFlyingPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            normalFlyingPokemon.heal();
          } else {
            normalFlyingPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof PsychicPokemon) {
          PsychicPokemon psychicPokemon = (PsychicPokemon)pokemon2;
          if (sel == 1) {
            psychicPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            psychicPokemon.heal();
          } else {
            psychicPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof RockGroundPokemon) {
          RockGroundPokemon rockGroundPokemon = (RockGroundPokemon)pokemon2;
          if (sel == 1) {
            rockGroundPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            rockGroundPokemon.heal();
          } else {
            rockGroundPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof WaterIcePokemon) {
          WaterIcePokemon waterIcePokemon = (WaterIcePokemon)pokemon2;
          if (sel == 1) {
            waterIcePokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            waterIcePokemon.heal();
          } else {
            waterIcePokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else if (pokemon2 instanceof WaterPokemon) {
          WaterPokemon waterPokemon = (WaterPokemon)pokemon2;
          if (sel == 1) {
            waterPokemon.attack(pokemon1, selType);
          } else if (sel == 2) {
            waterPokemon.heal();
          } else {
            waterPokemon.run();
            System.out.println(pokemon1.getName()+" won!!!");
            break;
          }
        } else {
          throw new Exception("There was an error casting the class");
        }
      } catch (Exception e) {
        System.out.println("The are problems in the casting, the exception is "+e);
        continue;
      }

      System.out.print("\tOponent: ");
      try {
        if (pokemon1 instanceof BugPokemon) {
          BugPokemon bugPokemon = (BugPokemon)pokemon1;
          if (enemyRandom <= 85) {
            bugPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            bugPokemon.heal();
          } else if (enemyRandom <=100) {
            bugPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof DragonPokemon) {
          DragonPokemon dragonPokemon = (DragonPokemon)pokemon1;
          if (enemyRandom <= 85) {
            dragonPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            dragonPokemon.heal();
          } else if (enemyRandom <=100) {
            dragonPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof ElectricPokemon) {
          ElectricPokemon electricPokemon = (ElectricPokemon)pokemon1;
          if (enemyRandom <= 85) {
            electricPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            electricPokemon.heal();
          } else if (enemyRandom <=100) {
            electricPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof FairyPokemon) {
          FairyPokemon fairyPokemon = (FairyPokemon)pokemon1;
          if (enemyRandom <= 85) {
            fairyPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            fairyPokemon.heal();
          } else if (enemyRandom <=100) {
            fairyPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof FightingPokemon) {
          FightingPokemon fightingPokemon = (FightingPokemon)pokemon1;
          if (enemyRandom <= 85) {
            fightingPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            fightingPokemon.heal();
          } else if (enemyRandom <=100) {
            fightingPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof FirePokemon) {
          FirePokemon firePokemon = (FirePokemon)pokemon1;
          if (enemyRandom <= 85) {
            firePokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            firePokemon.heal();
          } else if (enemyRandom <=100) {
            firePokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof GhostPoisonPokemon) {
          GhostPoisonPokemon ghostPoisonPokemon = (GhostPoisonPokemon)pokemon1;
          if (enemyRandom <= 85) {
            ghostPoisonPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            ghostPoisonPokemon.heal();
          } else if (enemyRandom <=100) {
            ghostPoisonPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof GrassPoisonPokemon) {
          GrassPoisonPokemon grassPoisonPokemon = (GrassPoisonPokemon)pokemon1;
          if (enemyRandom <= 85) {
            grassPoisonPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            grassPoisonPokemon.heal();
          } else if (enemyRandom <=100) {
            grassPoisonPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof GroundPokemon) {
          GroundPokemon groundPokemon = (GroundPokemon)pokemon1;
          if (enemyRandom <= 85) {
            groundPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            groundPokemon.heal();
          } else if (enemyRandom <=100) {
            groundPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof NormalFlyingPokemon) {
          NormalFlyingPokemon normalFlyingPokemon = (NormalFlyingPokemon)pokemon1;
          if (enemyRandom <= 85) {
            normalFlyingPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            normalFlyingPokemon.heal();
          } else if (enemyRandom <=100) {
            normalFlyingPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof PsychicPokemon) {
          PsychicPokemon psychicPokemon = (PsychicPokemon)pokemon1;
          if (enemyRandom <= 85) {
            psychicPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            psychicPokemon.heal();
          } else if (enemyRandom <=100) {
            psychicPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof RockGroundPokemon) {
          RockGroundPokemon rockGroundPokemon = (RockGroundPokemon)pokemon1;
          if (enemyRandom <= 85) {
            rockGroundPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            rockGroundPokemon.heal();
          } else if (enemyRandom <=100) {
            rockGroundPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof WaterIcePokemon) {
          WaterIcePokemon waterIcePokemon = (WaterIcePokemon)pokemon1;
          if (enemyRandom <= 85) {
            waterIcePokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            waterIcePokemon.heal();
          } else if (enemyRandom <=100) {
            waterIcePokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else if (pokemon1 instanceof WaterPokemon) {
          WaterPokemon waterPokemon = (WaterPokemon)pokemon1;
          if (enemyRandom <= 85) {
            waterPokemon.attack(pokemon2, random.nextInt(2)+1);
          } else if (enemyRandom <= 95) {
            waterPokemon.heal();
          } else if (enemyRandom <=100) {
            waterPokemon.run();
            System.out.println(pokemon2.getName()+" won!!!");
            break;
          }
        } else {
          throw new Exception("There was an error casting the class");
        }
      } catch (Exception e) {
        System.out.println("The are problems in the casting, the exception is "+e);
        continue;
      }

      System.out.println("************************************************************************************");
    }
    input.close();
    return winner;
  }
}