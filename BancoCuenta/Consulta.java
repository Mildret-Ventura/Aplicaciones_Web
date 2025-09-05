public class Consulta {
    private double saldo;

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}