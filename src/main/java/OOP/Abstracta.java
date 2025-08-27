package OOP;

public abstract class Abstracta {
    abstract double calcularArea();
}
class  Circle extends Abstracta{
    double radio;
    Circle (double radio){
        this.radio = radio;
    }
    @Override
double calcularArea(){
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Abstracta abstracta = new Circle(5);//Object
    System.out.println("Aera of the circle is: " + abstracta.calcularArea());

    }


}