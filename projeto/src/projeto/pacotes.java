package projeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class pacotes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pacotes window = new pacotes();
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
	public pacotes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1357, 948);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(1012, 114, 319, 731);
		frame.getContentPane().add(panel);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/WhatsApp Image 2024-09-05 at 18.25.01 (1).jpeg")));
		lblNewLabel.setBounds(10, 154, 255, 254);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnPacoteIcapuE = new JTextPane();
		txtpnPacoteIcapuE.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPacoteIcapuE.setText("PACOTE ICAPUÍ E \r\nCANOA QUEBRADA");
		txtpnPacoteIcapuE.setBounds(33, 114, 171, 47);
		frame.getContentPane().add(txtpnPacoteIcapuE);
		JTextPane txtpncomoOcorreFrequentemente = new JTextPane();
		txtpncomoOcorreFrequentemente.setText("“Como ocorre frequentemente em casos de violência sexual envolvendo agressores em posições de poder, essas vítimas enfrentaram dificuldades em obter apoio institucional para a validação de suas denúncias. Diante disso, autorizaram a confirmação do caso para a imprensa”, diz o documento.");
		
		JButton canoa = new JButton("SAIBA MAIS");
		canoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.add(txtpncomoOcorreFrequentemente);
			}
		});
		canoa.setBackground(new Color(175, 175, 216));
		canoa.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/divisa-direita.png")));
		canoa.setBounds(77, 394, 152, 32);
		frame.getContentPane().add(canoa);
		
		JLabel lblNewLabel_1 = new JLabel("NOSSOS PACOTES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(402, 30, 222, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/WhatsApp Image 2024-09-05 at 18.25.02 (1).jpeg")));
		lblNewLabel_2.setBounds(351, 169, 246, 224);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextPane txtpnPacoteTabaparacuruE = new JTextPane();
		txtpnPacoteTabaparacuruE.setText("PACOTE TAÍBA,PARACURU E LAGOINHA");
		txtpnPacoteTabaparacuruE.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPacoteTabaparacuruE.setBounds(374, 114, 202, 47);
		frame.getContentPane().add(txtpnPacoteTabaparacuruE);
		
		JButton btnNewButton_1 = new JButton("SAIBA MAIS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/divisa-direita.png")));
		btnNewButton_1.setBackground(new Color(175, 175, 216));
		btnNewButton_1.setBounds(445, 394, 152, 32);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane txtpnPacoteJericoacoara = new JTextPane();
		txtpnPacoteJericoacoara.setText("PACOTE JERICOACOARA");
		txtpnPacoteJericoacoara.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPacoteJericoacoara.setBounds(735, 114, 202, 47);
		frame.getContentPane().add(txtpnPacoteJericoacoara);
		
		JButton btnNewButton_1_1 = new JButton("SAIBA MAIS");
		btnNewButton_1_1.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/divisa-direita.png")));
		btnNewButton_1_1.setBackground(new Color(175, 175, 216));
		btnNewButton_1_1.setBounds(818, 394, 152, 32);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/WhatsApp Image 2024-09-05 at 18.25.02 (2).jpeg")));
		lblNewLabel_2_1.setBounds(732, 169, 246, 224);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JTextPane txtpnPacoteNatalpipaE = new JTextPane();
		txtpnPacoteNatalpipaE.setText("PACOTE NATAL,PIPA \r\nE PEROBAS");
		txtpnPacoteNatalpipaE.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPacoteNatalpipaE.setBounds(33, 479, 171, 47);
		frame.getContentPane().add(txtpnPacoteNatalpipaE);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/pipa.jpeg")));
		lblNewLabel_3.setBounds(10, 537, 255, 254);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("SAIBA MAIS");
		btnNewButton_2.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/divisa-direita.png")));
		btnNewButton_2.setBackground(new Color(175, 175, 216));
		btnNewButton_2.setBounds(96, 793, 162, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/CARNEIROS.jpeg")));
		lblNewLabel_3_1.setBounds(342, 537, 255, 254);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JTextPane txtpnPacotePortoDe = new JTextPane();
		txtpnPacotePortoDe.setText("PACOTE PORTO DE GALINHAS,\r\nMARAGOGI E CARNEIROS");
		txtpnPacotePortoDe.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPacotePortoDe.setBounds(351, 469, 250, 57);
		frame.getContentPane().add(txtpnPacotePortoDe);
		
		JButton btnNewButton_2_1 = new JButton("SAIBA MAIS");
		btnNewButton_2_1.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/divisa-direita.png")));
		btnNewButton_2_1.setBackground(new Color(175, 175, 216));
		btnNewButton_2_1.setBounds(435, 793, 162, 32);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/WhatsApp Image 2024-09-05 at 18.25.01 (2) (1).jpeg")));
		lblNewLabel_3_1_1.setBounds(715, 537, 255, 254);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_2_1_1 = new JButton("SAIBA MAIS");
		btnNewButton_2_1_1.setIcon(new ImageIcon(pacotes.class.getResource("/projeto/imagens/divisa-direita.png")));
		btnNewButton_2_1_1.setBackground(new Color(175, 175, 216));
		btnNewButton_2_1_1.setBounds(805, 793, 162, 32);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JTextPane txtpnPacoteLenisMaranhenses = new JTextPane();
		txtpnPacoteLenisMaranhenses.setText("PACOTE LENÇÓIS MARANHENSES");
		txtpnPacoteLenisMaranhenses.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPacoteLenisMaranhenses.setBounds(720, 469, 250, 57);
		frame.getContentPane().add(txtpnPacoteLenisMaranhenses);
		
		
		
		
	}
	
}
