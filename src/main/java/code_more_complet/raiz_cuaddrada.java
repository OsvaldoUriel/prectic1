package code_more_complet;

public class raiz_cuaddrada {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrttext = "The square root of ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrtnumber = Math.sqrt(element);//este es el codigo que hace la raiz
            System.out.println(elementSqrttext + element + " is " + elementSqrtnumber);
        }
        final int[] data ={1, 2, 3, 4, 5, 6,};
        data[0] = 1;
        data[2] = 2;
        data[1] = 1;

    }




}
