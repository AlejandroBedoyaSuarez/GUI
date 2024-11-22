package JTextField;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;

public class Keylogger {
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Ejemplo con JButton");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());

        //Creamos una etiqueta
        JLabel label = new JLabel("Ingresa un Texto");

        //Creamos un TextField
        JTextField textField= new JTextField(20);

        //Añadimos un document listener al textfield
        textField.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
               System.out.println("Texto añadido :" + textField.getText());
             }
            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Texto eliminado: " + textField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                //generalmente se usa para cambios de formato, no para texto en si
                System.out.println("Atributos cambiados");
            }
            
        });

        //Agregamos los componentes al marco
        ventana.add(label);
        ventana.add(textField);

        //Hacemos visible 
        ventana.setVisible(true);
    }
}
