package w3school;

public class Methods_with_object {
    static void Print(){
        System.out.println("Vicente Fernandez");
    }
    public void Println(){
        System.out.println("Juan Gabriel");
    }
public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
}
public void speed(int maxSpeed){
System.out.println("Max speed is:" + maxSpeed);
}

    public static void main(String[] args) {
        Print();//stactic
    Methods_with_object myObj = new Methods_with_object();//public
    myObj.Println();//public

    myObj.fullThrottle();
myObj.speed(200);

    }
}
