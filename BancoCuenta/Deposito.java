public class Deposito {
    private double saldo;

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }
}