package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class ventanaInspeccionar extends JFrame{
	
	public ventanaInspeccionar(String elemento) {
		
		this.setTitle("SGIC - Inspeccionar"); 
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
		panel1.setLayout(new GridLayout(2,2));
		panelSub1.setLayout(new BorderLayout());
		
		JLabel textoSup = new JLabel("Seleccionar ID del elemento");
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
		
		JLabel idlbl = new JLabel("ID: ");
		idlbl.setFont(new Font("SansSerif",Font.BOLD, 14));
		idlbl.setPreferredSize(new Dimension(60, 30));
		JLabel confidlbl = new JLabel("Confirmar ID: ");
		confidlbl.setFont(new Font("SansSerif",Font.BOLD, 14));
		confidlbl.setPreferredSize(new Dimension(60, 30));
				
		JTextField idtxt = new JTextField();
		idtxt.setPreferredSize(new Dimension(60, 30));
		idtxt.setBackground(new Color(40, 120, 181));
		idtxt.setForeground(new Color (255,255,255));
		idtxt.setFont(new Font("SansSerif",Font.BOLD, 14));
		idtxt.setBorder(new LineBorder(new Color(255,255,255), 1, true));
		JTextField confidtxt = new JTextField();
		confidtxt.setPreferredSize(new Dimension(60, 30));
		confidtxt.setBackground(new Color(40, 120, 181));
		confidtxt.setForeground(new Color (255,255,255));
		confidtxt.setFont(new Font("SansSerif",Font.BOLD, 14));
		confidtxt.setBorder(new LineBorder(new Color(255,255,255), 1, true));
		
		panel1.add(idlbl);
		panel1.add(idtxt);
		panel1.add(confidlbl);
		panel1.add(confidtxt);
		
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
				
				if (idtxt.getText().isEmpty() || confidtxt.getText().isEmpty()) {
					
					textoSup.setText("Error, existe un campo vacío");

				}else {
					
					if (idtxt.getText().equals(confidtxt.getText())) {
						
						//comprobar que el id exista 
						textoSup.setText("Inspeccionando");
						
						int id = Integer.valueOf(idtxt.getText());
						inspeccionar(elemento, id);

					}else {
												
						textoSup.setText("Error, los ID ingresados no coinciden");

					}
				}
			}			
		});
		
	}

	public void inspeccionar(String elemento, int id) {
		
		
	}
}