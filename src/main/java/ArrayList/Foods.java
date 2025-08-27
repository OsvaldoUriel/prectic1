package ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Foods {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the n of foods you would like: ");
        int numberOfFoods = scanner.nextInt();

        for (int i = 1; i <= numberOfFoods; i++) {
            System.out.println("Enter foods n" + i + ": ");
String food = scanner.nextLine();
/*foods.add(food);
        */

            System.out.println(food);
    }

        }
    }
