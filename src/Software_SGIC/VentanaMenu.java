package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class VentanaMenu extends JFrame {

	public VentanaMenu() {
		
		this.setLayout(new BorderLayout());
		this.setTitle("Sistema Gestor de Inventario del Comedor - Menú Principal");
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
					
		
		JPanel panelOrg = new JPanel();
		
		panelOrg.setLayout(new BorderLayout());
		
		JPanel panell = new JPanel();
		panell.setLayout(new BorderLayout());
	//	panell.setPreferredSize(new Dimension(1366, 768));


		JPanel panelCentro = new JPanel();
		JPanel botones = new JPanel(new GridLayout(4, 1, 0, 70));
		panelCentro.setLayout(new GridBagLayout());

		JButton menus = new JButton("Menús");
		JButton depositos = new JButton("Depósitos");
		JButton proovedores = new JButton("Proovedores");
		JButton platos = new JButton("Platos");

		botones.add(menus);
		botones.add(depositos);
		botones.add(proovedores);
		botones.add(platos);
		
				
		menus.setPreferredSize(new Dimension(320, 50));
		depositos.setPreferredSize(new Dimension(320, 50));
		proovedores.setPreferredSize(new Dimension(320, 50));
		platos.setPreferredSize(new Dimension(320, 50));

		menus.setBackground(new Color(40, 120, 181));
		depositos.setBackground(new Color(40, 120, 181));
		proovedores.setBackground(new Color(40, 120, 181));
		platos.setBackground(Color.gray);
		
		menus.setForeground(Color.white);
		depositos.setForeground(Color.white);
		proovedores.setForeground(Color.white);
		platos.setForeground(Color.white);
		
		menus.setFont(new Font("SansSerif", Font.BOLD, 25));
		depositos.setFont(new Font("SansSerif", Font.BOLD, 25));
		proovedores.setFont(new Font("SansSerif", Font.BOLD, 25));
		platos.setFont(new Font("SansSerif", Font.BOLD, 25));
		
		botones.setBackground(new Color(30, 58, 95));
		botones.setBorder(new LineBorder(new Color(30, 58, 95), 10, true));

		panelCentro.add(botones);
		panelCentro.setBounds(0,0, 400, 360);
	
		
		
		panell.add(panelCentro, BorderLayout.CENTER);
		
		JPanel interfazSup = new JPanel();
		interfazSup.setLayout(new BoxLayout(interfazSup, BoxLayout.X_AXIS));
		
		ImageIcon imagen6 = new ImageIcon("6.png");
		Image imagenModificada6 = imagen6.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado6 = new ImageIcon(imagenModificada6);
		JButton lblContImgn6 = new JButton(iconoRedimensionado6);
		lblContImgn6.setPreferredSize(new Dimension(40,40));
		lblContImgn6.setMinimumSize(new Dimension(40,40));
		lblContImgn6.setMaximumSize(new Dimension(50,50));
		lblContImgn6.setBorder(new LineBorder(new Color(30, 58, 95), 4, false));

		ImageIcon imagen7 = new ImageIcon("7.png");
		Image imagenModificada7 = imagen7.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado7 = new ImageIcon(imagenModificada7);
		JButton lblContImgn7 = new JButton(iconoRedimensionado7);
		lblContImgn7.setPreferredSize(new Dimension(50,50));
		
		JLabel nombreUsua = new JLabel(" Nombre de Usuario ");
		nombreUsua.setPreferredSize(new Dimension(200, 40));
		nombreUsua.setForeground(new Color(255,255,255));
		nombreUsua.setOpaque(true);
		nombreUsua.setBackground(new Color(30,58,95));
		nombreUsua.setFont(new Font("SansSerif",Font.PLAIN, 15));
		nombreUsua.setBorder(new LineBorder(new Color(30,58,95), 4, true));
		

		interfazSup.add(lblContImgn6);
		interfazSup.add(nombreUsua);
		
		panelOrg.add(panell, BorderLayout.SOUTH);
		panelOrg.add(interfazSup, BorderLayout.WEST);
		panelOrg.add(lblContImgn7, BorderLayout.EAST);
		panell.setPreferredSize(new Dimension(1250, 618));
		panell.setOpaque(false);
		panelOrg.setOpaque(false);
		interfazSup.setOpaque(false);
		panelCentro.setOpaque(false);

		
		ImageIcon fondo = new ImageIcon("fondo.png");
		Image fondoMod = fondo.getImage().getScaledInstance(1366,768, Image.SCALE_SMOOTH);
		ImageIcon fondoRed = new ImageIcon(fondoMod);
		JLabel lblFondo = new JLabel(fondoRed);
		lblFondo.setPreferredSize(new Dimension(1366,768));
		
		lblFondo.setLayout(new FlowLayout());		
		lblFondo.add(panelOrg);
		
		this.add(lblFondo);
		
		
		menus.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			System.out.println("Menus");
			
			ventanaMenus menus = new ventanaMenus();
			menus.setVisible(true);
			
			setVisible(false);
				
			}
		});
		
		proovedores.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			System.out.println("Proovedores");
			
			ventanaProovedores proovedores = new ventanaProovedores();
			proovedores.setVisible(true);
			
			setVisible(false);
				
			}
		});
		
		depositos.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			System.out.println("Depositos");
				
			ventanaDepósito depositos = new ventanaDepósito();
			depositos.setVisible(true);
			
			setVisible(false);

			}
		});
		
		platos.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Platos");
				
				ventanaContenidoMenu ventanaContMenu = new ventanaContenidoMenu();
				ventanaContMenu.setVisible(true);
				
				setVisible(false);
				
			}
		});
		
		
		//botón salir
		
			lblContImgn7.addActionListener(new ActionListener() {
				//@Override	
				public void actionPerformed(ActionEvent e) {
					System.out.println("Salir");
					
					ventanaSalir salir = new ventanaSalir();
					salir.setVisible(true);

				}			
			});
				
		//botón Usuario
				
			lblContImgn6.addActionListener(new ActionListener() {
				//@Override	
				public void actionPerformed(ActionEvent e) {
					System.out.println("Usuario");
					
					ventanaCerrarSesion usuario = new ventanaCerrarSesion();
					usuario.setVisible(true);
					
					setVisible(false);
				}			
			});		
		
		

	}

	

}
