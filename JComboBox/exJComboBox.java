package JComboBox;
import javax.swing.*;
import java.awt.*;

/*
* getSelectedItem() → Obtiene el elemento seleccionado
* setSelectedItem(Object item) → Establece un elemento como seleccionado
* addItem(Object item) → Agrega un elemento al JComboBox
* removeItem(Object item) → Elimina un elemento específico del JComboBox
* removeAllItems() → Elimina todos los elementos del JComboBox
* getItemCount() → Retorna el número de elementos en el JComboBox
 */
public class exJComboBox {
        public static void main(String[] args) {
            //Creamos un Marco
            JFrame ventana = new JFrame("Ejemplo con JComboBox");
            ventana.setSize(400, 300);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Creamos un JCombobox con opciones
            String [] opciones = {"Opcion 1" , "Opción 2" , "Opcion 3", "Opcion 4"};
            JComboBox <String> comboBox= new JComboBox<>(opciones);

            //Configuramos la posición
            comboBox.setBounds(50, 50, 150, 30);

            //Añadimos el JComboBox al JFrame
            ventana.setLayout(null);
            ventana.add(comboBox);

            //Hacemos que sea visible
            ventana.setVisible(true);

        }
}
