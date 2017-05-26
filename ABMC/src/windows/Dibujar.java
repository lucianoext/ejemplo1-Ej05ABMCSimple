package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Panel;

public class Dibujar extends JFrame {
	int cont=0;	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dibujar frame = new Dibujar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dibujar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCacho = new JLabel("");
		lblCacho.setBounds(62, 79, 300, 14);
		contentPane.add(lblCacho);
	
		JButton btnNoTocar = new JButton("no tocar");
		btnNoTocar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
													
				lblCacho.setText("puto el que lee");}
			
		});
		btnNoTocar.setBounds(62, 120, 326, 23);
		contentPane.add(btnNoTocar);
	}
}
