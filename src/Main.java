public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1
        int[] date = new int[3];
        date[0] = 1;
        date[1] = 2;
        date[2] = 3;
        System.out.println(date[0]);
        System.out.println(date[1]);
        System.out.println(date[2]);


        double[] price = {1.57, 7.654, 9.986};
        System.out.println(price[0]);
        System.out.println(price[1]);
        System.out.println(price[2]);
        System.out.println();


        int[] dayWeek = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < dayWeek.length; i++) {
            System.out.println("Сегодня - " + dayWeek[0] + " по счёту день недели.");
            System.out.println("Сегодня - " + dayWeek[1] + " по счёту день недели.");
            System.out.println("Сегодня - " + dayWeek[2] + " по счёту день недели.");
            System.out.println("Сегодня - " + dayWeek[3] + " по счёту день недели.");
            System.out.println("Сегодня - " + dayWeek[4] + " по счёту день недели.");
            System.out.println("Сегодня - " + dayWeek[5] + " по счёту день недели.");
            System.out.println("Сегодня - " + dayWeek[6] + " по счёту день недели.");
            break;
        }
        System.out.println();

        // Задание 2
        System.out.println(date[0] + "," + date[1] + "," + date[2]);
        System.out.println(price[0] + "," + price[1] + "," + price[2]);
        System.out.println(dayWeek[0] + "," + dayWeek[1] + "," + dayWeek[2] + "," + dayWeek[3] + "," + dayWeek[4] + ","
                + dayWeek[5] + "," + dayWeek[6]);
        System.out.println();

        // Задание 3
        System.out.println(date[2] + "," + date[1] + "," + date[0]);
        System.out.println(price[2] + "," + price[1] + "," + price[0]);
        System.out.println(dayWeek[6] + "," + dayWeek[5] + "," + dayWeek[4] + "," + dayWeek[3] + "," + dayWeek[2] + ","
                + dayWeek[1] + "," + dayWeek[0]);
        System.out.println();

    // Задание 4
        int [] human = new int[3];
        human[0] = 2;
        human[1] = 2;
        human[2] = 4;
        for ( int a = 0; a < human.length; a++) {
            System.out.println(human[0]);
            System.out.println(human[1]);
            System.out.println(human[2]);
            break;
        }

    }
}

