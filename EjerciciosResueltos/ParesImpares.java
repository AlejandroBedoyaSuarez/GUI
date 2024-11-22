package EjerciciosResueltos;

public class ParesImpares {
    public static void main(String[] args) {
        int limite = 10;
        System.out.println("Números pares:");
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmeros impares:");
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
