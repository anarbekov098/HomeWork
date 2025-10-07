
    import java.util.Random;

    public class WeatherApp {

        public static int generateRandomAge() {

            Random random = new Random();
            return random.nextInt(100) + 1;
        }


        public static String permission(int age, int temperature) {


            String result = "Оставайтесь дома";


            if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
                result = "Можно идти гулять";
            }

            else if (age < 20 && temperature >= 0 && temperature <= 28) {
                result = "Можно идти гулять";
            }

            else if (age > 45 && temperature >= -10 && temperature <= 25) {
                result = "Можно идти гулять";
            }

            return result;
        }


        public static void main(String[] args) {


            System.out.println("1. 30 лет, 15°C: " + permission(30, 15));
            System.out.println("2. 12 лет, 20°C: " + permission(12, 20));
            System.out.println("3. 55 лет, -5°C: " + permission(55, -5));
            System.out.println("4. 30 лет, 35°C (слишком жарко): " + permission(30, 35));
            System.out.println("5. 12 лет, -5°C (слишком холодно): " + permission(12, -5));


            int randomAge1 = generateRandomAge();
            System.out.println("6. Случайный возраст: " + randomAge1 + ", Температура: 10°C. -> " + permission(randomAge1, 10));

            System.out.println("7. Случайный возраст: " + generateRandomAge() + ", Температура: 35°C. -> " + permission(generateRandomAge(), 35));

        }
    }

