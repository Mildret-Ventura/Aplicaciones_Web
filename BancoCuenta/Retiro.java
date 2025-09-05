public class Retiro {
    private double saldo;

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}