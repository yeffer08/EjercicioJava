
package views;

import java.awt.*;
import javax.swing.*;


public class login extends JFrame {
    public Container cp = getContentPane();
    public JPanel panel = new JPanel();

    public login() {
        setTitle("Bienvenido al sistema academico CUL");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));
        iniciarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {

        colocarEtiqueta();
        colocarBotones();
        colocarCajasTexto();
        colocarPanel();
    }

    private void colocarPanel() {

        panel.setLayout(null);
        panel.setBackground(Color.WHITE);// color de fondo
        cp.add(panel);
    }

    private void colocarEtiqueta() {
        JLabel etiqueta = new JLabel("Correo Electronico:");// SwingConstants.LEFT aliniacion del texto
        JLabel etiqueta2 = new JLabel("Contraseña:");
        ImageIcon image = new ImageIcon("src/views/logo.png");
        JLabel etiqueta3 = new JLabel(image);
        JLabel etiqueta4 = new JLabel("Olvido contraseña");
        JLabel etiqueta5 = new JLabel("we'll never share your email with anyone else");
        etiqueta.setBounds(350, 150, 150, 30);
        etiqueta2.setBounds(350, 300, 90, 30);
        etiqueta3.setBounds(3, 87, 350, 350);
        etiqueta4.setBounds(512, 350, 150, 30);
        etiqueta5.setBounds(355, 200, 270, 30);
        etiqueta3.setIcon(new ImageIcon(image.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
        etiqueta.setForeground(Color.black);// color de letras
        // etiqueta.setOpaque(true);//permiso de fondo de etiquetas
        etiqueta.setFont(new Font("arial", 3, 14));// establecer fuente de texto (Se pueden colocar con numeros 3=Negrita y cursiva)
        etiqueta2.setFont(new Font("arial", 3, 14));
        etiqueta4.setFont(new Font("arial",1,10));
        etiqueta4.setForeground(Color.BLUE);
        etiqueta5.setFont(new Font("arial",2,9));
        etiqueta5.setForeground(Color.GRAY);
        etiqueta3.setHorizontalAlignment(SwingConstants.LEFT);
        
        
        panel.add(etiqueta);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(etiqueta5);
    }

    private void colocarBotones() {
        JButton btn1 = new JButton("Ingresar");
        btn1.setBounds(360, 420, 250,40);
        //btn1.setEnabled(true); estado del boton
        //btn1.setMnemonic('a'); alt + a presiona boton
        btn1.setForeground(Color.WHITE);
        btn1.setFont(new Font("cooper black", 2, 14));
        btn1.setBackground(new java.awt.Color(6,110,222));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(9,70,202), 5, true));
        panel.add(btn1);
    }

    private void colocarCajasTexto() {
        JTextField cajaEmail = new JTextField();
        JTextField cajaPassword = new JTextField();
        cajaEmail.setBounds(355, 180, 250, 28);
        cajaPassword.setBounds(355, 330, 250, 28);
        cajaEmail.setFont(new Font("arial", 1, 14));
        cajaPassword.setFont(new Font("arial", 1, 14));
        panel.add(cajaEmail);
        panel.add(cajaPassword);
    }

}
