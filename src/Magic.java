public class Magic extends Hero2 {

    public Magic(int health, int damage) {
        super(health, damage, "FIREBALL");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность " + getSuperAbilityType());
    }
}
