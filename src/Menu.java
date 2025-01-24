import java.util.Random;
import java.util.Scanner;

public class Menu {
  
  Pokemon obj;
  public Pokemon menu(Pokemon pokemon1, Pokemon pokemon2) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
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
      System.out.println("                                     Enemy");
      System.out.println("=  ==============================================================================  =");
      System.out.println("                         "+pokemon1.getNumPokemon()+".- "+pokemon1.getName()+"  vida: "+pokemon1.getHp());
      System.out.println("=  ==============================================================================  =");
      System.out.println("");
      System.out.println(" You used: attack   your hp is: x    //////////    Enemy used heal  Enemies hp is: x");
      System.out.println("");
      System.out.println("=  ==============================================================================  =");
      System.out.println("                                     My pokemon");
      System.out.println("=  ==============================================================================  =");
      System.out.println("                         "+pokemon2.getNumPokemon()+".- "+pokemon2.getName()+"  vida: "+pokemon2.getHp());
      System.out.println("                                                                                    ");
      System.out.println("           1.- attack   2.- heal   3.- run                                          ");
      System.out.println("=  ==============================================================================  =");
      System.out.print("Elige tu proximo movimiento (usando los numeros): ");
      int sel = input.nextInt();
      System.out.println("====================================================================================");
  
      if (sel == 1) {
        pokemon2.attack();
        pokemon1.setHp(pokemon1.getHp()-pokemon2.getStrength());
      } else if (sel == 2) {
        pokemon2.heal();
        pokemon2.setHp(pokemon2.getHp()+2);
      } else {
        pokemon2.run();
      }
  
      if (enemyRandom <= 85) {
        pokemon1.attack();
        pokemon2.setHp(pokemon2.getHp()-pokemon1.getStrength());
      } else if (enemyRandom <= 95) {
        pokemon1.heal();
        pokemon1.setHp(pokemon1.getHp()+2);
      } else if (enemyRandom <=100) {
        pokemon2.run();
      }
      System.out.println(enemyRandom);
      System.out.println("\n");
      System.out.println("\n");
    }

    return obj;
  }
}
