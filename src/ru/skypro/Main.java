package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(" "+j);
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print( " " + i );
        }
        System.out.println();System.out.println();

        System.out.println("Задание 2");
        int friday = 4;
        while (friday < 31) {
            friday = friday + 7;
            if (friday <= 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет. ");
            }
        }
        System.out.print("\n");
        System.out.println("Задание 3");
        int year = 2022;
        int a = year - 200;
        int b = year + 100;
        for (; a<b; a++){
             if (a%79==0){
        System.out.println(a);
    }
        }



    }
}
