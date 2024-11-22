package EjerciciosResueltos;

public class Collatz {
    public static void main(String[] args) {
        int n = 12; // Número inicial
        System.out.println("Serie de Collatz para " + n + ":");
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(1);
    }
}
