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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroVendedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtendereco;
	private JTextField txtcpf;
	private JTextField txtcidade;
	private JTextField txtbairro;
	private JTextField txtestado;
	private JTextField txttelefone;
	private JTextField txtemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVendedor frame = new CadastroVendedor();
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
	public CadastroVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 515);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDoVendedor = new JLabel("Cadastro do Vendedor");
		lblCadastroDoVendedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDoVendedor.setForeground(new Color(245, 245, 245));
		lblCadastroDoVendedor.setFont(new Font("Cambria", Font.BOLD, 19));
		lblCadastroDoVendedor.setBackground(new Color(245, 255, 250));
		lblCadastroDoVendedor.setBounds(89, 13, 235, 40);
		contentPane.add(lblCadastroDoVendedor);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 66, 450, 10);
		contentPane.add(separator);
		
		JLabel label_1 = new JLabel("nome:");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setForeground(new Color(245, 245, 245));
		label_1.setFont(new Font("Serif", Font.PLAIN, 17));
		label_1.setBounds(42, 89, 56, 16);
		contentPane.add(label_1);
		
		JLabel lblEndereco = new JLabel("endereco:");
		lblEndereco.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEndereco.setForeground(new Color(245, 245, 245));
		lblEndereco.setFont(new Font("Serif", Font.PLAIN, 17));
		lblEndereco.setBounds(12, 133, 86, 16);
		contentPane.add(lblEndereco);
		
		JLabel lblCpf = new JLabel("cpf:");
		lblCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCpf.setForeground(new Color(245, 245, 245));
		lblCpf.setFont(new Font("Serif", Font.PLAIN, 17));
		lblCpf.setBounds(12, 175, 86, 16);
		contentPane.add(lblCpf);
		
		JLabel label_2 = new JLabel("cidade:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setForeground(new Color(245, 245, 245));
		label_2.setFont(new Font("Serif", Font.PLAIN, 17));
		label_2.setBounds(12, 212, 88, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("bairro:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setForeground(new Color(245, 245, 245));
		label_3.setFont(new Font("Serif", Font.PLAIN, 17));
		label_3.setBounds(10, 257, 88, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("estado:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setForeground(new Color(245, 245, 245));
		label_4.setFont(new Font("Serif", Font.PLAIN, 17));
		label_4.setBounds(10, 299, 88, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("telefone:");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setForeground(new Color(245, 245, 245));
		label_5.setFont(new Font("Serif", Font.PLAIN, 17));
		label_5.setBounds(10, 342, 88, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("email:");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setForeground(new Color(245, 245, 245));
		label_6.setFont(new Font("Serif", Font.PLAIN, 17));
		label_6.setBounds(10, 379, 88, 16);
		contentPane.add(label_6);
		
		txtnome = new JTextField();
		txtnome.setColumns(10);
		txtnome.setBounds(110, 89, 303, 22);
		contentPane.add(txtnome);
		
		txtendereco = new JTextField();
		txtendereco.setColumns(10);
		txtendereco.setBounds(110, 132, 303, 22);
		contentPane.add(txtendereco);
		
		txtcpf = new JTextField();
		txtcpf.setColumns(10);
		txtcpf.setBounds(110, 174, 303, 22);
		contentPane.add(txtcpf);
		
		txtcidade = new JTextField();
		txtcidade.setColumns(10);
		txtcidade.setBounds(112, 211, 303, 22);
		contentPane.add(txtcidade);
		
		txtbairro = new JTextField();
		txtbairro.setColumns(10);
		txtbairro.setBounds(110, 256, 303, 22);
		contentPane.add(txtbairro);
		
		txtestado = new JTextField();
		txtestado.setColumns(10);
		txtestado.setBounds(110, 298, 303, 22);
		contentPane.add(txtestado);
		
		txttelefone = new JTextField();
		txttelefone.setColumns(10);
		txttelefone.setBounds(110, 341, 303, 22);
		contentPane.add(txttelefone);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(110, 378, 303, 22);
		contentPane.add(txtemail);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome,endereco,cidade,bairro,estado,telefone,email,cp;
				nome = txtnome.getText();
				endereco = txtendereco.getText();
				cidade = txtcidade.getText();
				bairro = txtbairro.getText();
				estado = txtestado.getText();
				telefone = txttelefone.getText();
				email = txtemail.getText();
				cp = txtcpf.getText();
				int cpf = Integer.parseInt(cp);
				
				VendedorDto vendto = new VendedorDto();
				vendto.setNome(nome);
				vendto.setEndereco(endereco);
				vendto.setCidade(cidade);
				vendto.setEstado(estado);
				vendto.setTelefone(telefone);
				vendto.setEmail(email);
				vendto.setCpf(cpf);
				vendto.setBairro(bairro);
				
				VendedorDao vendao = new VendedorDao();
				vendao.CadastrarVendedor(vendto);
			}
		});
		btnCadastrar.setBounds(180, 430, 97, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginVendedor loven = new LoginVendedor();
				loven.setVisible(true);
			}
		});
		btnVoltar.setBounds(316, 430, 97, 25);
		contentPane.add(btnVoltar);
	}
}
