public class Deposito {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("Depósito exitoso");
        } 
        else {
            System.out.println("Ingresa una cantidad válida.");
        }
    }
}