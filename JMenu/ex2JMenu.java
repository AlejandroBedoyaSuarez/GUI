package JMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2JMenu {
    public static void main(String[] args) {
        //Creamos un marco
        JFrame ventana = new JFrame("Menú Compuesto");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        //Creamos la barra de Menú
        JMenuBar menuBar= new JMenuBar();
        //Menú Principal "Archivo"
        JMenu menuArchivo = new JMenu("Archivo");
        //Creamos los elementos
        JMenuItem nuevo= new JMenuItem("Nuevo");
        JMenuItem abrir= new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir= new JMenuItem("Salir");

        //Acción para salir
        salir.addActionListener(e -> System.exit(0));
        
        //Añadimos elementos al menú Archivo
        menuArchivo.add(nuevo);
        menuArchivo.add(abrir);
        menuArchivo.add(guardar);
        menuArchivo.addSeparator();//Separador
        menuArchivo.add(salir);

         //Menú Principal "Editar"
         JMenu menuEditar = new JMenu("Editar");
         //Creamos los elementos
         JMenuItem copiar= new JMenuItem("Copiar");
         JMenuItem cortar= new JMenuItem("Cortar");
         JMenuItem pegar = new JMenuItem("Pegar");

         //SubMenú  "Editar"
         JMenu subMenuFormato = new JMenu("Formato");
         //Creamos los elementos
         JMenuItem negrita= new JMenuItem("Negrita");
         JMenuItem cursiva= new JMenuItem("Cursiva");
         JMenuItem subrayado = new JMenuItem("Subrayado");

         //Añadimos los elementos a "SubMenuFormato"
         subMenuFormato.add(negrita);
         subMenuFormato.add(cursiva);
         subMenuFormato.add(subrayado);

         //Añadimos los elementos al menú principal "Editar"
         menuEditar.add(copiar);
         menuEditar.add(cortar);
         menuEditar.add(pegar);
         menuEditar.addSeparator();
         menuEditar.add(subMenuFormato);

         //Menú Principal "Ver"
         //SubMenú  "Editar"
         JMenu menuVer = new JMenu("Ver");
         //Creamos los elementos
         JMenuItem zoomIn= new JMenuItem("Aumentar Zoom");
         JMenuItem zoomOut= new JMenuItem("Reducir Zoom");
         JMenuItem pantallaCompleta = new JMenuItem("Pantalla Completa");

         //añadimos los elementos al menuVer
         menuVer.add(zoomIn);
         menuVer.add(zoomOut);
         menuVer.add(pantallaCompleta);

         //Acciones  para cambiar el fondo con opciones
         negrita.addActionListener(e -> ventana.getContentPane().setBackground(Color.LIGHT_GRAY));
         cursiva.addActionListener(e -> ventana.getContentPane().setBackground(Color.GRAY));
         subrayado.addActionListener(e -> ventana.getContentPane().setBackground(Color.DARK_GRAY));

         //Añadimos los menú´s a la barra de Menu
         menuBar.add(menuArchivo);
         menuBar.add(menuEditar);
         menuBar.add(menuVer);

         //Configurar la barra de menú en el frame
         ventana.setJMenuBar(menuBar);

         //Hacemos que sea visible
         ventana.setVisible(true);


         
    }
}
