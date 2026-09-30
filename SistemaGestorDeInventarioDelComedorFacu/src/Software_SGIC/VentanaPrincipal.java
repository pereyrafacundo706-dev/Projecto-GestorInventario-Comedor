package Software_SGIC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {

		this.setLayout(new BorderLayout());
		this.setTitle("Sistema Gestor de Inventario de Comedor");
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);

		JLabel nombrePrograma = new JLabel("<html><center>Sistema Gestor de Inventario de<br>Comedor</center></html>");
		nombrePrograma.setHorizontalAlignment(SwingConstants.CENTER);

		JButton iniciar = new JButton("Iniciar Sesion");
		JButton salir = new JButton("Salir");

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panelbotones = new JPanel();

		

		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

		panelbotones.setBackground(new Color(30, 58, 95));
		panelbotones.setLayout(new GridLayout(2, 1, 0, 10));
		panelbotones.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelbotones.setMaximumSize(new Dimension(430, 50));

		panel1.setBackground(new Color(30, 58, 95));
		panel2.setBackground(new Color(40, 120, 181));
		panel3.setBackground(new Color(40, 120, 181));

		panel2.setPreferredSize(new Dimension(1360, 180));
		panel3.setPreferredSize(new Dimension(1360, 210));
		panel1.setPreferredSize(new Dimension(1360, 350));
		

		nombrePrograma.setForeground(new Color(255, 255, 255));
		nombrePrograma.setFont(new Font("Montserrat", Font.BOLD, 60));
		nombrePrograma.setPreferredSize(new Dimension(1100, 300));
		nombrePrograma.setAlignmentX(CENTER_ALIGNMENT);

		panel1.add(nombrePrograma);
		panel1.add(panelbotones);
		iniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
		salir.setAlignmentX(Component.CENTER_ALIGNMENT);

		panelbotones.add(iniciar);
		panelbotones.add(salir);

		iniciar.setFont(new Font("SansSerif", Font.BOLD, 20));		
		salir.setFont(new Font("SansSerif", Font.BOLD, 20));		
		iniciar.setBackground(new Color(255, 255, 255));
		salir.setBackground(new Color(255, 255, 255));

		panelbotones.setLayout(new GridLayout(2, 1, 0, 10));

	
		ImageIcon imagen1 = new ImageIcon("9.png");
		JLabel contlabelimagen1 = new JLabel(imagen1);
		contlabelimagen1.setPreferredSize(new Dimension(450,100));

		panel3.add(contlabelimagen1);
		
		Border bordeBoton = BorderFactory.createLineBorder(new Color(40, 120, 181), 6);
		iniciar.setBorder(bordeBoton);
		salir.setBorder(bordeBoton);
		
		this.add(panel1);
		this.add(panel2, BorderLayout.NORTH);
		this.add(panel3, BorderLayout.SOUTH);
		
		iniciar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				VentanaInicioSesion ventanamenu = new VentanaInicioSesion();
				ventanamenu.setVisible(true);
				setVisible(false);
			
				
			}
		});
		
		salir.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				ventanaSalir salir = new ventanaSalir();
				salir.setVisible(true);
				
			}
		});
	}

}
