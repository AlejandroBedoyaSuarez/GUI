package JComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* getSelectedItem() → Obtiene el elemento seleccionado
* setSelectedItem(Object item) → Establece un elemento como seleccionado
* addItem(Object item) → Agrega un elemento al JComboBox
* removeItem(Object item) → Elimina un elemento específico del JComboBox
* removeAllItems() → Elimina todos los elementos del JComboBox
* getItemCount() → Retorna el número de elementos en el JComboBox
 */

public class ex2JComboBox {
    public static void main(String[] args) {
        // Creamos un marco
        JFrame ventana = new JFrame("Ejemplo con JButton");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        // Creamos un JLabel
        JLabel label = new JLabel("Seleccione el color");
        label.setBounds(50, 30, 200, 30);

        // Creamos un JComboBox con los colores
        String[] colores = { "Amarillo", "Azul", "Rojo" };
        JComboBox<String> comboBox = new JComboBox<>(colores);
        comboBox.setBounds(50, 70, 150, 30);

        // Añadimos el evento de Listener a JComboBox
        comboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String selection = (String) comboBox.getSelectedItem();
                // Cambiar el color del fondo del JFrame según la elección
                switch (selection) {
                    case "Amarillo":
                        ventana.getContentPane().setBackground(Color.YELLOW);
                        break;
                    case "Azul":
                        ventana.getContentPane().setBackground(Color.BLUE);
                        break;
                    case "Rojo":
                        ventana.getContentPane().setBackground(Color.RED);
                        break;

                }

            }

        });

        //Añadimos los componentes con JFrame
        ventana.add(label);
        ventana.add(comboBox);

        //Mostrar ventana
        ventana.setVisible(true);

    }
}
