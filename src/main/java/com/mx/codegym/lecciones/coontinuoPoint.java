package com.mx.codegym.lecciones;

public class coontinuoPoint {
    public static void printPoints(Point[] points){
        for(int i = 0; i < points.length; i++)
points[i].print();
    }

    public static void main(String[] args) {
        Point[] data = new Point[10];
        for(int i = 0; i < data.length; i++ )
            data[i] = new Point();
        printPoints(data);
    }

}
