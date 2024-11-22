package EjerciciosResueltos;

public class NumerosPerfectos {
    public static void main(String[] args) {
        int limite = 1000;
        System.out.println("Números perfectos hasta " + limite + ":");
        for (int num = 1; num <= limite; num++) {
            int suma = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }
            if (suma == num) {
                System.out.println(num);
            }
        }
    }
}