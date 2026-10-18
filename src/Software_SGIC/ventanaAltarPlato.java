package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
public class ventanaAltarPlato extends JFrame{
	
	ArrayList <String> listaIngs = new ArrayList<>();
	private DefaultTableModel modelo = new DefaultTableModel();
	private ventanaContenidoMenu ventanaContMenu;
	
	GestorVentanas gestor = new GestorVentanas();

	public ventanaAltarPlato() {
		
		this.setTitle("Sistema Gestor de Inventario de Comedor - Altar Plato"); 
		this.setUndecorated(true); 
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false); 
		this.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel(); //grilla principal
		JPanel panel2 = new JPanel(); //título
		JPanel panel3 = new JPanel(); //todo
		JPanel interfazSup = new JPanel(); 
		JPanel panelOrg = new JPanel();
		
		panel1.setLayout(new GridLayout(3,5));
		panel2.setLayout(new GridLayout(1,2));
		panel3.setLayout(new BorderLayout());
		panelOrg.setLayout(new BorderLayout());
		interfazSup.setLayout(new BoxLayout(interfazSup,BoxLayout.X_AXIS));

		// interfaz sup
		
		ImageIcon imagen6 = new ImageIcon("6.png");
		Image imagenModificada6 = imagen6.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado6 = new ImageIcon(imagenModificada6);
		JButton lblContImgn6 = new JButton(iconoRedimensionado6);
		lblContImgn6.setPreferredSize(new Dimension(40,40));
		lblContImgn6.setMinimumSize(new Dimension(40,40));
		lblContImgn6.setMaximumSize(new Dimension(50,50));
	//	lblContImgn6.setBorder(new LineBorder(new Color(30, 58, 95), 4, false));
		
		ImageIcon imagen4 = new ImageIcon("4.png");
		Image imagenModificada4 = imagen4.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado4 = new ImageIcon(imagenModificada4);
		JButton lblContImgn4 = new JButton(iconoRedimensionado4);
		lblContImgn4.setPreferredSize(new Dimension(40,40));
		lblContImgn4.setMinimumSize(new Dimension(40,40));
		lblContImgn4.setMaximumSize(new Dimension(50,50));
		lblContImgn4.setBorder(new LineBorder(new Color(229, 209, 104), 2, false));
		
		ImageIcon imagen7 = new ImageIcon("7.png");
		Image imagenModificada7 = imagen7.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado7 = new ImageIcon(imagenModificada7);
		JButton lblContImgn7 = new JButton(iconoRedimensionado7);
		lblContImgn7.setPreferredSize(new Dimension(50,50));
		
		JLabel nombreUsu = new JLabel(" Nombre de Usuario ");
		nombreUsu.setPreferredSize(new Dimension(200, 40));
		nombreUsu.setForeground(new Color(255,255,255));
		nombreUsu.setOpaque(true);
		nombreUsu.setBackground(new Color(30,58,95));
		nombreUsu.setFont(new Font("SansSerif",Font.PLAIN, 15));
		nombreUsu.setBorder(new LineBorder(new Color(30,58,95), 4, true));
	
		lblContImgn6.setToolTipText("Cerrar Sesión");
		lblContImgn7.setToolTipText("Cerrar Programa");
		lblContImgn4.setToolTipText("Retroceder");
		
		interfazSup.add(lblContImgn6);
		interfazSup.add(nombreUsu);
		interfazSup.add(lblContImgn4);
		
		//panel 1
		
		JLabel atributo1 = new JLabel("Nombre:");
		atributo1.setPreferredSize(new Dimension(200, 30));
		atributo1.setForeground(new Color(255,255,255));
		atributo1.setFont(new Font("SansSerif",Font.PLAIN, 15));
		atributo1.setBorder(new LineBorder(new Color(40, 120, 181), 1, true));
		JLabel atributo2 = new JLabel("ID:");
		atributo2.setPreferredSize(new Dimension(200, 30));
		atributo2.setForeground(new Color(255,255,255));
		atributo2.setFont(new Font("SansSerif",Font.PLAIN, 15));
		atributo2.setBorder(new LineBorder(new Color(40, 120, 181), 1, true));
		JLabel atributo3 = new JLabel("Receta:");
		atributo3.setPreferredSize(new Dimension(200, 30));
		atributo3.setForeground(new Color(255,255,255));
		atributo3.setFont(new Font("SansSerif",Font.PLAIN, 15));
		atributo3.setBorder(new LineBorder(new Color(40, 120, 181), 1, true));
		JLabel atributo4 = new JLabel("Ingredientes:");
		atributo4.setPreferredSize(new Dimension(200, 30));
		atributo4.setForeground(new Color(255,255,255));
		atributo4.setFont(new Font("SansSerif",Font.PLAIN, 15));
		atributo4.setBorder(new LineBorder(new Color(40, 120, 181), 1, true));
		JLabel atributo5 = new JLabel("Tipo:");
		atributo5.setPreferredSize(new Dimension(200, 30));
		atributo5.setForeground(new Color(255,255,255));
		atributo5.setFont(new Font("SansSerif",Font.PLAIN, 15));
		atributo5.setBorder(new LineBorder(new Color(40, 120, 181), 1, true));
		
		
		JLabel espacio1 = new JLabel("");
		JLabel espacio2 = new JLabel("");
		JLabel espacio3 = new JLabel("");
		JLabel espacio4 = new JLabel("");
		JLabel espacio5 = new JLabel("");


				
		JTextField atributo1C = new JTextField(15);
		atributo1C.setPreferredSize(new Dimension(200, 30));
		atributo1C.setForeground(new Color(255,255,255));
		atributo1C.setBackground(new Color(40,120,181));
		atributo1C.setFont(new Font("SansSerif",Font.BOLD, 15));
		JLabel atributo2C = new JLabel("Selección Automática");
		atributo2C.setPreferredSize(new Dimension(200, 30));
		atributo2C.setForeground(new Color(255,255,255));
		atributo2C.setOpaque(true);
		atributo2C.setBackground(new Color(40,120,181));
		atributo2C.setFont(new Font("SansSerif",Font.ITALIC, 15));
		JTextField atributo3C = new JTextField();
		atributo3C.setPreferredSize(new Dimension(200, 30));
		atributo3C.setForeground(new Color(255,255,255));
		atributo3C.setBackground(new Color(40,120,181));
		atributo3C.setFont(new Font("SansSerif",Font.BOLD, 15));
		JButton atributo4C = new JButton("Seleccionar");
		atributo4C.setPreferredSize(new Dimension(200, 30));
		atributo4C.setForeground(new Color(255,255,255));
		atributo4C.setBackground(new Color(40,120,181));
		atributo4C.setFont(new Font("SansSerif",Font.BOLD, 15));
		atributo4C.setBorder(new LineBorder(new Color(229, 209, 104), 3, true));
		String[] tipos = {"Indefinido", "Almuerzo", "Cena", "Merienda", "Desayuno"};
		JComboBox atributo5C = new JComboBox(tipos);
		atributo5C.setPreferredSize(new Dimension(200, 30));
		atributo5C.setForeground(new Color(255,255,255));
		atributo5C.setBackground(new Color(40,120,181));
		atributo5C.setFont(new Font("SansSerif",Font.BOLD, 15));		
		
		
		panel1.add(atributo1);
		panel1.add(atributo1C);
		panel1.add(espacio1);
		panel1.add(atributo3);
		panel1.add(atributo3C);
		panel1.add(atributo2);
		panel1.add(atributo2C);
		panel1.add(espacio2);
		panel1.add(atributo5);
		panel1.add(atributo5C);
		panel1.add(atributo4);
		panel1.add(atributo4C);
		panel1.add(espacio3);
		panel1.add(espacio4);
		panel1.add(espacio5);


		
		//panel1.setPreferredSize(new Dimension(1150, 518));
		panel1.setBounds(0, 0, 1150, 518);
		panel1.setOpaque(true);
		panel1.setBackground(new Color(30,58,95));
		
		JPanel subOrg1 = new JPanel();
		subOrg1.setLayout(new BorderLayout());
		
		subOrg1.add(panel1, BorderLayout.NORTH);
		
		JPanel panelIng = new JPanel();
		panelIng.setVisible(false);
		panelIng.setOpaque(false);
		panelIng.setLayout(new BorderLayout());
		
		String[] columnas = {"ID", "Ingrediente", "Selección"};

		DefaultTableModel tabla = new DefaultTableModel(columnas, 0) {
		    
		    @Override
		    public Class<?> getColumnClass(int columnIndex) {
		        if (columnIndex == 2) {
		            return Boolean.class;
		        }
		        return String.class;
		    }

		};
		
		gestor.listarIngredientesPlato(tabla);

		
		
		JTable tablita = new JTable(tabla);
		tablita.setFont(new Font("Arial", Font.PLAIN, 12));
		JScrollPane scroll = new JScrollPane(tablita);
		panelIng.add(scroll, BorderLayout.NORTH);
		
		scroll.setPreferredSize(new Dimension(600,300));
		
		JButton guardarIngs = new JButton("Confirmar");
		guardarIngs.setPreferredSize(new Dimension(100, 50));
		guardarIngs.setForeground(new Color(255,255,255));
		guardarIngs.setOpaque(true);
		guardarIngs.setBackground(new Color(40, 120, 181));
		guardarIngs.setFont(new Font("SansSerif",Font.BOLD, 15));
		guardarIngs.setHorizontalAlignment(SwingConstants.CENTER);
		guardarIngs.setBorder(new LineBorder(new Color(229, 209, 104), 3, true));
		
		panelIng.add(guardarIngs, BorderLayout.SOUTH);
		
		guardarIngs.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				
				panelIng.setVisible(false);
				
			}			
		});
		
		subOrg1.add(panelIng, BorderLayout.SOUTH);
		
		JPanel panelOrg1 = new JPanel();
		panelOrg1.setLayout(new FlowLayout());
		panelOrg1.add(subOrg1);
		
		//panel2
		
		JLabel titulo1 = new JLabel("Ingresar Plato");
		titulo1.setPreferredSize(new Dimension(200, 30));
		titulo1.setForeground(new Color(255,255,255));
		titulo1.setOpaque(true);
		titulo1.setBackground(new Color(191, 97, 97));
		titulo1.setFont(new Font("SansSerif",Font.BOLD, 15));
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);

		panel2.add(titulo1);
		panel2.setBackground(new Color(30,58,95));

		JPanel panelOrg2 = new JPanel();
		panelOrg2.setLayout(new FlowLayout());
		panelOrg2.add(panel2);
		panelOrg2.setBackground(new Color(30,58,95));
		
		//panel3
		
		JButton guardar = new JButton("GUARDAR");
		guardar.setPreferredSize(new Dimension(200, 50));
		guardar.setForeground(new Color(255,255,255));
		guardar.setOpaque(true);
		guardar.setBackground(new Color(40, 120, 181));
		guardar.setFont(new Font("SansSerif",Font.BOLD, 15));
		guardar.setHorizontalAlignment(SwingConstants.CENTER);
		guardar.setBorder(new LineBorder(new Color(229, 209, 104), 3, true));
		guardar.setToolTipText("Guardar Nuevo Elemento");

		
		panel3.add(panelOrg1, BorderLayout.CENTER);
		panel3.add(panelOrg2, BorderLayout.NORTH);
		
		JPanel panelbtnInf = new JPanel();
		panelbtnInf.setLayout(new FlowLayout());
		panelbtnInf.add(guardar);
		panelbtnInf.setBackground(new Color(30,58,95));
		panel3.add(panelbtnInf, BorderLayout.SOUTH);


		
		//panelOrg
		
		panelOrg.add(panel3, BorderLayout.SOUTH);
		
		JPanel interfazOrg = new JPanel();

		interfazOrg.setLayout(new BorderLayout());
		interfazOrg.add(interfazSup, BorderLayout.WEST);
		interfazOrg.add(lblContImgn7,BorderLayout.EAST);
		panel3.setBackground(new Color(30,58,95));
		panel3.setPreferredSize(new Dimension(1250, 648));
		
		panelOrg.add(interfazOrg, BorderLayout.NORTH);
		
		//fondo
		panelOrg.setOpaque(false);
		interfazSup.setOpaque(false);
		interfazOrg.setOpaque(false);
		panelOrg1.setOpaque(false);
		subOrg1.setOpaque(false);

		
		ImageIcon fondo = new ImageIcon("fondo.png");
		Image fondoMod = fondo.getImage().getScaledInstance(1366,768, Image.SCALE_SMOOTH);
		ImageIcon fondoRed = new ImageIcon(fondoMod);
		JLabel lblFondo = new JLabel(fondoRed);
		lblFondo.setPreferredSize(new Dimension(1366,768));
		
	
		lblFondo.setLayout(new FlowLayout());
		lblFondo.add(panelOrg);
		this.add(lblFondo);
		
		//botón retroceder (<-)
		
		lblContImgn4.addActionListener(new ActionListener() {
				//@Override	
			
				public void actionPerformed(ActionEvent e) {
					System.out.println("Retroceder");
					lblContImgn4.setEnabled(false);

					ventanaContenidoMenu contMenu = new ventanaContenidoMenu();
					contMenu.setVisible(true);
					
					setVisible(false);
				}			
			});		
	
		//botón Guardar (btn Inferior)
		
		guardar.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				guardar.setEnabled(false);

				if (atributo3C.getText().isEmpty() || atributo1C.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Error, existe un campo vacio");

				}else {
				
				String nombre = atributo1C.getText();
				String tipo = (String) atributo5C.getSelectedItem();
				String receta = atributo3C.getText();

			/*	for (int i = 0; i < tabla.getRowCount(); i++) {
					
					boolean confirmacion = (boolean) tabla.getValueAt(i, 2);
					
					if (confirmacion == true) {
						
						String nombreIng = (String) tabla.getValueAt(i, 1);
						listaIngs.add(nombreIng);
					}
					
				}
				
				System.out.println(listaIngs);			*/
				
				
				gestor.altaPlatos(nombre, tipo, receta);
				System.out.println("Plato Altado");
				
				ventanaPlatos plato = new ventanaPlatos();
				plato.setVisible(true);
				
				setVisible(false); 
	
			}	
			}
		});
		
		//botón Usuario
		
		lblContImgn6.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Usuario");
				lblContImgn6.setEnabled(false);

				ventanaCerrarSesion usuario = new ventanaCerrarSesion();
				usuario.setVisible(true);
				
				setVisible(false);

			}			
		});	
		
		//botón Salir
		
		lblContImgn7.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Salir");
				
				ventanaSalir salir = new ventanaSalir();
				salir.setVisible(true);

			}			
		});
		
		//botón seleccionar
		
		atributo4C.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Seleccionar Ingredientes");
				
				panelIng.setVisible(true);
				
				
			}			
		});
		
		

		
	}
	
}
