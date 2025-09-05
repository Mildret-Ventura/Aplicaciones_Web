public class Retiro {
    private double cantidad;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }   

    public void Retirar(CuentaBancaria cuenta){

        if(cantidad > 0 && cantidad <= cuenta.getSaldo()){
        cuenta.setSaldo(cuenta.getSaldo() - cantidad);
        System.out.println("Retiro exitoso");
    } 
    else {
        System.out.println("Fondos insuficientes o cantidad invalida para retirar");
        }
    }
}