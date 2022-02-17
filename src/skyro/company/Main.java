package skyro.company;

import java.sql.SQLOutput;

public class Main {
    public static void printleapYear(int years){
        boolean leapYear_ = ((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0));
        if (leapYear_) {
            System.out.println(years + "  високосный год");
        } else {
            System.out.println(years + "  не високосный год");
        }
    }
    public static void printLink(int OS,int year){
        if (year < 2015) {
            if (OS==1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (year >= 2015) {
            if (OS==1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }
    public static void printDistanceDay(int deliveryDistance) {
        boolean distanceOneDay = deliveryDistance < 20;
        boolean distanceTwoDay = (deliveryDistance >= 20 && deliveryDistance <= 60);
        boolean distanceThreeDay = deliveryDistance > 60;
        int day = 1;
        if (distanceOneDay) {
        }
        if (distanceTwoDay) {
            day++;
        }
        if (distanceThreeDay) {
            day++;
            ++day;
        }
        System.out.println("Потребуется дней: " + day);
    }
    public static void printRepeat(String str){
        char[] carray = str.toCharArray();
        System.out.print("Дубль: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
    public static void printArr(int[] number){
        for (int i = number.length-1; i >=0; i--) {
                System.out.print(number[i] + " ");
            }
    }
    public static void main(String[] args) {
	// Задание №1
        int year = 2021;
        printleapYear(year);
    //Задание №2
        int currentYear = 2019;
        int OS_ = 1;
        printLink(OS_,currentYear);
    //Задание №3
        int deliveryDistance = 95;
        printDistanceDay(deliveryDistance);
    //Задание №4
        String str = "aabccddefgghiijjkk";
        printRepeat(str);
    //Задание №5
        int[] arr= {3, 2, 1, 6, 5};
        System.out.println("");
        printArr(arr);



    }
}
