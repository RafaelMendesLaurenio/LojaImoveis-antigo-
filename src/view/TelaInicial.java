package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 50, 432, 2);
		contentPane.add(separator);
		
		JLabel lblTelaInicial = new JLabel("Tela Inicial");
		lblTelaInicial.setForeground(new Color(245, 245, 245));
		lblTelaInicial.setBackground(new Color(245, 255, 250));
		lblTelaInicial.setLabelFor(this);
		lblTelaInicial.setFont(new Font("Cambria", Font.BOLD, 19));
		lblTelaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaInicial.setBounds(88, 0, 235, 40);
		contentPane.add(lblTelaInicial);
		
		JButton btnComprador = new JButton("comprar");
		btnComprador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				LoginComprador locom = new LoginComprador();
				locom.setVisible(true);
			}
		});
		btnComprador.setBounds(40, 179, 112, 40);
		contentPane.add(btnComprador);
		
		JButton btnVendedor = new JButton("vender");
		btnVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginVendedor loven = new LoginVendedor();
				loven.setVisible(true);
			}
		});
		btnVendedor.setBounds(269, 179, 112, 40);
		contentPane.add(btnVendedor);
		
		JLabel label = new JLabel("");
		label.setBounds(177, 81, 56, 16);
		contentPane.add(label);
		
		JLabel lblBemVindoEscolha = new JLabel("bem vindo!, escolha uma das op\u00E7oes");
		lblBemVindoEscolha.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindoEscolha.setForeground(new Color(245, 245, 245));
		lblBemVindoEscolha.setFont(new Font("Cambria", Font.BOLD, 14));
		lblBemVindoEscolha.setBackground(new Color(245, 255, 250));
		lblBemVindoEscolha.setBounds(12, 81, 408, 40);
		contentPane.add(lblBemVindoEscolha);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{separator, lblTelaInicial}));
	}
}
