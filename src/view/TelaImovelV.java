package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.CompradorDao;
import dao.ImovelDao;
import dto.CompradorDto;
import dto.ImovelDto;

import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaImovelV extends JFrame {

	private JPanel a;
	private JTextField txtbairro;
	private JTextField txtcidade;
	private JTextField txtestado;
	private JTextField txtendereco;
	private JTextField txtvalor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaImovelV frame = new TelaImovelV();
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
	public TelaImovelV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 334);
		a = new JPanel();
		a.setBackground(Color.BLACK);
		a.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(a);
		a.setLayout(null);
		
		JLabel lblCadastrarImovel = new JLabel("cadastrar Imovel\r\n");
		lblCadastrarImovel.setBounds(108, 13, 227, 25);
		lblCadastrarImovel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrarImovel.setForeground(Color.WHITE);
		lblCadastrarImovel.setFont(new Font("Arial Black", Font.PLAIN, 17));
		a.add(lblCadastrarImovel);
		
		JLabel lblBairro = new JLabel("bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBairro.setForeground(Color.WHITE);
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBairro.setBounds(67, 55, 56, 16);
		a.add(lblBairro);
		
		JLabel lblCidade = new JLabel("cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCidade.setForeground(Color.WHITE);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCidade.setBounds(67, 95, 56, 16);
		a.add(lblCidade);
		
		JLabel lblEstado = new JLabel("estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEstado.setForeground(Color.WHITE);
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEstado.setBounds(67, 135, 56, 16);
		a.add(lblEstado);
		
		JLabel lblEndereco = new JLabel("endereco:");
		lblEndereco.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEndereco.setForeground(Color.WHITE);
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEndereco.setBounds(51, 170, 73, 16);
		a.add(lblEndereco);
		
		JLabel lblValor = new JLabel("valor:");
		lblValor.setHorizontalAlignment(SwingConstants.TRAILING);
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblValor.setBounds(67, 205, 56, 16);
		a.add(lblValor);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String endereco,cidade,bairro,estado,val;
				endereco = txtendereco.getText();
				cidade = txtcidade.getText();
				bairro = txtbairro.getText();
				estado = txtestado.getText();
			    val = txtvalor.getText();
				int valor = Integer.parseInt(val);
				
				ImovelDto imodto = new ImovelDto();
				imodto.setEndereco(endereco);
				imodto.setCidade(cidade);
				imodto.setEstado(estado);
				imodto.setBairro(bairro);
				imodto.setValor(valor);
				
				ImovelDao imodao = new ImovelDao();
				imodao.CadastrarImovel(imodto);
			}
		});
		btnCadastrar.setBounds(177, 251, 97, 25);
		a.add(btnCadastrar);
		
		txtbairro = new JTextField();
		txtbairro.setBounds(135, 52, 183, 22);
		a.add(txtbairro);
		txtbairro.setColumns(10);
		
		txtcidade = new JTextField();
		txtcidade.setColumns(10);
		txtcidade.setBounds(135, 92, 183, 22);
		a.add(txtcidade);
		
		txtestado = new JTextField();
		txtestado.setColumns(10);
		txtestado.setBounds(135, 132, 183, 22);
		a.add(txtestado);
		
		txtendereco = new JTextField();
		txtendereco.setColumns(10);
		txtendereco.setBounds(135, 167, 183, 22);
		a.add(txtendereco);
		
		txtvalor = new JTextField();
		txtvalor.setColumns(10);
		txtvalor.setBounds(135, 202, 183, 22);
		a.add(txtvalor);
		
		JButton btnNewButton = new JButton("voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginVendedor loven = new LoginVendedor();
				loven.setVisible(true);
			}
		});
		btnNewButton.setBounds(323, 251, 97, 25);
		a.add(btnNewButton);
	}
}
