package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class ventanaCerrarSesion extends JFrame{
	
	public ventanaCerrarSesion() {
		
		this.setTitle("Sistema Gestor de Inventario del Comedor - Cerrar Sesión");
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		JPanel panelOrg = new JPanel();

		panel1.setLayout(new GridLayout(1,2));
		panel2.setLayout(new GridLayout(2,1));
		
		panel3.setLayout(new BorderLayout());

		JLabel nombre = new JLabel("Nombre Usuario");
		nombre.setPreferredSize(new Dimension(300, 40));
		nombre.setForeground(new Color(255,255,255));
		nombre.setFont(new Font("SansSerif",Font.PLAIN, 16));
		JButton volver = new JButton("Volver al Menú");
		volver.setPreferredSize(new Dimension(200, 30));
		volver.setForeground(new Color(255,255,255));
		volver.setBackground(new Color(40, 120, 181));
		volver.setFont(new Font("SansSerif",Font.BOLD, 14));
		volver.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		JButton cerrar = new JButton("Cerrar Sesión");
		cerrar.setPreferredSize(new Dimension(300, 40));
		cerrar.setForeground(new Color(255,255,255));
		cerrar.setBackground(new Color(40, 120, 181));
		cerrar.setFont(new Font("SansSerif",Font.BOLD, 14));
		cerrar.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		ImageIcon imagen1 = new ImageIcon("6.png");
		Image imagenModificada6 = imagen1.getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado6 = new ImageIcon(imagenModificada6);
		JLabel contlabelIconoUsuario = new JLabel(iconoRedimensionado6);
		
		cerrar.setToolTipText("Cerrar Sesión");
		volver.setToolTipText("Volver al Menú");
		
		panel1.add(contlabelIconoUsuario);
		panel1.add(nombre);
		panel1.setBackground(new Color(30, 58, 95));
		
		panel2.add(volver);
		panel2.add(cerrar);
		panel2.setBackground(new Color(30, 58, 95));

		panel3.add(panel1, BorderLayout.NORTH);
		panel3.add(panel2, BorderLayout.SOUTH);
		panel3.setBackground(new Color(30, 58, 95));
		
		panelOrg.setBackground(new Color(30, 58, 95));
	
		ImageIcon fondo = new ImageIcon("fondo.png");
		Image fondoMod = fondo.getImage().getScaledInstance(1366,768, Image.SCALE_SMOOTH);
		ImageIcon fondoRed = new ImageIcon(fondoMod);
		JLabel lblFondo = new JLabel(fondoRed);
		lblFondo.setPreferredSize(new Dimension(1366,768));
		
		panelOrg.add(panel3, BorderLayout.CENTER);
		panelOrg.add(contlabelIconoUsuario, BorderLayout.NORTH);
		panelOrg.setBorder(new LineBorder(new Color(30, 58, 95), 5, true));
		
		lblFondo.setLayout(new GridBagLayout());		
		lblFondo.add(panelOrg);
		
		this.add(lblFondo);	
		
		volver.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {

				VentanaMenu menu = new VentanaMenu();
				menu.setVisible(true);
				
				setVisible(false);

			}			
		});
		
		cerrar.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {

				VentanaPrincipal inicio  = new VentanaPrincipal();
				inicio.setVisible(true);
				
				setVisible(false);

			}			
		});
		
		
	
	}
}
