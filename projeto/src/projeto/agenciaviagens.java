package projeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class agenciaviagens {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agenciaviagens window = new agenciaviagens();
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
	public agenciaviagens() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 618, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("PRECISA DE AJUDA? ");
		btnNewButton.setIcon(new ImageIcon(agenciaviagens.class.getResource("/projeto/imagens/ponto-de-interrogacao.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contato help = new contato ();
				help.visivel();
				frame.dispose();
				
				
			}
		});
		btnNewButton.setBounds(197, 196, 196, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
