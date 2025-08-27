package w3school;

import java.util.List;

public class EnumsExamples {
    enum level{
    LOW,
    MEDIUM,
    HING;
    }

    public static void main(String[] args) {
        level myVar = level.HING;
    System.out.println(myVar);

        List<TipoPago> tiposDePago = TipoPago.toList();
        for (TipoPago item :  tiposDePago) {
            System.out.println("-> " + item);
        }


    }

}
