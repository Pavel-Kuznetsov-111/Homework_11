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

    public static void task1(int clientDeviceYear) {
        int clientIOS = 0;
        int clientAndroid = 1;
        if (clientIOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Скачайте приложение для ios");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientIOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Операционная система не поддерживается");
            }
        }

    }

    //Задача №3
    public static String totalDaysDelivry(int distance) {
        int dayDelivery = 1;
        if (distance >= 20 && distance <= 60) {
            dayDelivery++;
        } else if (distance >= 60 && distance < 100) {
            dayDelivery += 2;
        } else if (distance > 100) {
            return "Доставки нет";
        }
        return "Потребуется дней " + dayDelivery;
    }


