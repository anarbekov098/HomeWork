import java.util.Random;

public class MiniGame {
    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String bossDefence;
    // Добавлен 4-й элемент для Медика
    public static int[] heroesHealth = {290, 270, 250, 220};
    public static int[] heroesDamage = {20, 15, 10, 0}; // Медик не наносит урон
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Medic"};
    public static int roundNumber;
    public static String message;

    // Новая константа для лечения
    public static final int MEDIK_HEAL_AMOUNT = 30;
    // Индекс Медика в массивах (последний элемент)
    public static final int MEDIK_INDEX = 3;

    public static void main(String[] args) {
        printStatistics();
        while (!isGameOver()) {
            playRound();
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        // Проверяем всех, включая Медика
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        bossAttacks();
        heroesAttack();
        // Новый метод, вызываемый после атаки
        medikHeals();
        printStatistics();
    }

    public static void chooseBossDefence() {
        Random random = new Random();
        // Включаем Медика в расчет защиты, хотя он не атакует (не влияет на логику)
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefence = heroesAttackType[randomIndex];
    }

    public static void heroesAttack() {
        message = null;
        for (int i = 0; i < heroesDamage.length; i++) {
            // Медик (heroesDamage[3] == 0) пропускает атаку, но логика остается общей
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                int damage = heroesDamage[i];
                if (bossDefence.equals(heroesAttackType[i])) { // Исправлено сравнение строк
                    Random random = new Random();
                    int coefficient = random.nextInt(9) + 2; // [2, 10]
                    damage = damage * coefficient;
                    message = heroesAttackType[i] + " critical damage: " + damage;
                }

                bossHealth = bossHealth - damage;
                if (bossHealth < 0) {
                    bossHealth = 0;
                }
            }
        }
    }

    // НОВАЯ ФУНКЦИЯ: Логика лечения Медиком
    public static void medikHeals() {
        // Проверка: Медик может лечить, только если он сам жив
        if (heroesHealth[MEDIK_INDEX] > 0) {

            int targetIndex = -1; // Индекс героя, которого будем лечить

            // 1. Поиск первого героя, который нуждается в лечении (здоровье < 100)
            for (int i = 0; i < heroesHealth.length; i++) {
                // Медик не лечит:
                // 1. себя самого (i != MEDIK_INDEX)
                // 2. мертвых (heroesHealth[i] > 0)
                // 3. героев с достаточным здоровьем (heroesHealth[i] < 100)
                if (i != MEDIK_INDEX && heroesHealth[i] > 0 && heroesHealth[i] < 100) {
                    targetIndex = i;
                    // Медик лечит только одного, поэтому сразу прерываем поиск
                    break;
                }
            }

            // 2. Если цель найдена, проводим лечение
            if (targetIndex != -1) {
                heroesHealth[targetIndex] += MEDIK_HEAL_AMOUNT;
                // Опционально: вывод сообщения о лечении
                System.out.println("MEDIK healed " + heroesAttackType[targetIndex] +
                        " by " + MEDIK_HEAL_AMOUNT);
            }
        }
    }

    public static void bossAttacks() {
        // Медик получает урон, как и все остальные, т.к. он включен в heroesHealth.
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                heroesHealth[i] = heroesHealth[i] - bossDamage;
                if (heroesHealth[i] < 0) {
                    heroesHealth[i] = 0;
                }
            }
        }
    }

    public static void printStatistics() {
        System.out.println("ROUND " + roundNumber + " ------------------");
        System.out.println("Boss health: " + bossHealth + " damage: " + bossDamage +
                " defence: " + (bossDefence == null ? "No defence" : bossDefence));
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] +
                    " health: " + heroesHealth[i] +
                    " damage: " + heroesDamage[i]);
        }
        if (message != null) {
            System.out.println(message);
        }
    }
}
