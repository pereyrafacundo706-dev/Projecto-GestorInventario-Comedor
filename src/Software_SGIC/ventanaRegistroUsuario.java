package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class ventanaRegistroUsuario extends JFrame{
	
	public ventanaRegistroUsuario() {
		
		this.setTitle("SGIC - Registro Usuario"); 
		this.setSize(300,275); 
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false); 
		this.setBackground(new Color(255,255,255));
		this.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panelSubOrg = new JPanel();
		JPanel panelOrg = new JPanel();
		JPanel panelSub1 = new JPanel();
		
		panelSubOrg.setLayout(new BorderLayout());
		panelOrg.setLayout(new BorderLayout());
		panel1.setLayout(new GridLayout(3,2));
		panelSub1.setLayout(new BorderLayout());
		
		JLabel textoSup = new JLabel("Registrar nuevo usuario");
		textoSup.setForeground(new Color(30,58,95));
		textoSup.setPreferredSize(new Dimension(250, 40));
		textoSup.setOpaque(true);
		textoSup.setBackground(new Color(255,255,255));
		textoSup.setBorder(new LineBorder(new Color(255,255,255), 5, true));
		textoSup.setFont(new Font("SansSerif",Font.PLAIN, 14));
		textoSup.setHorizontalAlignment(SwingConstants.CENTER);

		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.setPreferredSize(new Dimension(80, 40));
		botonGuardar.setBackground(new Color(255,255,255));
		botonGuardar.setForeground(new Color (30,58,95));
		botonGuardar.setFont(new Font("SansSerif",Font.BOLD, 15));
		botonGuardar.setBorder(new LineBorder(new Color(30, 58, 95), 3, true));
		
		JLabel nombrelbl = new JLabel("Nombre: ");
		nombrelbl.setFont(new Font("SansSerif",Font.BOLD, 14));
		nombrelbl.setPreferredSize(new Dimension(60, 30));
		JLabel contlbl = new JLabel("Contraseña: ");
		contlbl.setFont(new Font("SansSerif",Font.BOLD, 14));
		contlbl.setPreferredSize(new Dimension(60, 30));
		JLabel contconflbl = new JLabel("Confirmar:");
		contconflbl.setFont(new Font("SansSerif",Font.BOLD, 14));
		contconflbl.setPreferredSize(new Dimension(60, 30));
		
		JTextField nombretxt = new JTextField();
		nombretxt.setPreferredSize(new Dimension(60, 30));
		nombretxt.setBackground(new Color(40, 120, 181));
		nombretxt.setForeground(new Color (255,255,255));
		nombretxt.setFont(new Font("SansSerif",Font.BOLD, 14));
		nombretxt.setBorder(new LineBorder(new Color(255,255,255), 1, true));
		JTextField conttxt = new JTextField();
		conttxt.setPreferredSize(new Dimension(60, 30));
		conttxt.setBackground(new Color(40, 120, 181));
		conttxt.setForeground(new Color (255,255,255));
		conttxt.setFont(new Font("SansSerif",Font.BOLD, 14));
		conttxt.setBorder(new LineBorder(new Color(255,255,255), 1, true));
		JTextField conftxt = new JTextField();
		conftxt.setPreferredSize(new Dimension(60, 30));
		conftxt.setBackground(new Color(40, 120, 181));
		conftxt.setForeground(new Color (255,255,255));
		conftxt.setFont(new Font("SansSerif",Font.BOLD, 14));
		conftxt.setBorder(new LineBorder(new Color(255,255,255), 1, true));
		
		panel1.add(nombrelbl);
		panel1.add(nombretxt);
		panel1.add(contlbl);
		panel1.add(conttxt);
		panel1.add(contconflbl);
		panel1.add(conftxt);
		
		panelSub1.add(textoSup, BorderLayout.NORTH);
		panelSub1.add(panel1, BorderLayout.SOUTH);
		panel2.add(botonGuardar);
		panelSubOrg.add(panelSub1, BorderLayout.NORTH);
		panelSubOrg.add(panel2, BorderLayout.SOUTH);
		
		panelOrg.add(panelSubOrg, BorderLayout.CENTER);
		
		ImageIcon fondo = new ImageIcon("8.png");
		Image fondoMod = fondo.getImage().getScaledInstance(300,300, Image.SCALE_SMOOTH);
		ImageIcon fondoRed = new ImageIcon(fondoMod);
		JLabel lblFondo = new JLabel(fondoRed);
		lblFondo.setPreferredSize(new Dimension(300,300));
		
		lblFondo.setLayout(new FlowLayout());		
		lblFondo.add(panelOrg);
		
				
		this.add(lblFondo);
		
		botonGuardar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (nombretxt.getText().isEmpty() || conttxt.getText().isEmpty() || conftxt.getText().isEmpty()) {
					
					textoSup.setText("Error, existe un campo vacío");

				}else {
					
					if (conttxt.getText().equals(conftxt.getText())) {
						
						//comprobar que no haya un usuario con el mismo nombre
						textoSup.setText("Usuario registrado");

					}else {
												
						textoSup.setText("Error, las contraseñas no coinciden");

					}
				}
			}			
		});
		

	}

}
