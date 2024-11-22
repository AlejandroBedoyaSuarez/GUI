package JLabel;

import java.awt.Color;
import javax.swing.*;

public class exJLabel_EjercicioClase extends JFrame {

    public exJLabel_EjercicioClase() {
        // Configuración inicial del JFrame
        setTitle("Ejercicio en CLase");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuración del JLabel con HTML para el texto
        JLabel cuadroTexto = new JLabel(
                "<html><h1> ITQ </h1> <br> <h2>Estudiante: Alejandro Bedoya</h2> <br> " +
                        "<h2>Nivel: Segundo Semestre </h2> <br> <h2>Materia: Lenguaje de Programación </h2></html>",
                SwingConstants.CENTER);
        cuadroTexto.setBackground(Color.BLUE); // Color de fondo
        cuadroTexto.setForeground(Color.WHITE); // Color del texto
        cuadroTexto.setOpaque(true); // Fondo visible

        // Agregamos el JLabel al JFrame
        add(cuadroTexto);

        // Hacemos visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        //Le instanciamos
        new exJLabel_EjercicioClase();
    }
}