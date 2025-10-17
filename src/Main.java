public class Main {

    // Метод для создания массива Героев
    public static Hero[] createHeroes() {
        // Создание Героя 1 (используем Конструктор №1 - все поля)
        Hero physical = new Hero(250, 20, "Critical Damage");

        // Создание Героя 2 (используем Конструктор №2 - только здоровье и урон)
        Hero magical = new Hero(270, 15);

        // Создание Героя 3 (используем Конструктор №1 - все поля)
        Hero kinetic = new Hero(290, 10, "Shield");

        // Помещаем экземпляры героев в массив
        Hero[] heroes = new Hero[]{physical, magical, kinetic};


        return heroes;
    }

    public static void main(String[] args) {



        Boss boss = new Boss();

        boss.setHealth(1000);
        boss.setDamage(60);
        boss.setDefenceType("Kinetic");


        System.out.println("--- BOSS INFO ---");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defence Type: " + boss.getDefenceType());
        System.out.println("-----------------");


        Hero[] heroesArray = createHeroes();


        System.out.println("--- HEROES INFO ---");

        for (Hero hero : heroesArray) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Superpower: " + hero.getSuperPower());
        }
        System.out.println("-------------------");
    }
}