public class App {
    public static void main(String[] args) throws Exception {
        
        Bulbasaur bulba = new Bulbasaur(1, "bulbasaur", "planta", 14, 1);
        Charmander charm = new Charmander(2, "charmander", "fuego", 8, 4);
        Squirtle vamoACalmarno = new Squirtle(3, "squirtle", "agua", 12, 2);
        Pikachu pika = new Pikachu(4, "pikachu", "electrico", 10, 3);

        

        System.out.println(bulba.getName());
        System.out.println(charm.getHp());
        System.out.println(vamoACalmarno.getStrength());
        System.out.println(pika.getType());


        pika.attack();
        vamoACalmarno.heal();
        charm.run();
    }
}
