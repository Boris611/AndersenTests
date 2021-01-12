package GolunovTest;

import java.util.Scanner;

public class  HelloNumberSeven {

    static Scanner scan = new Scanner(System.in);

    public static int HelloSeven(){

        System.out.println("Введите целое число: ");
        if (scan.hasNextInt()) {
            int inputNumber = scan.nextInt();
            if ( inputNumber > 7) {
                System.out.println("Вы ввели число больше 7 поэтому ПРИВЕЕЕЕЕТ! :-) ");
            } else{
                    System.out.println("Вы ввели число равное или меньше 7 перезапустите программу.");
                }
        } else {
            System.out.println("Вы ввелли не целое число! Пожалйста, запустите программу снова и повторите.");
            scan.next();
            int inputNumber = HelloSeven();
        }

        return 0;

    }

}
