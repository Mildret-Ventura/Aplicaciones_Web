public class Deposito {
    private double cantidad;


    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void Depositar(CuentaBancaria cuenta){

        if(cantidad > 0){
        cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        System.out.println("Deposito exitoso");
    } 
    else {
        System.out.println("Ingrese una cantidad valida para depositar");
        }
    }
}