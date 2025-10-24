public abstract class Hero2 implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbilityType;

    public Hero2(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    // Сеттеры (если нужны, но для примера их можно опустить)
    public void setHealth(int health) {
        this.health = health;
    }
}
