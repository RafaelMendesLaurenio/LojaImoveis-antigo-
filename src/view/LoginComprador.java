package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.CompradorDao;
import dto.CompradorDto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginComprador extends JFrame {

	private JPanel contentPane;
	private JTextField txtcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginComprador frame = new LoginComprador();
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
	public LoginComprador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tela de Login");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(98, 13, 227, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblDigiteSeuCpf = new JLabel("digite seu cpf");
		lblDigiteSeuCpf.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDigiteSeuCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDigiteSeuCpf.setForeground(Color.WHITE);
		lblDigiteSeuCpf.setBounds(0, 58, 113, 16);
		contentPane.add(lblDigiteSeuCpf);
		
		txtcpf = new JTextField();
		txtcpf.setBounds(125, 58, 185, 22);
		contentPane.add(txtcpf);
		txtcpf.setColumns(10);
		
		JButton btnEntrar = new JButton("entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String cp;
					cp = txtcpf.getText();
					int cpf = Integer.parseInt(cp);
					CompradorDto comdto = new CompradorDto();
					comdto.setCpf(cpf);
					
					CompradorDao comdao = new CompradorDao();
					ResultSet rsCompradorDao = comdao.AutenticarComprador(comdto);
					
					if (rsCompradorDao.next()) {
						dispose();
						TelaImovelC TIC = new TelaImovelC();
						TIC.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "cpf não cadastrado");
					}
					
				} catch (SQLException erro) {
					JOptionPane.showMessageDialog(null, "LoginComprador" + erro);
				}
			}
		});
		btnEntrar.setBounds(322, 54, 97, 25);
		contentPane.add(btnEntrar);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CadastroComprador cadcom = new CadastroComprador();
				cadcom.setVisible(true);
			}
		});
		btnCadastrar.setBounds(141, 215, 97, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				TelaInicial telini = new TelaInicial();
				telini.setVisible(true);
			}
		});
		btnVoltar.setBounds(322, 215, 97, 25);
		contentPane.add(btnVoltar);
	}
}
