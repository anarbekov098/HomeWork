public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero( int healthe, int damage, String superPower ){
 this.health = healthe;
 this.damage = damage;
 this.superPower = superPower;

    }
    public Hero(int health, int damage){

    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperPower() {
        return superPower;
    }
}

