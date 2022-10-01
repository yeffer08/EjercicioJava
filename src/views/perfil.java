package views;

import java.awt.*;
import javax.swing.*;


public class perfil extends JFrame {
    public Container cp = getContentPane();
    public JPanel panel = new JPanel();
    
    public perfil() {
        setTitle("Nuevo Usuario");
        setSize(700, 700);
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
        JLabel etiqueta1 = new JLabel("Nombres:");
        JLabel etiqueta2 = new JLabel("Apellidos:");
        JLabel etiqueta3 = new JLabel("Fecha de Nacimiento:");
        JLabel etiqueta4 = new JLabel("Genero:");
        JLabel etiqueta5 = new JLabel("Correo Electronico:");
        JLabel etiqueta6 = new JLabel("Dirreccion Residencia:");
        JLabel etiqueta7 = new JLabel("Departamento:");
        JLabel etiqueta8 = new JLabel("Ciudad:");
        JLabel etiqueta9 = new JLabel("Barrio:");
        etiqueta1.setBounds(50, 20, 150, 30);
        etiqueta2.setBounds(350, 20, 150, 30);
        etiqueta3.setBounds(50, 120, 150, 30);
        etiqueta4.setBounds(350, 120, 150, 30);
        etiqueta5.setBounds(50, 200, 150, 30);
        etiqueta6.setBounds(50, 280, 150, 30);
        etiqueta7.setBounds(50, 370, 150, 30);
        etiqueta8.setBounds(220, 370, 150, 30);
        etiqueta9.setBounds(380, 370, 150, 30);

        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(etiqueta3);
        panel.add(etiqueta4);
        panel.add(etiqueta5);
        panel.add(etiqueta6);
        panel.add(etiqueta7);
        panel.add(etiqueta8);
        panel.add(etiqueta9);

    }

    private void colocarBotones() {

        JButton btnGenerar = new JButton("Generar Contraseña");
        JButton btnSiguiente = new JButton("Siguiente");
        JButton btnPrimero = new JButton("Primero");
        JButton btnAnterior = new JButton("Anterior");
        JButton btnUltimo = new JButton("Ultimo");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnImprimir = new JButton("Imprimir");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnGuardar = new JButton("Guardar");
        btnSiguiente.setFont(new Font("arial", 1, 10));
        btnPrimero.setFont(new Font("arial", 1, 10));
        btnAnterior.setFont(new Font("arial", 1, 10));
        btnUltimo.setFont(new Font("arial", 1, 10));
        btnEliminar.setFont(new Font("arial", 1, 10));
        btnImprimir.setFont(new Font("arial", 1,10));
        btnBuscar.setFont(new Font("arial", 1, 10));
        btnGuardar.setFont(new Font("arial", 1, 10));

        btnGenerar.setBounds(400, 235, 200, 27);
        btnSiguiente.setBounds(95, 490, 80, 27);
        btnPrimero.setBounds(50, 525, 80, 27);
        btnAnterior.setBounds(145, 525, 80, 27);
        btnUltimo.setBounds(95, 560, 80, 27);

        btnEliminar.setBounds(270, 525, 80, 27);

        btnImprimir.setBounds(370, 525, 78, 27);
        btnBuscar.setBounds(455, 525, 78, 27);
        btnGuardar.setBounds(540, 525, 78, 27);

        panel.add(btnGenerar);
        panel.add(btnSiguiente);
        panel.add(btnAnterior);
        panel.add(btnPrimero);
        panel.add(btnUltimo);
        panel.add(btnEliminar);
        panel.add(btnImprimir);
        panel.add(btnBuscar);
        panel.add(btnGuardar);

        
    }

    private void colocarCajasTexto() {
        JTextField cajaNombres = new JTextField();
        JTextField cajaApellidos = new JTextField();
        JTextField cajaEmail = new JTextField();
        JTextField cajaResidencia = new JTextField();
        JTextField cajaBarrio = new JTextField();
        JTextField cajaFechaNacimiento = new JTextField();

        // Combo box

        JComboBox ComboBoxGenero = new javax.swing.JComboBox<>(new String[] { "Hombre", "Mujer", "Otro", " ", " " });
        JComboBox ComboBoxCiudad = new javax.swing.JComboBox<>(new String[] { "Barranquilla", "Medellin", "Cartagena", " ", " " });
        JComboBox ComboBoxDepartamento = new javax.swing.JComboBox<>(new String[] { "Barranquilla", "Medellin", "Cartagena", " ", " " });




        cajaNombres.setBounds(50, 55, 250, 28);
        cajaApellidos.setBounds(350, 55, 250, 28);
        cajaEmail.setBounds(50, 235, 330, 28);
        cajaResidencia.setBounds(50, 315, 550, 28);
        cajaBarrio.setBounds(380, 400, 219, 30);
        cajaFechaNacimiento.setBounds(50, 156, 250, 28);
        cajaFechaNacimiento.setText(("01/02/2000"));
        ComboBoxGenero.setBounds(350, 155, 250, 28);
        ComboBoxCiudad.setBounds(220, 400, 150, 30);
        ComboBoxDepartamento.setBounds(50, 400, 150, 30);
        


        panel.add(cajaNombres);
        panel.add(cajaApellidos);
        panel.add(cajaFechaNacimiento);
        panel.add(cajaEmail);
        panel.add(cajaResidencia);
        panel.add(cajaBarrio);
        panel.add(ComboBoxGenero);
        panel.add(ComboBoxDepartamento);
        panel.add(ComboBoxCiudad);

    }
    
}
