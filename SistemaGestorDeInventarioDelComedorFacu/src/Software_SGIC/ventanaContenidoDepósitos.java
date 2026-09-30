package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
public class ventanaContenidoDepósitos extends JFrame{
	
	
	private String[] columnas = {"Nombre" , "Cantidad" , "Fecha de Vencimiento", "ID"}; //CREAMOS ARRAY HEADER
	
	private DefaultTableModel modelo = new DefaultTableModel(columnas, 0); //CREAMOS EL MODELO DE TABLA Y ESPECIFICAMOS Header Y COLUMNAS
	private JTable tabla = new JTable(modelo); //Creamos la tabla 
	ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();


public ventanaContenidoDepósitos() {
		
		
		this.setTitle("Sistema Gestor de Inventario de Comedor - Contenido Depósito"); 
		this.setSize(1366,768); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false); 
		this.setLayout(new FlowLayout());
		
				
		JPanel panelOrg = new JPanel();
		JPanel panel1 = new JPanel(); //cuadro central
		JPanel panel2 = new JPanel(); //lbl superiores
		JPanel panelSec2 = new JPanel(); //filtros
		JPanel panel3 = new JPanel(); //botones laterales
		JPanel interfazSup = new JPanel(); 
		JPanel titulo = new JPanel();
				
		panelOrg.setLayout(new BorderLayout());;
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());
		titulo.setLayout(new FlowLayout());
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
		interfazSup.setLayout(new BoxLayout(interfazSup,BoxLayout.X_AXIS));
		
		//panel2
		JLabel lblMenus = new JLabel("Contenido Depósito");
		lblMenus.setOpaque(true);
		lblMenus.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenus.setBackground(new Color(40,120,181));
		lblMenus.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblMenus.setPreferredSize(new Dimension(200, 40));
		lblMenus.setForeground(new Color(255,255,255));
		JLabel lblFilt = new JLabel("Filtrando por:");
		lblFilt.setForeground(new Color(255,255,255));
		lblFilt.setFont(new Font("SansSerif", Font.PLAIN, 16));
		JComboBox filtros = new JComboBox();
		filtros.setPreferredSize(new Dimension(100, 40));
		filtros.setBackground(new Color(40,120,181));
		filtros.setForeground(new Color(255,255,255));
		filtros.setPreferredSize(new Dimension(200, 40));
		titulo.add(lblMenus);
		titulo.setBackground(new Color(30,58,95));
		panel2.add(titulo, BorderLayout.WEST);
		panelSec2.add(lblFilt);
		panelSec2.add(filtros);
		panel2.add(panelSec2, BorderLayout.EAST);
		panel2.setBackground(new Color(30,58,95));
		
		
		panel1.add(panel2, BorderLayout.NORTH);	
		
		//panel3
		
		ImageIcon imagen1 = new ImageIcon("1.png");
		Image imagenModificada = imagen1.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado = new ImageIcon(imagenModificada);
		JButton lblContImgn1 = new JButton(iconoRedimensionado);
		lblContImgn1.setPreferredSize(new Dimension(60,60));
		
		ImageIcon imagen2 = new ImageIcon("2.png");
		Image imagenModificada2 = imagen2.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado2 = new ImageIcon(imagenModificada2);
		JButton lblContImgn2 = new JButton(iconoRedimensionado2);
		lblContImgn2.setPreferredSize(new Dimension(60,60));
		
		ImageIcon imagen3 = new ImageIcon("3.png");
		Image imagenModificada3 = imagen3.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado3 = new ImageIcon(imagenModificada3);
		JButton lblContImgn3 = new JButton(iconoRedimensionado3);
		lblContImgn3.setPreferredSize(new Dimension(60,60));
		
		ImageIcon imagen4 = new ImageIcon("4.png");
		Image imagenModificada4 = imagen4.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado4 = new ImageIcon(imagenModificada4);
		JButton lblContImgn4 = new JButton(iconoRedimensionado4);
		lblContImgn4.setPreferredSize(new Dimension(60,60));
		
		ImageIcon imagen5 = new ImageIcon("5.png");
		Image imagenModificada5 = imagen5.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH);
		ImageIcon iconoRedimensionado5 = new ImageIcon(imagenModificada5);
		JButton lblContImgn5 = new JButton(iconoRedimensionado5);
		lblContImgn5.setPreferredSize(new Dimension(60,60));
		
		panel3.add(lblContImgn1);
		panel3.add(lblContImgn2);
		panel3.add(lblContImgn3);
		panel3.add(lblContImgn5);
		panel3.add(lblContImgn4);
				
		panel3.setBackground(new Color(40,120,181));
		panel1.add(panel3, BorderLayout.WEST);
		
		//panel1 
		
		
		
		tabla.setFont(new Font("Arial", Font.PLAIN, 12));
		panel1.add(new JScrollPane(tabla), BorderLayout.CENTER);
		panel1.setPreferredSize(new Dimension(1250, 618));

		
		//interfaz Sup
		
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
		
		JLabel nombreUsu = new JLabel(" Nombre de Usuario ");
		nombreUsu.setPreferredSize(new Dimension(200, 40));
		nombreUsu.setForeground(new Color(255,255,255));
		nombreUsu.setOpaque(true);
		nombreUsu.setBackground(new Color(30,58,95));
		nombreUsu.setFont(new Font("SansSerif",Font.PLAIN, 15));
		nombreUsu.setBorder(new LineBorder(new Color(30,58,95), 4, true));
		
		lblContImgn1.setToolTipText("Ingresar Ingrediente");
		lblContImgn2.setToolTipText("Modificar Ingrediente");
		lblContImgn3.setToolTipText("Eliminar Ingrediente");
		lblContImgn4.setToolTipText("Retroceder");
		lblContImgn5.setToolTipText("Inspeccionar");
		
		lblContImgn6.setToolTipText("Cerrar Sesión");
		lblContImgn7.setToolTipText("Salir");

		interfazSup.add(lblContImgn6);
		interfazSup.add(nombreUsu);
		
		panelOrg.add(panel1, BorderLayout.SOUTH);
		panelOrg.add(interfazSup, BorderLayout.WEST);
		panelOrg.add(lblContImgn7, BorderLayout.EAST);
		panelOrg.setBackground(null);	
		panel1.setBackground(new Color(30,58,95));
		panel2.setBackground(new Color(30,58,95));
		panelSec2.setBackground(new Color(30,58,95));
		panel3.setBackground(new Color(30,58,95));
		interfazSup.setBackground(null);

		interfazSup.setOpaque(false);
		panelOrg.setOpaque(false);
		
		ImageIcon fondo = new ImageIcon("fondo.png");
		Image fondoMod = fondo.getImage().getScaledInstance(1366,768, Image.SCALE_SMOOTH);
		ImageIcon fondoRed = new ImageIcon(fondoMod);
		JLabel lblFondo = new JLabel(fondoRed);
		lblFondo.setPreferredSize(new Dimension(1366,768));
		
		lblFondo.setLayout(new FlowLayout());		
		lblFondo.add(panelOrg);
		
		
		this.add(lblFondo);
		 
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
		
		//botón altar (+)
		
		lblContImgn1.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Altar");
				
				ventanaAltarIngrediente altarIng = new ventanaAltarIngrediente(ventanaContenidoDepósitos.this);
				altarIng.setVisible(true);
				
				

			}			
		});
		
		//botón modificar (lapiz)
		
		lblContImgn2.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Modificar");
				
				ventanaModificarIngrediente ModIng = new ventanaModificarIngrediente();
				ModIng.setVisible(true);
				
				setVisible(false);
			}			
		});
		
		//botón bajar (-)
		
		lblContImgn3.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Bajar");
				
				ventanaBajarIngrediente bajarIng = new ventanaBajarIngrediente();
				bajarIng.setVisible(true);
				
				setVisible(false);

			}			
		});
		
		//botón inspeccionar (lupa)
		
		lblContImgn5.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Inspeccionar");
				
				ventanaInformacionIngrediente infoIng = new ventanaInformacionIngrediente();
				infoIng.setVisible(true);
				
				setVisible(false);

			}			
		});
		
		//botón retroceder (<-)
		
		lblContImgn4.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Retroceder");
				

				ventanaDepósito depositos = new ventanaDepósito();
				depositos.setVisible(true);
				setVisible(false);

				
			}			
		});

	}



	public void recibirIngrediente(String sabor, String tipoMedida, String aptoDiabeticos, String libreGluten, String nombre, double cantidad, String fechaVencimiento, int id, String proovedor) {
		
		
		modelo.addRow(new Object[]{nombre, cantidad+" "+tipoMedida, fechaVencimiento, id, proovedor});
		
		
		
	}
	
	

		
	}






