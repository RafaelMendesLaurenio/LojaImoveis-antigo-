package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import dto.CompradorDto;
import dto.VendedorDto;

public class VendedorDao {
	Connection conn;
	PreparedStatement pstm;	
	public void CadastrarVendedor(VendedorDto vendto) {
		String sql = "insert into vendedor (nome,endereco,cidade,bairro,estado,telefone,email,cpf) values (?,?,?,?,?,?,?,?)";
		conn = new ConexaoDao().conectaBD();
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,vendto.getNome());
			pstm.setString(2, vendto.getEndereco());
			pstm.setString(3, vendto.getCidade());
			pstm.setString(4, vendto.getBairro());
			pstm.setString(5, vendto.getEstado());
			pstm.setString(6, vendto.getTelefone());
			pstm.setString(7, vendto.getEmail());
			pstm.setInt(8, vendto.getCpf());
			
			pstm.execute();
			pstm.close();
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "VendedorDao" + erro);
		}
	}
	public ResultSet AutenticarVendedor(VendedorDto vendto) {
		conn = new ConexaoDao().conectaBD();
		try {
			String sql = "select * from vendedor where cpf = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, vendto.getCpf());
			ResultSet rs = pstm.executeQuery();
			return rs;
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "VendedorDao" + erro);
			return null;
		}
	}
}
