public class Retiro {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo = saldo - cantidad;
            System.out.println("Retiro exitoso");
        } 
        else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}