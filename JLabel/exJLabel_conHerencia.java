package JLabel;
import javax.swing.*;

public class exJLabel_conHerencia extends JFrame {
    //Constructor
    public exJLabel_conHerencia() {

        //Configuración del JLabel
        setTitle("Ventana con JLabel");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creamos un JLabel
        JLabel etiqueta = new JLabel("Texto dentro de JLabel, Alejandro Bedoya", SwingConstants.CENTER);

        //Configuración Opcional de la etiqueta
        etiqueta.setFont(etiqueta.getFont().deriveFont(18.0f));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setVerticalAlignment(SwingConstants.TOP);

        //añadimos la etiqueta a la ventana
        add(etiqueta);

        //Hacemos visible
        setVisible(true);

    }

    public static void main(String[] args) {
        new exJLabel_conHerencia();
    }

}
