package EjerciciosResueltos;

public class numeroPrimo {
    public static void main(String[] args) {
        int num = 29; // Número a verificar
        boolean esPrimo = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
    }
}
