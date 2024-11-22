package EjerciciosResueltos;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Número de términos a generar
        int a = 0, b = 1;
        System.out.println("Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
