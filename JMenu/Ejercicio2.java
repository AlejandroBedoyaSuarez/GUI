package JMenu;
import javax.swing.*;
import java.awt.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Creamos un marco
        JFrame ventana = new JFrame("Menú Compuesto");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        //Creamos la barra de Menú
        JMenuBar menuBar = new JMenuBar();
        //Menú Principal "Archivo"
        JMenu menuArchivo = new JMenu("Archivo");
        //Creamos los elementos
        JMenuItem nuevo = new JMenuItem("Nuevo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");

        //Acción para salir
        salir.addActionListener(e -> System.exit(0));

        //Añadimos elementos al menú Archivo
        menuArchivo.add(nuevo);
        menuArchivo.add(abrir);
        menuArchivo.add(guardar);
        menuArchivo.addSeparator(); //Separador
        menuArchivo.add(salir);

        //Menú Principal "Editar"
        JMenu menuEditar = new JMenu("Editar");
        //Creamos los elementos
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");

        //SubMenú  "Editar"
        JMenu subMenuFormato = new JMenu("Formato");
        //Creamos los elementos
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        JMenuItem subrayado = new JMenuItem("Subrayado");

        // Acción para "Cursiva": Verificar número perfecto
        cursiva.addActionListener(e -> {
            // Solicitar un número al usuario
            String input = JOptionPane.showInputDialog(ventana, "Ingrese un número para verificar si es perfecto:", "Verificar Número Perfecto", JOptionPane.QUESTION_MESSAGE);
            if (input != null && !input.isEmpty()) {
                int numero = Integer.parseInt(input);

                // Verificar si el número es perfecto dentro del mismo método
                int sumaDivisores = 0;
                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) {
                        sumaDivisores += i;
                    }
                }
                boolean esPerfecto = (sumaDivisores == numero);

                // Mostrar el resultado
                if (esPerfecto) {
                    JOptionPane.showMessageDialog(ventana, numero + " es un número perfecto.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(ventana, numero + " no es un número perfecto.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

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
        JMenu menuVer = new JMenu("Ver");
        //Creamos los elementos
        JMenuItem zoomIn = new JMenuItem("Aumentar Zoom");
        JMenuItem zoomOut = new JMenuItem("Reducir Zoom");
        JMenuItem pantallaCompleta = new JMenuItem("Pantalla Completa");

        //Añadimos los elementos al menuVer
        menuVer.add(zoomIn);
        menuVer.add(zoomOut);
        menuVer.add(pantallaCompleta);

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