public class Main {
    public static void main(String[] args) {


       // Задание 1
        System.out.println("Задание 1");

int clientOS = 0;


if (clientOS == 0){
    System.out.println("Установите версию приложения для iOS по ссылке");
} else if (clientOS ==1) {
    System.out.println("Установите версию приложения для Android по ссылке");

}




// Задание 2
        System.out.println("Задание 2");

        int clientIOS = 0;
        int clientAOS = 1;
        int clientDeviceYear = 2015;
        if (clientIOS == 0 && clientDeviceYear >= 2015){
            System.out.println("установите версию приложения для iOS по ссылке");}
             if (clientDeviceYear < 2015) {
                System.out.println("установите  облегченную версию приложения для iOS по ссылке");}
        if (clientAOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");}
            if ( clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");}

        // Задание 3

        System.out.println("// Задание 3");



             int  year = 2021;
            if ( year % 4 == 0 && year % 100 != 0  && year % 400 ==0) {
                System.out.println( year + " год высокосный");}
               else {
                    System.out.println(year + " год не высокосный");}

        // Задание 4
        System.out.println("Задание 4");



               int deliveryDistance = 95;
               int deliveryDay = 1;
               if (deliveryDistance > 20) {
                   deliveryDay ++;}
                    if (deliveryDistance > 60  ) {
                   deliveryDay++;}

                System.out.println("Потребуется дня :" + deliveryDay);




        // Задание 5
        System.out.println("// Задание 5");


        int monthNumber = 14;

        switch (monthNumber) {

            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }








    }
}