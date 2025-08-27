package w3school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum TipoPago {
    PENDIENTE_POR_REVISAR,
    REVISADO,
    PENDIENTE_DE_PAGO,
    PAGADO,
    PENDIENTE_DE_ENVIO,
    ENVIADO, CANCELADO,
    RESERVADO;

    public static List<TipoPago> toList(){
        List<TipoPago> tiposDePagoList = new ArrayList<>();
        Collections.addAll(tiposDePagoList, TipoPago.values());
        return tiposDePagoList;
    }

}
