package JLabel;
import javax.swing.*;

public class exJLabel_sinHerencia {
    public static void main(String[] args) {
        //JFrame variable = new JFrame ("texto que sale en el marco")
        JFrame frame = new JFrame("Ventana sin Herencia"); //Creación del Marco
        frame.setSize(400,300); //Poner medida al marco
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //esto permite cerrar

        //Creamos el Label
        //JLabel nombreEtiqueta= new JLabel("Texto JLabel", SwingConstants.Posición);
        JLabel etiqueta= new JLabel("Texto dentro del Label, Alejandro Bedoya", SwingConstants.CENTER); //SwingConstants alinea al centro
        //añadimos el label
        frame.add(etiqueta);
        //Hacemos visible
        frame.setVisible(true);
    }
    

}
