package Object;

import java.util.HashSet;
import java.util.Scanner;

public class HasCode {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
    set.add("Hello");
    set.add("Hallo");
    set.add("Hola");
    set.add("Bonjour");
    set.add("Namaste");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (set.contains(str)){
            System.out.println("GoodBye");
        }
    }
}
