package Object;

import java.io.Serializable;

public class Singlen implements Serializable {

    private static final Singlen SINGLEN = new Singlen();

    private Singlen(){
    }

    public static Singlen getInstance(){
        return SINGLEN;
    }

    public static void main(String[] args) {
//        Object singlen =

    }

}
