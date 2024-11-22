package EjerciciosResueltos;

public class SumaDeSeries {
    public static void main(String[] args) {
        int n = 5; // Número de términos
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }

        System.out.println("Suma de la serie hasta " + n + " términos: " + suma);
    }
}
