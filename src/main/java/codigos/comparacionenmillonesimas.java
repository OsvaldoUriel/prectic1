package codigos;

public class comparacionenmillonesimas {
    public static void main(String[] args) {
        Double a = 1.000001;
        Double b = 1.000002;
        if ((Math.abs(a + b) < 0.000001)) {
            System.out.println("Los números son iguales");
        } else {//escribe aquí tu código
            System.out.println("Los números no son iguales");
        }

        /*int i = 1;
        while(i <=20){
            if ((i % 5) == 0)
                //continue;
            System.out.println(i);
            i++;*/

        int i = 1;
        while (i <= 20) {
            if ((i % 7) == 0){
                i++;
                continue;}
                System.out.println(i);
                i++;
        }System.out.println("---------------------------");

       /* int l = 0;
        while(l < 20){
           l++;
                if ((l % 7) == 0 );
                continue;
            System.out.println(l);
        }*/
int zery = 0;
int one = 1;
while(one <= 99){
    if (one % 3 == 3){
        one++;
        continue;
    }
zery+=one;
    one++;
System.out.println(one);}

    }//main

    }//class

