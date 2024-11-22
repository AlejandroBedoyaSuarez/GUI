package JButton;
//layout lib
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class exJButton2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo con JButton");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        //Crear panel de botones
        JPanel panelBotones= new JPanel();
        panelBotones.setLayout(new FlowLayout());

        //Creamos un Label
        JLabel mensajeLabel= new JLabel();
        mensajeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Botón 1
        JButton botonGuardar= new JButton("Guardar");
        botonGuardar.setIcon(new ImageIcon("JButton/hello.png"));
        //Añadimos Evento al Botón
        botonGuardar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana, "elemento guardado");
            }
            
        });

        //Creamos un segundo botón
        JButton botonAceptar= new JButton("Aceptar");
        botonAceptar.setBackground(Color.green);
        botonAceptar.setOpaque(true);
        botonAceptar.setBorderPainted(false);

        //Añadimos evento al botón
        botonAceptar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mensajeLabel.setText("Alejandro Bedoya");
            }
            
        });

        //Creamos un nuevo botón
        JButton botonSalir = new JButton("Salir");
        botonSalir.setBackground(Color.red);
        botonSalir.setOpaque(true);
        botonSalir.setBorderPainted(false);

        //Añadimos evento al botón
        botonSalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
            
        });

        //Añadimos los botones al panel
        panelBotones.add(botonGuardar);
        panelBotones.add(botonAceptar);
        panelBotones.add(botonSalir);

        //Agregar el panel de botones al JFrame y la posición de los elementos
        ventana.add(panelBotones, BorderLayout.CENTER);
        ventana.add(mensajeLabel, BorderLayout.SOUTH);

        //visualización
        ventana.setVisible(true);
    }
}
