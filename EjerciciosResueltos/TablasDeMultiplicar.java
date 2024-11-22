package EjerciciosResueltos;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int numero = 5; // Número para la tabla
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
