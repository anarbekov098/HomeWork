public class Medic extends Hero2 {
    private double healPoints;

    public Medic(int health, int damage, double healPoints) {
        super(health, damage, "HEAL TEAMMATE");
        this.healPoints = healPoints;
    }

    // Метод для увеличения опыта лечения на 10%
    public void increaseExperience() {
        // Увеличиваем healPoints на 10% (умножаем на 1.1)
        healPoints *= 1.1;
        System.out.println("Medic увеличил опыт лечения. Текущий healPoints: " + (int)healPoints);
    }

    // Геттер
    public double getHealPoints() {
        return healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность " + getSuperAbilityType() +
                " на " + (int)healPoints + " HP.");
    }
}
