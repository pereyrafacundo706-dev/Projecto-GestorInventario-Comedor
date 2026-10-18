package Software_SGIC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class VentanaInicioSesion extends JFrame {

	public VentanaInicioSesion() {

		this.setLayout(new BorderLayout());
		this.setUndecorated(true); 
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		JTextField nombreIng = new JTextField("Ingresar nombre", 14);
		JTextField contraIng = new JTextField("Ingresar contraseña", 14);
		nombreIng.setFont(new Font("SansSerif", Font.PLAIN, 20));
		contraIng.setFont(new Font("SansSerif", Font.PLAIN, 20));
		nombreIng.setBackground(Color.white);
		contraIng.setBackground(Color.white);
		nombreIng.setBorder(new LineBorder(new Color(40, 120, 181), 2, false));
		contraIng.setBorder(new LineBorder(new Color(40, 120, 181), 2, false));

		
		JPanel panelCentro = new JPanel();
		JLayeredPane panell = new JLayeredPane();
		panell.setPreferredSize(new Dimension(1366, 768));
		
		ImageIcon imagen1 = new ImageIcon("10.png");
		Image imagenModificada6 = imagen1.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado6 = new ImageIcon(imagenModificada6);
		JLabel contlabelIconoUsuario = new JLabel(iconoRedimensionado6);
		JButton iniciarMenu = new JButton("Ingresar");
		iniciarMenu.setFont(new Font("SansSerif", Font.BOLD, 15));	
		iniciarMenu.setBackground(new Color(40, 120, 181));
		iniciarMenu.setForeground(Color.white);
		JButton registroMenu = new JButton("Registrarse");
		registroMenu.setFont(new Font("SansSerif", Font.BOLD, 15));	
		registroMenu.setBackground(new Color(40, 120, 181));
		registroMenu.setForeground(Color.white);

		iniciarMenu.setToolTipText("Iniciar Sesión");
		registroMenu.setToolTipText("Crear Nuevo Usuario");
		
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
		iniciarMenu.setBounds(562, 500, 100, 50);
		registroMenu.setBounds(696, 500, 100, 50);



		panell.add(panelCentro);
		panell.add(contlabelIconoUsuario);
		panell.add(iniciarMenu);
		panell.add(registroMenu);


		panell.setLayer(panelCentro, 1);
		panell.setLayer(contlabelIconoUsuario, 2);
		panell.setLayer(iniciarMenu, 2);
		panell.setLayer(registroMenu, 2);

		
		Border bordeboton = BorderFactory.createLineBorder(new Color(255,255,255), 2);
		iniciarMenu.setBorder(bordeboton);
		registroMenu.setBorder(bordeboton);
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
		
		registroMenu.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
								
				ventanaRegistroUsuario ventanaRegistro = new ventanaRegistroUsuario();
				ventanaRegistro.setVisible(true);				
			}
		});

			
		
	}
}
