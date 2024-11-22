package JLabel;
import javax.swing.*;

public class exJLabel_HTML {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con etiquetas");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creamos el Label
        JLabel etiqueta= new JLabel("<html><h1>Línea 1</h1> <br>Línea 2<br>Línea 3</html>"); //SwingConstants alinea al centro
        //añadimos el label
        frame.add(etiqueta);
        //Hacemos visible
        frame.setVisible(true);
    }
}