package w3school;

public class This {
    int x;
//    int y;

public This(int x/*, int y */){
    this.x = x;
//    this.y = y;
}

    public static void main(String[] args) {

This myObj = new This(5 /*6*/);
System.out.println("Value of x = " + myObj.x);
}

}
