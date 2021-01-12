package GolunovTest3;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

    static Scanner scan = new Scanner(System.in);

    public static int NumberMas() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество которое будет в массиве: ");

        int number;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (scan.hasNextInt()) {
            number = scan.nextInt();
        } else {
            System.out.println("Введите целое число: ");
            scan.next();
            number = NumberMas();
        }
        if (number > 0) {
            System.out.println("количество " + number);
        } else {
            System.out.println("Число должно быть ЦЕЛОЕ и больше 0 : ");
            scan.next();
            number = NumberMas();
        }

        System.out.println("Введите числа по одному после каждого числа нажать ВВОД: ");

        for (int i = 0; i < number; i++) {
            int num = 0;
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num % 3 == 0){
                    arrayList.add(num);
                }
                System.out.println("Число " + num);

            } else {
                System.out.println("Вы ошиблись! Начните сначала и перезагрузите программу.");
            }
        }

        System.out.println("Вот ваш массив элементов кратный трём: " + arrayList.toString());

        return number;
    }
}
