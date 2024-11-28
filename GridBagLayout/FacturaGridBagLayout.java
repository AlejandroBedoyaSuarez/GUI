package GridBagLayout;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FacturaGridBagLayout {
    public static void main(String[] args) {
        // Creamos un marco
        JFrame ventana = new JFrame("Factura");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creamos un JPanel con GridLayout
        JPanel panel = new JPanel(new GridBagLayout());
        ventana.add(panel);

        GridBagConstraints gbc = new GridBagConstraints();

        // Datos de Ejemplo
        String[] columnas = { "Producto", "Cantidad", "Precio Unitario" };

        Object[][] datos = {
                { "Producto 1", "2", "10.00" },
                { "Producto 2", "3", "20.00" }
        };

        // Creamos los componentes
        JLabel lblCliente = new JLabel("Cliente");
        JTextField txtCliente = new JTextField(20);
        JLabel lblFecha = new JLabel("Fecha");
        JTextField txtFecha = new JTextField(10);

        JTable tabla = new JTable(new DefaultTableModel(datos, columnas));

        // Agregar componentes al panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lblCliente, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(txtCliente);

        // Agregar la tabla
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel.add(new JScrollPane(tabla), gbc);

        ventana.pack();
        ventana.setVisible(true);

    }
}