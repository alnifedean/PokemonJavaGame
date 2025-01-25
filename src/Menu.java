import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
  
  ArrayList<Pokemon> obj;
  public ArrayList<Pokemon> menu(ArrayList<Pokemon> FilterP) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    Pokemon pokemon1 = (Pokemon) FilterP.get(0);
    Pokemon pokemon2 = (Pokemon) FilterP.get(1);



    while (true) {
      int enemyRandom = random.nextInt(101);

      if (pokemon1.getHp()<=0) {
        System.out.println(pokemon2.getName()+" ha ganado.");
        break;
      } else if (pokemon2.getHp()<=0) {
        System.out.println(pokemon1.getName()+" ha ganado.");
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
      int sel = input.nextInt();
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

    return obj;
  }
}
