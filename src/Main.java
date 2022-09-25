public class Main {
    public static void task(String number) {
        System.out.println();
        System.out.println("Задание " + number);
    }
    public static void leapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.printf("Год %d является високосным\n",a);
        } else {
            System.out.printf("Год %d не високосный\n",a);
        }
    }

    public static void clientOS(int c, int y) {
        if (c == 0 && y <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (c == 0 && y > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (c == 1 && y <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static int deliveryDay(int distance) {
        if (distance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) distance / 40) + 1;
        }
    }

    public static char reverse(char [] reverseFullName) {
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        return 0;
    }

    public static void duplicate (String s) {
        char c = Character.MIN_VALUE;
        for (char simbol : s.toCharArray()) {
            if (simbol == c) {
                System.out.println("Дубликат: " + c);
                break;
            }
            c = simbol;
        }
    }
    public static int [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] rand = new int[30];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = random.nextInt(100_000) + 100_000;
        }
        return rand;
    }

    public static double mean (int[] rand) {
        int sum = 0;
        for (int element : rand) {
            sum += element;
        }
        return (double) sum / rand.length;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        task("1");
        int year = 2022;
        leapYear(year);
    }

    public static void task2() {
        task("2");
        int os = 0;
        int deviceYear = 2014;
        clientOS(os,deviceYear);
    }

    public static void task3() {
        task("3");
        int deliveryDay = deliveryDay(160);
        System.out.printf("Доставка займет %d днeй\n", deliveryDay);
    }

    public static void task4() {
        task("4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverse(reverseFullName);
    }

    public static void task5() {
        task("5");
        String s = "aabccddefgghiijjkk";
        duplicate(s);
    }

    public static void task6() {
        task("6");
        int[] rand = generateRandomArray();
        double everage = mean(rand);
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", everage);
    }
}