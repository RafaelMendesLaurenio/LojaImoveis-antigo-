package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.ImovelDao;
import dto.ImovelDto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaImovelC extends JFrame {

	private JPanel contentPane;
	private JTable tabelaImovel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaImovelC frame = new TelaImovelC();
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
	public TelaImovelC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeImoveis = new JLabel("lista de imoveis \r\n");
		lblListaDeImoveis.setBackground(Color.BLACK);
		lblListaDeImoveis.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeImoveis.setForeground(Color.BLACK);
		lblListaDeImoveis.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblListaDeImoveis.setBounds(106, 13, 227, 25);
		contentPane.add(lblListaDeImoveis);
		
		tabelaImovel = new JTable();
		tabelaImovel.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		tabelaImovel.setColumnSelectionAllowed(true);
		tabelaImovel.setCellSelectionEnabled(true);
		tabelaImovel.setBounds(12, 51, 417, 215);
		contentPane.add(tabelaImovel);
		
		JButton btnPesquisar = new JButton("pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarValores();
			}
		});
		btnPesquisar.setBounds(178, 292, 97, 25);
		contentPane.add(btnPesquisar);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginComprador locom = new LoginComprador();
				locom.setVisible(true);
			}
		});
		btnVoltar.setBounds(323, 292, 97, 25);
		contentPane.add(btnVoltar);
	}
	private void ListarValores() {
		try {
			ImovelDao imodao = new ImovelDao();
			
			DefaultTableModel model = (DefaultTableModel) tabelaImovel.getModel();
			model.setNumRows(0);
			
			ArrayList<ImovelDto> lista = imodao.pesquisarImovel();
			
			for (int num = 0; num < lista.size(); num++) {
				model.addRow(new Object[] {
						lista.get(num).getCd_Imovel(),
						lista.get(num).getBairro(),
						lista.get(num).getCidade(),
						lista.get(num).getEstado(),
						lista.get(num).getEndereco(),
						lista.get(num).getValor()
				});
				}
				
			
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "TelaImovelC--listarValores" + erro);
			
		}
	}
}
