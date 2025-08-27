package com.mx.codegym.lecciones;

public class Stringconstructor {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("bye");

//        builder.append("Bye");
        builder.append(123);
String result = builder.toString();
System.out.println(result);
        StringBuilder builder2 = new StringBuilder("Hello");

builder2.deleteCharAt(4);
        String result2 = builder2.toString();
        System.out.println(result2);

        StringBuilder builder3 = new StringBuilder("Hellow");
builder3.replace(2, 5, "Hello!");
String result3 = builder3.toString();
System.out.println(result3);



    }
}
