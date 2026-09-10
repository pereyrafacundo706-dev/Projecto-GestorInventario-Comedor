package Software_SGIC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class VentanaInicioSesion extends JFrame {

	public VentanaInicioSesion() {

		this.setLayout(new BorderLayout());
		this.setTitle("Sistema Gestor de Inventario del Comedor - Iniciar Sesión");
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		JTextField nombreIng = new JTextField("Ingresar nombre", 14);
		JTextField contraIng = new JTextField("Ingresar contraseña", 14);
		nombreIng.setFont(new Font("SansSerif", Font.PLAIN, 20));
		contraIng.setFont(new Font("SansSerif", Font.PLAIN, 20));
		nombreIng.setBackground(new Color(40, 120, 181));
		contraIng.setBackground(new Color(40, 120, 181));
		nombreIng.setForeground(Color.white);
		contraIng.setForeground(Color.white);

		
		JPanel panelCentro = new JPanel();
		JLayeredPane panell = new JLayeredPane();
		panell.setPreferredSize(new Dimension(1366, 768));
		
		ImageIcon imagen1 = new ImageIcon("10.png");
		Image imagenModificada6 = imagen1.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado6 = new ImageIcon(imagenModificada6);
		JLabel contlabelIconoUsuario = new JLabel(iconoRedimensionado6);
		JButton iniciarMenu = new JButton("Iniciar");
		iniciarMenu.setFont(new Font("SansSerif", Font.BOLD, 15));		

		JPanel panelTextfields = new JPanel(new GridLayout(2, 1, 0, 40));
		panelTextfields.add(nombreIng);
		panelTextfields.add(contraIng);
		panelTextfields.setBackground(new Color(30, 58, 95));

		panelCentro.setBackground(new Color(30, 58, 95));
		panelCentro.add(panelTextfields);

		panelCentro.setLayout(new GridBagLayout());
		panelCentro.setPreferredSize(new Dimension(400, 300));

		panelCentro.setBounds(483, 234, 400, 300);
		contlabelIconoUsuario.setBounds(601, 140, 160, 160);
		iniciarMenu.setBounds(629, 500, 100, 50);

		panell.add(panelCentro);
		panell.add(contlabelIconoUsuario);
		panell.add(iniciarMenu);

		panell.setLayer(panelCentro, 1);
		panell.setLayer(contlabelIconoUsuario, 2);
		panell.setLayer(iniciarMenu, 2);
		
		Border bordeboton = BorderFactory.createLineBorder(new Color(30, 58, 95), 6);
		iniciarMenu.setBorder(bordeboton);
		iniciarMenu.setBackground(new Color(255, 255 ,255));
		panelCentro.setMaximumSize(new Dimension(400, 200));
		
		ImageIcon fondo = new ImageIcon("fondo.png");
		Image fondoMod = fondo.getImage().getScaledInstance(1366,768, Image.SCALE_SMOOTH);
		ImageIcon fondoRed = new ImageIcon(fondoMod);
		JLabel lblFondo = new JLabel(fondoRed);
		lblFondo.setPreferredSize(new Dimension(1366,768));
		
		lblFondo.setLayout(new FlowLayout());
		lblFondo.add(panell);
		this.add(lblFondo);

		
		iniciarMenu.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
								
				VentanaMenu ventanamenu = new VentanaMenu();
				ventanamenu.setVisible(true);
				setVisible(false);
				
			}
		});

			
		
	}
}
