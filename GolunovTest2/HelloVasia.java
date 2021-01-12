package GolunovTest2;

import java.util.Scanner;

public class HelloVasia {

    static Scanner scan = new Scanner(System.in);

    public  static String Hello() {

        System.out.println("Введите имя: ");
        String a = null;
        if (scan.hasNextLine()) {
            a = scan.nextLine();
            if (a.equals("Вячеслав")) {
                System.out.println("Привет " + a);
            } else {
                System.out.println("Нет такого имени.");
            }
        }
        return a;
    }

}
