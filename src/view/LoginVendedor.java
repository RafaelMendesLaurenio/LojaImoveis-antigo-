package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.CompradorDao;
import dao.VendedorDao;
import dto.CompradorDto;
import dto.VendedorDto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginVendedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginVendedor frame = new LoginVendedor();
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
	public LoginVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Tela de Login");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial Black", Font.PLAIN, 17));
		label.setBounds(92, 13, 227, 25);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("digite seu cpf");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(12, 54, 113, 16);
		contentPane.add(label_1);
		
		txtcpf = new JTextField();
		txtcpf.setColumns(10);
		txtcpf.setBounds(134, 51, 185, 22);
		contentPane.add(txtcpf);
		
		JButton btnEntrar = new JButton("entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String cp;
					cp = txtcpf.getText();
					int cpf = Integer.parseInt(cp);
					VendedorDto vendto = new VendedorDto();
					vendto.setCpf(cpf);
					
					VendedorDao vendao = new VendedorDao();
					ResultSet rsVendedorDao = vendao.AutenticarVendedor(vendto);
					
					if (rsVendedorDao.next()) {
						dispose();
						TelaImovelV TIV = new TelaImovelV();
						TIV.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "cpf não cadastrado");
					}
					
				} catch (SQLException erro) {
					JOptionPane.showMessageDialog(null, "LoginVendedor" + erro);
				}
			}
			
		});
		btnEntrar.setBounds(331, 50, 97, 25);
		contentPane.add(btnEntrar);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CadastroVendedor cadven = new CadastroVendedor();
				cadven.setVisible(true);
			}
		});
		btnCadastrar.setBounds(165, 215, 97, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaInicial loven = new TelaInicial();
				loven.setVisible(true);
			}
		});
		btnVoltar.setBounds(323, 215, 97, 25);
		contentPane.add(btnVoltar);
	}
}
