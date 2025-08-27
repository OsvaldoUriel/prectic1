package com.mx.codegym.lecciones;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToker {
    public static void main(String[] args) {
        String str = "Good new everyone!";
        String[] strings = str.split("ne");
        System.out.println(Arrays.toString(strings));


        StringTokenizer tokenizer = new StringTokenizer(str,"ne");
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.print(token);
        }
        System.out.println("");
String name = "Natalia";
        int age = 16;
      String a =  String.format("Age=%d, Name=%s", age, name);
    //String.format("Age=%d, Name=%s", age, name); atmbien asi se púede
String b = String.format("a=%d, b=%d, c=%d", 1, 2, 3);
String b2 = String.format("a=%3$d, b=%2$d, c=%d", 1, 2, 3);

        System.out.println(a + b);
        System.out.println(b2);

        String a2  = new String("Hello");
        String a3  = new String("Hello");
        System.out.println(a2 == a3);


        String t1 = a.intern();
        String t2 = b.intern();
        System.out.println(a == b);
        System.out.println(t1 == t2);


    }
}
