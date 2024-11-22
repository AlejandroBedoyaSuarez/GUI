package JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2TextField {
    public static void main(String[] args) {
        // Creamos panel principal
        JFrame ventana = new JFrame("Ejemplo con JButton");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(4, 2, 10, 10));

        // Crear etiquetas y campos de texto
        JLabel userLabel = new JLabel("Nombre de usuario: ");
        JTextField userField = new JTextField();
        JLabel passwordLabel = new JLabel("Contraseña: ");
        JPasswordField passwordField = new JPasswordField();

        // Creamos el botón
        JButton loginButton = new JButton("Iniciar Sesión: ");
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        // Añadimos los componentes a la ventana
        ventana.add(userLabel);
        ventana.add(userField);
        ventana.add(passwordLabel);
        ventana.add(passwordField);
        ventana.add(new JLabel());
        ventana.add(loginButton);
        ventana.add(messageLabel);

        // visibilidad
        ventana.setVisible(true);

        // Variables para la lógica
        final String CORRECT_USER = "Alejandro";
        final String CORRECT_PASSWORD = "123";
        final int MAX_ATTEMPTS = 3;
        final int[] intentos = { 0 };

        // Acción de botón
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals(CORRECT_USER) && password.equals(CORRECT_PASSWORD)) {
                    JOptionPane.showMessageDialog(ventana, "Inicio de sesión exitoso");
                    ventana.dispose();
                } else {
                    intentos[0]++;

                    if (intentos[0] >= MAX_ATTEMPTS) {
                        JOptionPane.showMessageDialog(ventana, "Cerrando sesión");
                    } else {
                        JOptionPane.showMessageDialog(ventana, "Intentalo nuevamente");
                        userField.setText("");
                        passwordField.setText("");
                    }
                }

            }

        });
    }
}
