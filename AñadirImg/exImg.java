package AñadirImg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class exImg {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Ingreso de Imagenes");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);

        // Panel superiror para mostrar la imagen
        JPanel panelImagen = new JPanel();
        JLabel LabelImagen = new JLabel();
        panelImagen.add(LabelImagen);
        panelImagen.setBorder(BorderFactory.createTitledBorder("Imagen"));

        // Panel inferior para botones
        JPanel panelBotones = new JPanel();
        JButton botonCargar = new JButton("Cargar imagen");
        panelBotones.add(botonCargar);

        ventana.setLayout(new BorderLayout());
        ventana.add(panelImagen, BorderLayout.CENTER);
        ventana.add(panelBotones, BorderLayout.SOUTH);

        // Accion del boton "Cargar Imagen"
        botonCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int resultado = fileChooser.showOpenDialog(ventana);
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    File archivoSeleccionado = fileChooser.getSelectedFile();
                    ImageIcon icono = new ImageIcon(archivoSeleccionado.getAbsolutePath());

                    // Ajustar el tamaño de la imagen al JLabel
                    Image imagen = icono.getImage().getScaledInstance(700, 500, Image.SCALE_SMOOTH);
                    LabelImagen.setIcon(new ImageIcon(imagen));
                }
            }
        });

        ventana.setVisible(true);
    }
}
