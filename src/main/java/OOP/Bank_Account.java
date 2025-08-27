package OOP;

class CuentaBancaria{
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double cantidad){
        this.saldo += cantidad;
    }
        public void retirar(double cantidad){
        if(this.saldo >= cantidad){
            this.saldo -= cantidad;
        }
    }

    public void mostrarDatos(){
        System.out.println("Name:" + this.titular + "\n Money:$"  + this.saldo);
    }

        }

public class Bank_Account {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Allison", 2000);//Object
        cuenta.depositar(200);
        cuenta.retirar(100);
        cuenta.mostrarDatos();
        CuentaBancaria cuenta2 = new CuentaBancaria("Manuel", 6000);//Object
        cuenta2.depositar(4000);
        cuenta2.retirar(1000);
        cuenta2.mostrarDatos();

    }

}
