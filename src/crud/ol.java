package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ol {

	private JFrame frame;
	private JLabel lblColor;
	private JCheckBox chkRojo;
	private JCheckBox chkVerde;
	private JCheckBox chkAzul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ol window = new ol();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ol() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		chkRojo = new JCheckBox("Rojo");
		chkRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkRojo.setBounds(25, 21, 97, 23);
		frame.getContentPane().add(chkRojo);
		
		chkVerde = new JCheckBox("Verde");
		chkVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			asignarColor();
			}
		});
		chkVerde.setBounds(25, 47, 97, 23);
		frame.getContentPane().add(chkVerde);
		
		chkAzul = new JCheckBox("Azul");
		chkAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkAzul.setBounds(25, 73, 97, 23);
		frame.getContentPane().add(chkAzul);
		
		lblColor = new JLabel("New label");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblColor.setBounds(247, 77, 85, 115);
		frame.getContentPane().add(lblColor);
	}
	public void asignarColor() {
		int r=(chkRojo.isSelected())?255:0;
		int g=(chkVerde.isSelected())?255:0;
		int b=(chkAzul.isSelected())?255:0;
		lblColor.setBackground(new Color(r,g,b));
	}

}
