public class EnhancedPlayer {

    //  These fields are private
    private String name;
    private int health = 100;
    private String weapon;

    //  Constructor
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        //  Ensure that health is between 0 and 200 when initialized.  Otherwise, use default value of health
        if (health > 0 && health <= 200) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player is knocked out!");
        }
    }

    public int getHealth() {
        return health;
    }
}
