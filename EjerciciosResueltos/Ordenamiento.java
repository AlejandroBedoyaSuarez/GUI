package EjerciciosResueltos;
import java.util.Arrays;

public class Ordenamiento {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 6};
        System.out.println("Antes de ordenar: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Después de ordenar: " + Arrays.toString(numeros));
    }
}
