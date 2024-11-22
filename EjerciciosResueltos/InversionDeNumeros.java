package EjerciciosResueltos;

public class InversionDeNumeros {
    public static void main(String[] args) {
        int numero = 12345;
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        System.out.println("Número invertido: " + invertido);
    }
}
