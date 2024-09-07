package projeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.ImageIcon;
import java.net.URI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class contato {

	private JFrame frame;
	private JTextField textField23;
	private JTextField textField23_1;
	private JTextField textField23_2;
	private JTextField textField23_3;
	private JTextField textField23_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contato window = new contato();
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
	public contato() {
		initialize();
	}
public void visivel () {
	contato window = new contato();
	window.frame.setVisible(true);
}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 957, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nome = new JLabel("NOME");
		nome.setFont(new Font("Tahoma", Font.BOLD, 14));
		nome.setBounds(377, 85, 114, 28);
		frame.getContentPane().add(nome);
		
		textField23 = new JTextField();
		textField23.setBounds(676, 134, 255, 20);
		frame.getContentPane().add(textField23);
		textField23.setColumns(10);
		
		JLabel sobrenome = new JLabel("SOBRENOME");
		sobrenome.setFont(new Font("Tahoma", Font.BOLD, 14));
		sobrenome.setBounds(676, 85, 114, 28);
		frame.getContentPane().add(sobrenome);
		
		textField23_1 = new JTextField();
		textField23_1.setColumns(10);
		textField23_1.setBounds(377, 134, 255, 20);
		frame.getContentPane().add(textField23_1);
		
		JLabel email = new JLabel("EMAIL");
		email.setFont(new Font("Tahoma", Font.BOLD, 14));
		email.setBounds(377, 178, 114, 28);
		frame.getContentPane().add(email);
		
		textField23_2 = new JTextField();
		textField23_2.setColumns(10);
		textField23_2.setBounds(377, 217, 255, 20);
		frame.getContentPane().add(textField23_2);
		
		JLabel telefone = new JLabel("TELEFONE");
		telefone.setFont(new Font("Tahoma", Font.BOLD, 14));
		telefone.setBounds(676, 178, 114, 28);
		frame.getContentPane().add(telefone);
		
		textField23_3 = new JTextField();
		textField23_3.setColumns(10);
		textField23_3.setBounds(676, 217, 255, 20);
		frame.getContentPane().add(textField23_3);
		
		JLabel lblMensagem = new JLabel("MENSAGEM");
		lblMensagem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMensagem.setBounds(377, 259, 114, 28);
		frame.getContentPane().add(lblMensagem);
		
		JLabel lblContato = new JLabel("CONTATO");
		lblContato.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContato.setBounds(562, 40, 114, 28);
		frame.getContentPane().add(lblContato);
		
		textField23_4 = new JTextField();
		textField23_4.setColumns(10);
		textField23_4.setBounds(377, 288, 554, 138);
		frame.getContentPane().add(textField23_4);
		
		JButton btnNewButton = new JButton("ENVIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "World Tur agradece seu contato. Recebemos a sua mensagem e retornaremos em até 48h.");
			}
		});
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBounds(842, 460, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton wpp = new JButton("ENTRE EM CONTATO CONOSCO PELO WHATSAPP");
		wpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    // URL do site para redirecionar
                    String url = "https://api.whatsapp.com/send?phone=5585996702918&text=Olá,%20Gostaria%20de%20falar%20com%20um%20atendente.";

                    // Verifica se o Desktop é suportado e, se for, abre o navegador
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        desktop.browse(new URI(url));
                    } else {
                        System.out.println("Desktop não suportado.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
			}
		});
		wpp.setBackground(new Color(0, 255, 0));
		wpp.setIcon(new ImageIcon(contato.class.getResource("/projeto/imagens/icons8-whatsapp-48.png")));
		wpp.setBounds(463, 521, 382, 49);
		frame.getContentPane().add(wpp);
		
		JLabel lblNewLabel2 = new JLabel("New label");
		lblNewLabel2.setIcon(new ImageIcon(contato.class.getResource("/projeto/imagens/WhatsApp Image 2024-09-04 at 19.04.08.jpeg")));
		lblNewLabel2.setBounds(9, 0, 357, 275);
		frame.getContentPane().add(lblNewLabel2);
		
		JTextPane txtpnCvcBrasilOperadora = new JTextPane();
		txtpnCvcBrasilOperadora.setText("WORLD TUR Brasil Operadora e Agência de Viagens S.A \r\nCNPJ:10.760.260/0001-19\r\nAV.Desembargador Moreira, 227, 11 andar, sala 111 \r\nBairro Aldeota, Fortaleza- CE\r\nCEP: 60170-002");
		txtpnCvcBrasilOperadora.setBounds(611, 581, 330, 98);
		frame.getContentPane().add(txtpnCvcBrasilOperadora);
		
		JTextPane txtpnSegundaSbado = new JTextPane();
		txtpnSegundaSbado.setText("Segunda à Sábado: 08h às 21h\r\n\r\nRemarcação de viagens");
		txtpnSegundaSbado.setBounds(9, 369, 188, 57);
		frame.getContentPane().add(txtpnSegundaSbado);
		
		JButton btnNewButton_1_1 = new JButton("Central de relacionamento ao cliente (85)99796-1409");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(5, 432, 303, 40);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Suporte Pós Venda (85)99686-2704");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_1_1.setBounds(6, 330, 302, 40);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JTextPane txtpnSegundaSexta = new JTextPane();
		txtpnSegundaSexta.setText("Segunda à Sexta: 08h às 21h\r\n\r\nSábado e Feriados: 08h às 16h\r\n\r\n");
		txtpnSegundaSexta.setBounds(8, 476, 188, 57);
		frame.getContentPane().add(txtpnSegundaSexta);
		
		JLabel lblNewLabel2_1 = new JLabel("CENTRAL DE ATENDIMENTO");
		lblNewLabel2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel2_1.setBounds(74, 294, 215, 14);
		frame.getContentPane().add(lblNewLabel2_1);
		
		JLabel lblNewLabel2_1_1 = new JLabel("Siga ofertas nas redes");
		lblNewLabel2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel2_1_1.setBounds(110, 539, 215, 28);
		frame.getContentPane().add(lblNewLabel2_1_1);
		
		JButton insta = new JButton("");
		insta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    // URL do site para redirecionar
                    String url = "https://www.instagram.com/";

                    // Verifica se o Desktop é suportado e, se for, abre o navegador
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        desktop.browse(new URI(url));
                    } else {
                        System.out.println("Desktop não suportado.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
				
			}
		});
		insta.setIcon(new ImageIcon(contato.class.getResource("/projeto/imagens/instagram.png")));
		insta.setBackground(new Color(255, 255, 255));
		insta.setBounds(48, 578, 65, 57);
		frame.getContentPane().add(insta);
		
		JButton facebook = new JButton("");
		facebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    // URL do site para redirecionar
                    String url = "https://pt-br.facebook.com/";

                    // Verifica se o Desktop é suportado e, se for, abre o navegador
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        desktop.browse(new URI(url));
                    } else {
                        System.out.println("Desktop não suportado.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
			}
		});
		facebook.setIcon(new ImageIcon(contato.class.getResource("/projeto/imagens/facebook.png")));
		facebook.setBackground(new Color(255, 255, 255));
		facebook.setBounds(163, 578, 69, 57);
		frame.getContentPane().add(facebook);
		
		JButton wpp_2_1 = new JButton("");
		wpp_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    // URL do site para redirecionar
                    String url = "https://www.tripadvisor.com.br/";

                    // Verifica se o Desktop é suportado e, se for, abre o navegador
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();
                        desktop.browse(new URI(url));
                    } else {
                        System.out.println("Desktop não suportado.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
			}
		});
		wpp_2_1.setIcon(new ImageIcon(contato.class.getResource("/projeto/imagens/tripadvisor.png")));
		wpp_2_1.setBackground(new Color(255, 255, 255));
		wpp_2_1.setBounds(284, 578, 69, 57);
		frame.getContentPane().add(wpp_2_1);
	}
}
