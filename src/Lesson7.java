public class Lesson7 {
    public static void main(String[] args) {

        // 1. Создание 3-х разных героев
        Hero2 warrior = new Warrior(250, 20);
        Hero2 magic = new Magic(200, 25);
        // Создаем Медика с начальными 50 очками лечения
        Hero2 medic = new Medic(180, 5, 50.0);

        // 2. Создание массива из 3-х героев (полиморфизм: Hero[] содержит объекты подклассов)
        Hero2[] heroes = {warrior, magic, medic};

        System.out.println("--- Фаза применения суперспособностей и опыта ---");

        // 3. Цикл для применения суперспособности и увеличения опыта
        for (Hero2 hero : heroes) {

            // Применяем суперспособность (полиморфизм - вызывается метод подкласса)
            hero.applySuperAbility();

            // Проверяем, является ли текущий герой Медиком, и увеличиваем его опыт
            if (hero instanceof Medic) {
                // ПРИВЕДЕНИЕ ТИПОВ (Type Casting):
                // Преобразуем ссылку типа Hero к типу Medic, чтобы получить доступ к его уникальному методу.
                Medic medicAbility = (Medic) hero;
                medicAbility.increaseExperience();
            }
        }
    }
}
