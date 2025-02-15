import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import Pokemons.*;

public class Menu {
  
  ArrayList<Pokemon> obj;
  public ArrayList<Pokemon> menu(ArrayList<Pokemon> FilterP) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    Pokemon pokemon1 = null;
    Pokemon pokemon2 = null;
    int sel = 0;

    try {
      pokemon1 = FilterP.get(0);
      pokemon2 = FilterP.get(1);
    } catch (Exception e) {
      System.out.println("Something whent wrong casting the list...");
    }



    while (true) {
      int enemyRandom = random.nextInt(101);
      
      if (pokemon1.getHp()<=0) {
        System.out.println("\n====================================================================================");
        System.out.println("\t"+pokemon2.getName()+" ha ganado.");
        System.out.println("====================================================================================");
        break;
      } else if (pokemon2.getHp()<=0) {
        System.out.println("\n====================================================================================");
        System.out.println("\t"+pokemon1.getName()+" ha ganado.");
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
      System.out.println("\n\n");
      System.out.println("************************************************************************************");
      System.out.print("\tYou: ");
      
      if (sel == 1) {
        pokemon2.attack(pokemon1);
      } else if (sel == 2) {
        pokemon2.heal();
      } else {
        pokemon2.run();
        System.out.println(pokemon1.getName()+" ha ganado.");
        break;
      }

      System.out.print("\tOponent: ");
      if (enemyRandom <= 85) {
        pokemon1.attack(pokemon2);
      } else if (enemyRandom <= 95) {
        pokemon1.heal();
      } else if (enemyRandom <=100) {
        pokemon1.run();
        System.out.println(pokemon2.getName()+" ha ganado.");
        break;
      }
      System.out.println("************************************************************************************");
      
    }
    input.close();
    return obj;
  }
}