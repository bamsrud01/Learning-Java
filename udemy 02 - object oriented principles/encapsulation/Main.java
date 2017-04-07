public class Main {

    public static void main(String[] args) {

        //  Encapsulation means that the inner workings of the class are hidden

        //  Let's make an instance of the Player class.  There is no constructor, and it is NOT encapsulated
//            Player player = new Player();
//            player.name = "Barrett";
//            player.health = 20;
//            player.weapon = "Sword";
//            int damage = 10;
//            player.loseHealth(damage);
//            System.out.println("Remaining health: " + player.healthRemaining());

        //  This class IS encapsulated, as the inner workings are inaccessible
        EnhancedPlayer player = new EnhancedPlayer("Barrett", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
