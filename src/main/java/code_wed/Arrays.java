package code_wed;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int ages[] = {20, 22, 30, 18, 33, 45, 22, 21 };
float avs, sum = 0;
int promedio = ages.length;

for(int age : ages){
    sum += age;
}
avs = sum / promedio;
System.out.println("the average age is " + avs);

System.out.println("------------");
String saludo = "Hello";

char[] myArray = saludo.toCharArray();
System.out.println(myArray[0]);

for(char i : myArray){//el ]"for, mejorado" sirve para recorrer las Arrays mas fácil
    System.out.print(i);
}
System.out.println("♥");
        ArrayList<String> cars = new  ArrayList<String>();
cars.add("Volvo");
cars.add("Audi");


cars.add("Mercedez");
cars.add("BWM");
//cars.add(2, "Tesla"); para cambiar el valor de una celda
System.out.print(cars);
System.out.println("");





    }
}
