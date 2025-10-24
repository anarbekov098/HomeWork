public class Skeleton extends Boss2 {

    private int arrowsCount;


    public Skeleton(int health, int damage, int arrowsCount) {
        super(health, damage);
        this.arrowsCount = arrowsCount;
    }


    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }


    @Override
    public void printInfo() {

        System.out.println("--- SKELETON INFO ---");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());


        Weapon weapon = getWeapon();
        String weaponInfo = (weapon != null)
                ? weapon.getWeaponType() + " (" + weapon.getName() + ")"
                : "None";
        System.out.println("Weapon: " + weaponInfo);


        System.out.println("Arrows: " + arrowsCount);
    }
}
