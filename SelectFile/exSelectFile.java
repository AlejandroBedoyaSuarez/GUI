package SelectFile;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class exSelectFile extends JFrame implements ActionListener {
    
    JButton button; //Button sacado del constructor

    //Constructor
    public exSelectFile(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);


        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) { //No reconocera el button hasta que lo saques fuera del constructor

            JFileChooser sacarArchivos = new JFileChooser();

            sacarArchivos.setCurrentDirectory(new File("C:\\Users\\Usuario-PC\\Desktop"));

            int response = sacarArchivos.showOpenDialog(null); //Select file to open

            //int response = sacarArchivos.showSaveDialog(null) //Sirve para que en vez de que salga  "Aceptar, Cancelar", salga "Guadar, Cancelar"

            if (response== sacarArchivos.APPROVE_OPTION) {

                File file = new File(sacarArchivos.getSelectedFile().getAbsolutePath());

                System.out.println(file);

            }
        }
    }    
}
