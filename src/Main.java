public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1
        int[] date = new int[4];
        date[0] = 21;
        date[1] = 13;
        date[2] = 45;
        date[3] = 8;

        double[] price = {1.57, 7.654, 9.986};

        int[] dayWeek = {6, 1, 3, 5, 2, 0, 7};


        // Задание 2
        for (int i = 0; i < date.length - 1; i++) {
            System.out.print(date[i] + ",");
        }
        System.out.println(date[date.length - 1]);

        for (int i = 0; i < price.length - 1; i++) {
            System.out.print(price[i] + ",");
        }
        System.out.println(price[price.length - 1]);

        for (int i = 0; i < dayWeek.length- 1; i++) {
            System.out.print(dayWeek[i] + ",");
        }
        System.out.println(dayWeek[dayWeek.length - 1]);
        System.out.println();


        // Задание 3
        for (int i = date.length-1; i > 0 ; i--) {
            System.out.print(date[i] + ",");
        }
        System.out.println(date[0]);

        for (int i = price.length-1; i > 0 ; i--) {
            System.out.print(price[i] + ",");
        }
        System.out.println(price[0]);

        for (int i = dayWeek.length-1; i > 0 ; i--) {
            System.out.print(dayWeek[i] + ",");
        }
        System.out.println(dayWeek[0]);
        System.out.println();

    // Задание 4
        for (int j = 0; j < date.length - 1; j++) {
            if(date[j] % 2 != 0) date[j]++;
            System.out.print(date[j] + ",");
        }
        System.out.println(date[date.length - 1]);
    }
}

