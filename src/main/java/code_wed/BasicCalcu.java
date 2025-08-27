package code_wed;

import java.util.Scanner;

public class BasicCalcu {
//    public static void main(String[] args) {
     static  {
        Scanner con = new Scanner(System.in);
        System.out.println("---Basic Calculator---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Didivision");

        System.out.print("Enter fird Number: ");
       double num1 = con.nextDouble();
       System.out.print("Enter second Number: ");
    double num2 = con.nextDouble();

    System.out.print("Choose Operation (1-4): ");
    int operation = con.nextInt();

switch (operation){
    case 1:
        double result = num1 + num2;
        System.out.print(num1 + "+" + num2 + "=" + result);
        break;

    case 2:
        double result2 = num1 - num2;
        System.out.print(num1 + "-" + num2 + "=" + result2);
        break;

    case 3:
        double result3 = num1 * num2;
        System.out.print(num1 + "X" + num2 + "=" + result3);
        break;

    case 4:
        try{ double result4 = num1 / num2;
            System.out.print(num1 + "/" + num2 + "=" + result4);
        }catch (Exception e){
            System.out.println("can't dividde by zero");
}
        break;
    default:System.out.println("Try again. Choose operation 1-4");








/*   if(operation == 1){
        double result = num1 + num2;
        System.out.print(num1 + "+" + num2 + "=" + result);
    } else if (operation == 2) {
        double result = num1 - num2;
        System.out.print(num1 + "-" + num2 + "=" + result);
    } else if (operation == 3) {
        double result = num1 * num2;
        System.out.print(num1 + "X" + num2 + "=" + result);
    } else if (operation == 4) {
        try{ double result = num1 / num2;
            System.out.print(num1 + "/" + num2 + "=" + result);
        }catch (Exception e){
            System.out.println("can't dividde by zero");
        }
    }else{
        System.out.println("Try agaiin. Choose operation 1-4");
    }
*/

    }
}
}
