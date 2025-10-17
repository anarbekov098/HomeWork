public class Boss {
    private int health;
    private int damage;
    private String defenceType;

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

