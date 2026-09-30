package Software_SGIC;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
public class ventanaSelecPlatos extends JFrame{
	
	
	
	public ventanaSelecPlatos(){
		
		this.setTitle("Sistema Gestor de Inventario de Comedor - Prueba Menu"); 
		this.setSize(600, 400); 
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false); 
		this.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		
		String[] columnas = { "ID", "Plato","Selección"};

		DefaultTableModel tabla = new DefaultTableModel(columnas, 0) {
		    
		    @Override
		    public Class<?> getColumnClass(int columnIndex) {
		        if (columnIndex == 2) {
		            return Boolean.class;
		        }
		        return String.class;
		    }

		    @Override
		    public boolean isCellEditable(int row, int column) {
		      
		        return column >= 2; 
		    }
		};
		
		tabla.addRow(new Object[] {"123","Ing", false}); //Ponemos las filas

		
		JTable tablita = new JTable(tabla);
		tablita.setFont(new Font("Arial", Font.PLAIN, 12));
		JScrollPane scroll = new JScrollPane(tablita);
		panel1.add(scroll, BorderLayout.NORTH);
		
		scroll.setPreferredSize(new Dimension(600,300));
		
		JButton guardar = new JButton("Confirmar");
		guardar.setPreferredSize(new Dimension(100, 50));
		guardar.setForeground(new Color(255,255,255));
		guardar.setOpaque(true);
		guardar.setBackground(new Color(40, 120, 181));
		guardar.setFont(new Font("SansSerif",Font.BOLD, 15));
		guardar.setHorizontalAlignment(SwingConstants.CENTER);
		guardar.setBorder(new LineBorder(new Color(229, 209, 104), 3, true));
		
		panel1.add(guardar, BorderLayout.SOUTH);

		this.add(panel1);
		
		guardar.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
				//comprobar cantidad selec < cantidad total
				//comprobar selección y demás

			}			
		});
		
	}
}

