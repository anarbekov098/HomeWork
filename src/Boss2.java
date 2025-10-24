public class Boss2 extends GameEntity {
    private Weapon weapon;

    public Boss2(int health, int damage) {
        super(health, damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void printInfo() {
        String weaponInfo = (weapon != null)
                ? weapon.getWeaponType() + " (" + weapon.getName() + ")"
                : "None";

        System.out.println("--- BOSS INFO ---");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon: " + weaponInfo);
    }
}

