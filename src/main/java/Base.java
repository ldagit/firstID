import java.util.Scanner;

/**
 * @author Литвинцова Юлия
 */
public class Base {

    public static void main(String[] args) {
        //Ввод данных
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double Num1 = in.nextDouble();
        System.out.println("Введите второе число:");
        double Num2 = in.nextDouble();
        System.out.println("Введите вид операции +, -, * или / :");
        String Oper = in.next();
        in.close();
        //Анализ и рассчет
        double Res;
        if (Oper.equals("+")){
            Res = Num1 + Num2;
            System.out.printf("Сумма чисел: %.4f \n", Res);

        }
        else if (Oper.equals("-")){
            Res = Num1 - Num2;
            System.out.printf("Разность чисел: %.4f \n", Res);
        }
        else if (Oper.equals("*")){
            Res = Num1 * Num2;
            System.out.printf("Произведение чисел: %.4f \n", Res);
        }
        else if (Oper.equals("/")){
            Res = Num1 / Num2;
            System.out.printf("Частное от деления чисел: %.4f \n", Res);
        }
        else {
            System.out.printf("Неправильно введен вид операции!");
        }
    }
}
