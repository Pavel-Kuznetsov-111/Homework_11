// Задача №1
public class Main {
    public static void printLeapYearStatus(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void main(String[] args) {
        int year = 2020;
        printLeapYearStatus(year);
    }

    //Задача №2

    public static void downloadCorrectForGadget(int clientDeviceYear, int clientIOS) {
        if ((clientIOS == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if ((clientIOS == 1) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((clientIOS == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if ((clientIOS == 0) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    //Задача №3
    public static void totalDaysDelivry(int time, int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребутся дней " + time);
        } else if ((deliveryDistance >= 20) && (deliveryDistance <= 60)) {
            time = time++;
            System.out.println("Потребутся дней " + time);
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            time = time++;
            System.out.println("Потребутся дней " + time);
        } else {
            System.out.println("Доставки нет");
        }
    }

}





