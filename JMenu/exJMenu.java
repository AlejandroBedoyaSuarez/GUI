package JMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class exJMenu {
    public static void main(String[] args) {
        //Creamos un marco
        JFrame ventana = new JFrame("Ejemplo Menú");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        //Creamos la barra de Menú
        JMenuBar menuBar= new JMenuBar();

        //Creamos el Menú
        JMenu menuColores = new JMenu("Colores");
        
        //Creamos los elementos del Menú
        JMenuItem amarillo = new JMenuItem("Amarillo");
        JMenuItem azul = new JMenuItem("Azul");
        JMenuItem rojo = new JMenuItem("Rojo");

        //Añadimos un evento para cambiar el color del fondo
        amarillo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.getContentPane().setBackground(Color.YELLOW);
            }
            
        });

        azul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.getContentPane().setBackground(Color.BLUE);
            }
            
        });

        rojo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.getContentPane().setBackground(Color.RED);
            }
            
        });

        //Añadimos los elementos al menú
        menuColores.add(amarillo);
        menuColores.add(azul);
        menuColores.add(rojo);

        //Añadimos el menu hacia la barra del menú
        menuBar.add(menuColores);

        //Configuramos la barra del menu en el JFrame
        //Esto nos ayuda a que la barra este en la parte superior
        ventana.setJMenuBar(menuBar);

        // la hacemos visible
        ventana.setVisible(true);
    }
}
