package GridBagLayout;
import java.awt.*;
import javax.swing.*;

public class exGridBagLayout {
    public static void main(String[] args) {
        
        // Creamos un marco
        JFrame ventana = new JFrame("Factura");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creamos un JPanel con GridLayout
        JPanel panel = new JPanel(new GridBagLayout());
        ventana.add(panel);

        //Configurar restricciones para el GridLayout
        GridBagConstraints exGridBagLayout = new GridBagConstraints();
        exGridBagLayout.insets = new Insets(5,5,5,5); //Márgenes de los componentes
        exGridBagLayout.fill= GridBagConstraints.HORIZONTAL; //Llenar horizontalmente

        //Etiqueta para nombre del Cliente
        exGridBagLayout.gridx= 0; //Columna 0
        exGridBagLayout.gridy= 0; //Fila 0
        panel.add(new JLabel("Nombre del Cliente:"), exGridBagLayout);

        //Campo de texto para nombre cliente
        exGridBagLayout.gridx= 1; //Columna 1
        exGridBagLayout.gridy= 0; //Fila 0
        exGridBagLayout.weightx= 1.0; //Permite que se expanda horizontalmente
        panel.add((new JTextField(15)), exGridBagLayout);

        //Etiqueta para Producto
        exGridBagLayout.gridx= 0;//Columna 0
        exGridBagLayout.gridy= 1;// Fila 1
        exGridBagLayout.weightx= 0; //Restablecer Peso Horizontal
        panel.add(new JLabel("Producto:"), exGridBagLayout);

        //Campo de Texto para producto
        exGridBagLayout.gridx= 1; //Columna 1
        exGridBagLayout.gridy= 1;
        exGridBagLayout.weightx= 1.0;
        panel.add(new JTextField(15), exGridBagLayout);

        //Etiqueta para Cantidad
        exGridBagLayout.gridx= 0; //Columna 0
        exGridBagLayout.gridy= 2; //Fila 2
        exGridBagLayout.weightx= 0;
        panel.add(new JLabel("Cantidad"), exGridBagLayout);

        //Campo de texto para producto
        exGridBagLayout.gridx= 1;
        exGridBagLayout.gridy= 2;
        exGridBagLayout.weightx= 1.0;
        panel.add(new JTextField(15), exGridBagLayout);

        //Botón para enviar 
        exGridBagLayout.gridx= 0;
        exGridBagLayout.gridy= 3;
        exGridBagLayout.gridwidth= 2;
        exGridBagLayout.weightx= 0;
        JButton botonEnviar = new JButton("Enviar");
        panel.add(botonEnviar, exGridBagLayout);

        ventana.setVisible(true);

    }
}