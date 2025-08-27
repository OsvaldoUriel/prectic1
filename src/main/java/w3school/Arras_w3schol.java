package w3school;

import java.util.Scanner;

public class Arras_w3schol {
    public static void main(String[] args) {
        String[] cars = {" Volvo", "Audi", "Mercedez", "BWM"};
        System.out.println(cars[3]);
        System.out.println(cars.length);
System.out.println("♣");
        int[] myNum = {10 , 20 , 532 , 785 , 550};
        System.out.println("Cell 2 " + myNum[2]);
        System.out.println("Number of cell: " +  myNum.length);
        System.out.println("♠");

String[] cars2 = {"Tesla ", "Vocho ", "Mazda ", "Jeep "};
for(int i = 0; i < cars2.length; i++){
    System.out.print(cars2[i]);
}
System.out.println("");
System.out.println("");

        System.out.println("Ages averages");
        int[] ages ={10, 16, 18, 29, 14, 56, 77, 4};
double avg, sum = 0;
int lenght = ages.length;
for (int age : ages){
    sum += age;
}
avg = sum / lenght;
System.out.println("This average age is: " + avg);

System.out.println("The years");
int[] years = {10, 28, 36, 83, 74, 54};

int length = years.length;
int lowestAges = years[0];

for(int year : years){
     if(lowestAges > year){
         lowestAges = year;
     }
}
System.out.println("The lowest age in the array is: " + lowestAges);


int[][] NumBIdi ={{1, 2, 3, 4, }, {5, 6, 7,}};
        System.out.println(NumBIdi[0][2]);

        int[][] Num ={{1, 2, 3, 4, }, {5, 6, 7,}};
Num[0][2] = 9;
        System.out.println(Num[0][2]);

        int[][] two ={{1, 2, 3, 4, }, {5, 6, 7,}};
for(int i = 0; i < two.length; i++){
    for(int j = 0; j < two[i].length; j++){
        System.out.print(two[i][j]);
    }
}
System.out.println(" ");
System.out.println("For improved");
for(int[] row : two){
    for(int i : row){
        System.out.print(i);
    }
}
        System.out.println();

System.out.println("Sum de arrays");
int[] more = {1, 5, 10, 15};
for (int i: more){
    System.out.println(i);
}


int más = 0;
for(int i = 0; i < more.length; i++){
    más += more[i];
}
    System.out.println("The sum is:" + más);


    }
}
