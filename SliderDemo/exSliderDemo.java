package SliderDemo;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class exSliderDemo implements ChangeListener {

    // Declaración de los componentes
    JFrame ventana; // Ventana principal
    JPanel panel;   // Panel para organizar los componentes
    JLabel label;   // Etiqueta para mostrar el valor actual del slider
    JSlider slider; // Deslizador (slider)

    exSliderDemo() {
        // Inicialización de los componentes
        ventana = new JFrame("Slider demo"); // Crear ventana con título
        panel = new JPanel();               // Crear panel
        label = new JLabel();               // Crear etiqueta
        slider = new JSlider(0, 100, 50);   // Crear slider con rango 0-100 y valor inicial 50

        // Configurar el tamaño preferido del slider
        slider.setPreferredSize(new Dimension(400, 200));

        // Configuración de las marcas menores y mayores
        slider.setPaintTicks(true);         // Habilitar las marcas en el deslizador
        slider.setMinorTickSpacing(10);     // Espaciado entre marcas menores (10 unidades)
        slider.setMajorTickSpacing(25);     // Espaciado entre marcas mayores (25 unidades)

        // Habilitar las etiquetas de los valores y personalizar la fuente
        slider.setPaintLabels(true);        // Mostrar etiquetas numéricas en el deslizador
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15)); // Cambiar fuente de las etiquetas

        // Configurar la orientación del slider
        slider.setOrientation(SwingConstants.VERTICAL); // Orientación vertical
        // slider.setOrientation(SwingConstants.HORIZONTAL); // Orientación horizontal

        // Configurar la etiqueta inicial con el valor del slider
        label.setText("°C = " + slider.getValue()); // Mostrar el valor inicial del slider
        label.setFont(new Font("MV Boli", Font.PLAIN, 15)); // Cambiar fuente de la etiqueta

        // Agregar un listener para detectar cambios en el valor del slider
        slider.addChangeListener(this);

        // Agregar componentes al panel
        panel.add(slider); 
        panel.add(label);

        // Configurar la ventana
        ventana.add(panel);          // Agregar panel a la ventana
        ventana.setSize(420, 420);   // Definir tamaño de la ventana
        ventana.setVisible(true);    // Hacer la ventana visible
    }

    // Implementación del método stateChanged para actualizar la etiqueta cuando cambia el valor del slider
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue()); // Actualizar el texto de la etiqueta
    }

    // Método main opcional para ejecutar el programa
    public static void main(String[] args) {
        new exSliderDemo(); // Crear instancia de la clase y mostrar la interfaz
    }
}