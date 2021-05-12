package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.CompradorDao;
import dto.CompradorDto;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroComprador extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtendereco;
	private JTextField txtcidade;
	private JTextField txtbairro;
	private JTextField txtestado;
	private JTextField txttelefone;
	private JTextField txtemail;
	private JTextField txtcpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroComprador frame = new CadastroComprador();
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
	public CadastroComprador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 52, 450, 10);
		contentPane.add(separator);
		
		JLabel lblCadastroDoComprador = new JLabel("Cadastro do Comprador");
		lblCadastroDoComprador.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDoComprador.setForeground(new Color(245, 245, 245));
		lblCadastroDoComprador.setFont(new Font("Cambria", Font.BOLD, 19));
		lblCadastroDoComprador.setBackground(new Color(245, 255, 250));
		lblCadastroDoComprador.setBounds(89, -1, 235, 40);
		contentPane.add(lblCadastroDoComprador);
		
		JLabel lblNome = new JLabel("nome:");
		lblNome.setFont(new Font("Serif", Font.PLAIN, 17));
		lblNome.setForeground(new Color(245, 245, 245));
		lblNome.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNome.setBounds(31, 75, 56, 16);
		contentPane.add(lblNome);
		
		JLabel lblEndereco = new JLabel("endereco:");
		lblEndereco.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEndereco.setForeground(new Color(245, 245, 245));
		lblEndereco.setFont(new Font("Serif", Font.PLAIN, 17));
		lblEndereco.setBounds(0, 117, 88, 16);
		contentPane.add(lblEndereco);
		
		JLabel lblCidade = new JLabel("cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCidade.setForeground(new Color(245, 245, 245));
		lblCidade.setFont(new Font("Serif", Font.PLAIN, 17));
		lblCidade.setBounds(-1, 159, 88, 16);
		contentPane.add(lblCidade);
		
		JLabel lblBairro = new JLabel("bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBairro.setForeground(new Color(245, 245, 245));
		lblBairro.setFont(new Font("Serif", Font.PLAIN, 17));
		lblBairro.setBounds(0, 199, 88, 16);
		contentPane.add(lblBairro);
		
		JLabel lblEstado = new JLabel("estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEstado.setForeground(new Color(245, 245, 245));
		lblEstado.setFont(new Font("Serif", Font.PLAIN, 17));
		lblEstado.setBounds(0, 240, 88, 16);
		contentPane.add(lblEstado);
		
		JLabel lblTelefone = new JLabel("telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTelefone.setForeground(new Color(245, 245, 245));
		lblTelefone.setFont(new Font("Serif", Font.PLAIN, 17));
		lblTelefone.setBounds(0, 282, 88, 16);
		contentPane.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("email:");
		lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmail.setForeground(new Color(245, 245, 245));
		lblEmail.setFont(new Font("Serif", Font.PLAIN, 17));
		lblEmail.setBounds(0, 324, 88, 16);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("cpf:");
		lblCpf.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCpf.setForeground(new Color(245, 245, 245));
		lblCpf.setFont(new Font("Serif", Font.PLAIN, 17));
		lblCpf.setBounds(0, 364, 88, 16);
		contentPane.add(lblCpf);
		
		txtnome = new JTextField();
		txtnome.setBounds(99, 74, 303, 22);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtendereco = new JTextField();
		txtendereco.setColumns(10);
		txtendereco.setBounds(99, 116, 303, 22);
		contentPane.add(txtendereco);
		
		txtcidade = new JTextField();
		txtcidade.setColumns(10);
		txtcidade.setBounds(99, 158, 303, 22);
		contentPane.add(txtcidade);
		
		txtbairro = new JTextField();
		txtbairro.setColumns(10);
		txtbairro.setBounds(99, 198, 303, 22);
		contentPane.add(txtbairro);
		
		txtestado = new JTextField();
		txtestado.setColumns(10);
		txtestado.setBounds(99, 239, 303, 22);
		contentPane.add(txtestado);
		
		txttelefone = new JTextField();
		txttelefone.setColumns(10);
		txttelefone.setBounds(99, 281, 303, 22);
		contentPane.add(txttelefone);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		txtemail.setBounds(99, 323, 303, 22);
		contentPane.add(txtemail);
		
		txtcpf = new JTextField();
		txtcpf.setColumns(10);
		txtcpf.setBounds(99, 363, 303, 22);
		contentPane.add(txtcpf);
		
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
				
				CompradorDto comdto = new CompradorDto();
				comdto.setNome(nome);
				comdto.setEndereco(endereco);
				comdto.setCidade(cidade);
				comdto.setEstado(estado);
				comdto.setTelefone(telefone);
				comdto.setEmail(email);
				comdto.setCpf(cpf);
				comdto.setBairro(bairro);
				
				CompradorDao comdao = new CompradorDao();
				comdao.CadastrarComprador(comdto);
			}
		});
		btnCadastrar.setBounds(180, 409, 97, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginComprador locom = new LoginComprador();
				locom.setVisible(true);
			}
		});
		btnVoltar.setBounds(305, 409, 97, 25);
		contentPane.add(btnVoltar);
	}
}
