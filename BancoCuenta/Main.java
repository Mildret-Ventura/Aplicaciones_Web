import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consulta");
            System.out.println("2. Depósito");
            System.out.println("3. Retiro");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    Consulta consulta = new Consulta();
                    // Lógica para consulta
                    System.out.println("Realizando consulta...");
                    break;
                case 2:
                    Deposito deposito = new Deposito();
                    // Lógica para depósito
                    System.out.println("Realizando depósito...");
                    break;
                case 3:
                    Retiro retiro = new Retiro();
                    // Lógica para retiro
                    System.out.println("Realizando retiro...");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (true);

        scanner.close();
    }
}
