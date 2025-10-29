public class Warrior extends Hero2 {

    public Warrior(int health, int damage) {
        super(health, damage, "CRITICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность " + getSuperAbilityType());
    }
}
