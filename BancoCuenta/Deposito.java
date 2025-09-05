public class Deposito {

    public void realizarDeposito(CuentaBancaria cuenta, double cantidad) {
        íf (cantidad > 0) {
            cuenta.set(cantidad);
        } else {
            System.out.println("Cantidad de depósito inválida.");
        }



    }
    
}
