package JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exJButton {
    public static void main(String[] args) {
    //Creamos el Marco  
    JFrame ventana = new JFrame("Ejemplo con JButton");
    ventana.setSize(300,200);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ventana.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));//Centrado en horizontal y vertical

    //Creamos el botón
    JButton boton= new JButton("Haga click aquí");
    //hacemos evento del botón
    boton.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //hacemos que nos de una alerta
            JOptionPane.showMessageDialog(ventana, "Presionaste el botón");
        } 
    });

    //añadimos el botón al marco
    ventana.add(boton);
    //hacer que se visualice 
    ventana.setVisible(true);
    }
}
