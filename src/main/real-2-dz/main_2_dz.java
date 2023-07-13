import java.util.Scanner;

public class main_2_dz {

    public static void main(String[] args) {

        int a, b;
        float c;
        char d;

        System.out.println("Введите 1-ое число: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        System.out.println("Введите арифметический знак: ");
        Scanner scanner1 = new Scanner(System.in);
        d = scanner1.nextLine().charAt(0);

        System.out.println("Введите 2-ое число: ");
        Scanner scanner2 = new Scanner(System.in);
        b = scanner2.nextInt();

        switch (d){

            case '+': c = a + b;
                System.out.println("Сума: a + b = " + c);
                break;

            case '-': c = a - b;
                System.out.println("Разница: a - b = " + c);
                break;

            case '*': c = a * b;
                System.out.println("Произведение: a * b = " + c);
                break;

            case '/':
                if ( b != 0 ){

                    c = (float) a / b;
                    System.out.println("Деление: a / b = " + c);

                } else {

                    System.out.println("b = 0. На 0 делить нельзя!!!");

                }
                break;
            default: System.out.println("Это плохой знак!!!");
                break;
        }

    }

}