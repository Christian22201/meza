package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cruk {
	
	private JFrame frmcheckrgb;
	private JLabel lblColor;
	private JCheckBox frmcheckrgb;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cruk window = new cruk();
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
	public cruk() {
		initialize();
	}
	public void asignarColor() {
		int r=0,g=0,b=0;
	  int r=(chkRojo.isSelected())?255:0;
	  int g=(chkVerde.isSelected())?255:0;
	  int b=(chkAzul.isSelected())?255:0;
	  lbl
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chkRojo = new JCheckBox("Rojo");
		chkRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkRojo.setBounds(6, 69, 97, 23);
		frame.getContentPane().add(chkRojo);
		
		JCheckBox chkVerde = new JCheckBox("Verde");
		chkVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkVerde.setBounds(6, 95, 97, 23);
		frame.getContentPane().add(chkVerde);
		
		JCheckBox chkAzul = new JCheckBox("Azul");
		chkAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor();
			}
		});
		chkAzul.setBounds(6, 121, 97, 23);
		frame.getContentPane().add(chkAzul);
		
		JLabel lblColor = new JLabel("New label");
		lblColor.setBounds(168, 11, 235, 213);
		frame.getContentPane().add(lblColor);
	}
}
