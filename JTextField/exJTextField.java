package JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
* getText() → Obtiene el texto actual del campo
* setText(String text) → Establece el texto en el campo
* setEditable(boolean editable) → Permite o no que el usuario edite el texto
* setColumns(int columns) → Define el número de columnas visibles (ancho del campo)
 */
public class exJTextField {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo con JButton");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        
        //Creamos un TextField
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);

        //Creamos un botón
        JButton button = new JButton();
        button.setBounds(50,100,150,30);

        //Creamos una etiqueta para mostrar el texto ingresado
        JLabel label = new JLabel();
        label.setBounds(50,150,300,30);

        //Añadimos un evento al botón
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String input= textField.getText();
                label.setText("Texto :" + input);
            }
            
        });

        //añadimos los componentes al marco/frame
        ventana.add(textField);
        ventana.add(button);
        ventana.add(label);
        //Le hacemos visual
        ventana.setVisible(true);
    }
}
