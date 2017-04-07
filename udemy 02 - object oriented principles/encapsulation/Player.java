public class Player {

    //  These three fields are 'public' rather than 'private'
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player is knocked out!");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
