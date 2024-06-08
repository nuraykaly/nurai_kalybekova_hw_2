public class Main {
    public static void main(String[] args) {
        System.out.println(permission(25, 15));
        System.out.println(permission(18, 20));
        System.out.println(permission(50, 5));
        System.out.println(permission(30, -15));
        System.out.println(permission(generateRandomAge(), 10));
    }

    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45) {
            if (temperature >= -20 && temperature <= 30) {
                return "Можно идти гулять";
            }
        } else if (age < 20) {
            if (temperature >= 0 && temperature <= 28) {
                return "Можно идти гулять";
            }
        } else if (age > 45) {
            if (temperature >= -10 && temperature <= 25) {
                return "Можно идти гулять";
            }
        }
        return "Оставайтесь дома";
    }


    public static int generateRandomAge() {
        int minAge = 1;
        int maxAge = 100;
        return minAge + (int) (Math.random() * (maxAge - minAge + 1));
    }
}
