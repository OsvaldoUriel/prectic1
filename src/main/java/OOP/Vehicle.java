package OOP;
//Polymorphism
 class Vehicle {
    void encender(){
        System.out.println("The vehicle is lit");
    }
}

 class Main{
    public static void main(String[] args) {
        Vehicle myVehicle;

        myVehicle = new Coche();
        myVehicle.encender();

    myVehicle = new Moto();
    myVehicle.encender();
    }
         }



