import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deposito deposito = new Deposito();
        Retiro retiro = new Retiro();
        Consulta consulta = new Consulta();

        // Inicializamos saldo en todas las clases en 0 o puedes pedir al usuario
        double saldoInicial = 0;
        deposito.setSaldo(saldoInicial);
        retiro.setSaldo(saldoInicial);
        consulta.setSaldo(saldoInicial);

        int opcion;
        do {
            System.out.println("\n--- BANCO ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Cantidad a depositar: ");
                    double cantDep = sc.nextDouble();
                    deposito.depositar(cantDep);
                    // Actualizamos saldo en las otras clases
                    retiro.setSaldo(deposito.getSaldo());
                    consulta.setSaldo(deposito.getSaldo());
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    double cantRet = sc.nextDouble();
                    retiro.retirar(cantRet);
                    // Actualizamos saldo en las otras clases
                    deposito.setSaldo(retiro.getSaldo());
                    consulta.setSaldo(retiro.getSaldo());
                    break;
                case 3:
                    consulta.mostrarSaldo();
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el banco!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while(opcion != 4);

        sc.close();
    }
}