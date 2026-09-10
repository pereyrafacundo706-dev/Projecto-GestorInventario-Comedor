package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class ventanaSalir extends JFrame{
	
	public ventanaSalir() {
		
		this.setTitle("SGIC - Salir"); 
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
		
		panel2.setLayout(new GridLayout(1, 2));
		panelSubOrg.setLayout(new BorderLayout());
		panelOrg.setLayout(new BorderLayout());
		
		JLabel textoSup = new JLabel("¿Está seguro de que desea salir?");
		textoSup.setPreferredSize(new Dimension(250, 160));
		textoSup.setForeground(new Color(30,58,95));
		textoSup.setOpaque(true);
		textoSup.setBackground(new Color(255,255,255));
		textoSup.setBorder(new LineBorder(new Color(255,255,255), 5, true));
		textoSup.setFont(new Font("SansSerif",Font.PLAIN, 15));
		textoSup.setHorizontalAlignment(SwingConstants.CENTER);


		JButton botonSi = new JButton("Salir");
		botonSi.setPreferredSize(new Dimension(80, 40));
		botonSi.setBackground(new Color(246, 80, 80));
		botonSi.setForeground(new Color (30,58,95));
		botonSi.setFont(new Font("SansSerif",Font.BOLD, 15));
		botonSi.setBorder(new LineBorder(new Color(244, 132, 132), 3, true));
		
		JButton botonNo = new JButton("Volver");
		botonNo.setPreferredSize(new Dimension(80, 40));
		botonNo.setBackground(new Color(229, 209, 104));
		botonNo.setForeground(new Color (30,58,95));
		botonNo.setFont(new Font("SansSerif",Font.BOLD, 15));
		botonNo.setBorder(new LineBorder(new Color(164, 156, 112), 3, true));
		
		panel1.add(textoSup);
		panel2.add(botonSi,0);
		panel2.add(botonNo,1);

		panelSubOrg.add(panel1, BorderLayout.NORTH);
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
		
		botonSi.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cerrar");
				
				System.exit(0);
			}			
		});
		
		botonNo.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				System.out.println("Permanecer");
				
				setVisible(false);

			}			
		});

	}

}
