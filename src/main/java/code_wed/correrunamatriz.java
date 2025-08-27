package code_wed;

import java.util.ArrayList;

public class correrunamatriz {
    public static int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

    public static void main(String[] args) {
        System.out.println(myNumbers[1][2]);

        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars1[3]);

        System.out.println("");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("");

        String[] automovil = {"audi", "mercedez", "ferrari", "ford"};
        automovil[2] = "Opel";
        System.out.println(automovil[1]);

        System.out.println(" ");
        
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
        myMethod();




System.out.println(carsarray);

    }
     static void myMethod() {
    System.out.println("I just got executed!");
     }
     static public ArrayList<String> carsarray = new ArrayList<String>();{
    carsarray.add("Volvo");
         carsarray.add("Mercedez");
         carsarray.add("Audi");
         carsarray.add("BMW");
         carsarray.add("Mazda");
}

}

