public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }


    private static void task1() {
        System.out.println("Задача1");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task2() {
        System.out.println("Задача2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        int m = 10;
        for (; m > 0; m--) {
            System.out.print(m + " ");
        }
        System.out.println(" ");
    }

    private static void task3() {
        System.out.println("Задача3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int growth = birthRate - deathRate;
        for (int i = 1; i <= 10; i++) {
            population = population + growth * (population / 1000);
            System.out.println("Год " + i + " , численность населения составляет" + population);
        }
    }

    private static void task4() {
        System.out.println("Задача4");
        int deposit = 15_000;
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit / 100 * 7;
            i++;
            System.out.println("Месяц " + i + " , сумма вклада равна " + deposit);
        }
    }

    private static void task5() {
        System.out.println("Задача5");
        int deposit = 15_000;
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit / 100 * 7;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " , сумма вклада равна " + deposit);
            }
        }
    }

    private static void task6() {
        System.out.println("Задача6");
        int deposit = 15_000;
        int i = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit / 100 * 7;
            i++;
            if (i <= 9 * 12 && i % 6 == 0) {
                System.out.println("Месяц " + i + " , сумма вклада равна " + deposit);
            }
        }
    }

    private static void task7() {
        System.out.println("Задача7");
        int friday = 6;
        do {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет.");
            friday += 7;
        }
        while (friday < 31);
    }

    private static void task8() {
        System.out.println("Задача8");
        int year = 2023;
        int future = year + 100;
        int past = year - 200;
        for (year=past;year < future;year++) {
            if (year % 79 == 0)
                System.out.println(year);
        }
    }
}



