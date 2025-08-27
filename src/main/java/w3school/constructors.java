package w3school;

public class constructors {
int x;
int x2;
int modelYear;
String modelName;
public constructors(){
        x = 5;
        x2 = 2;
    }

    public static void main(String[] args) {
constructors obj = new constructors();
constructors objunder = new constructors(6);
constructors Mycar = new constructors(1993,"Mustang");
System.out.println(obj.x2 + "\n" + obj.x);
System.out.println(objunder.x);
System.out.println(Mycar.modelName + " " + Mycar.modelYear);


    }

    public constructors(int y){
x = y;
    }
public constructors(int year, String name){
    modelYear = year;
    modelName = name;
}

}
