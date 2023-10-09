import java.util.Scanner;

public class sumarestamuldiv {
    public static void main(String[] args)  {

        Scanner n = new Scanner(System.in);
        
        //DAR LOS VALORES
        System.out.println("A CONTINUACIÓN DIME DOS NÚMEROS");

        System.out.println("Dimer el primer número:");
        int a = n.nextInt();
        
        System.out.println("Dime el segundo número:");
        int b = n.nextInt();

        System.out.println("Elija una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = n.nextInt();
        int resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

    }    
}
