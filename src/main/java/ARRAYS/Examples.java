package ARRAYS;

public class Examples {
    public static void main(String[] args) {
        int ages[] = {10, 39, 52, 33, 22, 65, 74, 21};

float avd, sum = 0;

int length = ages.length;
for (int  age : ages){
    sum += age;
}
avd = sum / length;
System.out.println("The averages age is : " + avd);



    }
}
